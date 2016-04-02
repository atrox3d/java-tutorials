package io.github.ingloriouscoderz.retroconsole;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RetroConsole {
	private Console console;
	private char[][] screen;
	private Field screenField;
	private Method printPrompt;
	private Method readDouble;
	private Method readInt;
	private Method readLine;
	private Method readLine_String;
	private PrivateHelpers privateHelpers;
	
	private class PrivateHelpers {
		
		private PrivateHelpers() {
			setScreenField(new char[console.ROWS+1][console.COLS-1]);
			screen=getScreenField();
			initPrivateMethods();
		}
		
		private void setScreenField(char [][] buffer) {
			try {
				screenField = console.getClass().getDeclaredField("screen");
				screenField.setAccessible(true);
				screenField.set(console, buffer);
			} catch (NoSuchFieldException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalArgumentException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IllegalAccessException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		private char [][] getScreenField() {
			try {
				return (char[][]) screenField.get(console);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			return null;
		}

		private void initPrivateMethods() {
			try {
				Class[] params = {String.class};
				printPrompt = console.getClass().getDeclaredMethod("printPrompt", params);
				printPrompt.setAccessible(true);

				readDouble = console.getClass().getDeclaredMethod("readDouble", params);
				readDouble.setAccessible(true);

				readInt = console.getClass().getDeclaredMethod("readInt", params);
				readInt.setAccessible(true);

				readLine = console.getClass().getDeclaredMethod("readLine", null);
				readLine.setAccessible(true);

				readLine_String = console.getClass().getDeclaredMethod("readLine", params );
				readLine_String.setAccessible(true);
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		private <R,P> R invokePrivateMethod(Method method, P... params) {
			R value = null;
			try {
				value = (R)readLine_String.invoke(console, params);
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return value;
		}
		
	}
	
	
	public RetroConsole() {
		// find a way to change finals ROWS COLS variables
		console = new Console();
		privateHelpers = new PrivateHelpers();
		//privateHelpers.initScreenField(new char[console.ROWS+1][console.COLS-1]);
	}

	public void printPrompt() {
		privateHelpers.invokePrivateMethod(printPrompt, new String[] {});
	}
	
	public double readDouble() {
		double value = 0;
		value = privateHelpers.invokePrivateMethod(readDouble, new String[] {});
		return value;
	}
	
	public int readInt() {
		int value = 0;
		value = privateHelpers.invokePrivateMethod(readDouble, new String[] {});
		return value;
	}
	
	public String readLine() {
		String value = "";
		value = privateHelpers.invokePrivateMethod(readLine, new String[] {});
		return value;
	}
	
	public String readLine(String s) {
		String value = "";
		value = privateHelpers.invokePrivateMethod(readLine_String, new String[] {s});
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return key;
	}

}
