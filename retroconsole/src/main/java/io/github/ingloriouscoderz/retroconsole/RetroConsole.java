package io.github.ingloriouscoderz.retroconsole;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RetroConsole {
	private Console console;
	private char[][] screen;
	private Private privateHelpers;
	
	private class Private {
		Fields fields;
		Methods methods;
		
		private class Fields {
			private Field screenField;
			
			private Field getPublicVersionOfField(Object obj, String fieldName) {
				Field field = null;
				
				try {
					field = obj.getClass().getDeclaredField(fieldName);
					field.setAccessible(true);
				} catch (NoSuchFieldException e1) {
					e1.printStackTrace();
				} catch (SecurityException e1) {
					e1.printStackTrace();
				} catch (IllegalArgumentException e1) {
					e1.printStackTrace();
				} 
				return field;
			}
			
			private void setPrivateFieldValue(Object object, Field field, Object value) {
				try {
					field.set(object, value);
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
			
			private <R> R getPrivateFieldValue(Object object, Field field) {
				R result = null;
				
				try {
					result = (R) field.get(object);
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
				
				return result;
			}
			
			private void initPrivateFields() {
				screenField = getPublicVersionOfField(console, "screen");
			}
//			private void setScreenField(char [][] buffer) {
//				try {
//					screenField = console.getClass().getDeclaredField("screen");
//					screenField.setAccessible(true);
//					screenField.set(console, buffer);
//				} catch (NoSuchFieldException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				} catch (SecurityException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				} catch (IllegalArgumentException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				} catch (IllegalAccessException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//			}
			
//			private char [][] getScreenField() {
//				try {
//					return (char[][]) screenField.get(console);
//				} catch (IllegalArgumentException e) {
//					e.printStackTrace();
//				} catch (IllegalAccessException e) {
//					e.printStackTrace();
//				}
//				return null;
//			}
		}
		
		private class Methods {
			private Method printPrompt;
			private Method readDouble;
			private Method readInt;
			private Method readLine;
			private Method readLine_String;

			private <R,P> R invokePrivateMethod(Method method, P... params) {
				R value = null;
				try {
					value = (R)readLine_String.invoke(console, params);
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
				return value;
			}

			private void initPrivateMethods() {
				try {
//					Class[] params = {String.class};
//					Class[] noparams = {null};
					printPrompt = console.getClass().getDeclaredMethod("printPrompt", String.class);
					printPrompt.setAccessible(true);

					readDouble = console.getClass().getDeclaredMethod("readDouble", String.class);
					readDouble.setAccessible(true);

					readInt = console.getClass().getDeclaredMethod("readInt", String.class);
					readInt.setAccessible(true);

					readLine = console.getClass().getDeclaredMethod("readLine");
					readLine.setAccessible(true);

					readLine_String = console.getClass().getDeclaredMethod("readLine");
					readLine_String.setAccessible(true);
				} catch (NoSuchMethodException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				}
			}
		}
		
		private Private() {
			fields = new RetroConsole.Private.Fields();
			methods = new RetroConsole.Private.Methods();
		}
		
	}
		
	
	
	public RetroConsole() {
		// find a way to change finals ROWS COLS variables
		console = new Console();
		privateHelpers = new Private();
		privateHelpers.methods.initPrivateMethods();
		privateHelpers.fields.initPrivateFields();
		setScreen(new char[console.ROWS+1][console.COLS-1]);
		screen=getScreen();
	}

	public void printPrompt(String prompt) {
		privateHelpers.methods.invokePrivateMethod(privateHelpers.methods.printPrompt, prompt);
	}
	
	public double readDouble(String prompt) {
		double value = 0;
		value = privateHelpers.methods.invokePrivateMethod(privateHelpers.methods.readDouble, prompt);
		return value;
	}
	
	public int readInt(String prompt) {
		int value = 0;
		value = privateHelpers.methods.invokePrivateMethod(privateHelpers.methods.readDouble, prompt);
		return value;
	}
	
	public String readLine() {
		String value = "";
		value = privateHelpers.methods.invokePrivateMethod(privateHelpers.methods.readLine);
		return value;
	}
	
	public String readLine(String prompt) {
		String value = "";
		value = privateHelpers.methods.invokePrivateMethod(privateHelpers.methods.readLine_String, prompt);
		return value;
	}

	public void initScreen() {
		//console.initScreen();
		for (int row=0; row<console.ROWS; row++) {
			String lineno = String.format("%02d", row);
			screen[row][0] = lineno.toCharArray()[0];
			screen[row][1] = lineno.toCharArray()[1];
		}
	}

	public void printScreen() {
		//console.printScreen();
		for (int row = 0; row < console.ROWS+1; row++) {
			String line = "";
			for (int col=0; col< console.COLS-1; col++) {
				line += screen[row][col];
			}
			System.out.println(line);
		}

	}

	public void clearScreen() {
		initScreen();
		printScreen();
	}

	public void putCharAt(char c, int row, int col) {
		console.putCharAt(c, row, col);
	}

	public void putChar(char c) {
		console.putChar(c);
	}

	public void putStringAt(String s, int row, int col) {
		console.putStringAt(s, row, col);
	}

	public void putString(String s) {
		console.putString(s);
	}

	public void gotoXY(int x, int y) {
		console.gotoXY(x, y);
	}

	public int waitForKeyPress() {
		int key = -1;
		
		try {
			key = System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return key;
	}

	public char[][] getScreen() {
//		return privateHelpers.fields.getScreenField();
		return privateHelpers.fields.getPrivateFieldValue(console, privateHelpers.fields.screenField);
	}

	public void setScreen(char[][] screen) {
//		privateHelpers.fields.setScreenField(screen);
		privateHelpers.fields.setPrivateFieldValue(console, privateHelpers.fields.screenField, screen);
	}


}
