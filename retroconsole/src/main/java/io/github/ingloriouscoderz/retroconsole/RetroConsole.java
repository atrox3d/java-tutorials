package io.github.ingloriouscoderz.retroconsole;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RetroConsole {
	private Console console;
	private char[][] screen;
	private Method printPrompt;
	private Method readDouble;
	private Method readInt;
	private Method readLine;
	private Method readLine_String;
	
	
	public RetroConsole() {
		// find a way to change finals ROWS COLS variables
		console = new Console();
		
		Field screenField;
		try {
			screenField = console.getClass().getDeclaredField("screen");
			screenField.setAccessible(true);
			try {
				screen = (char[][]) screenField.get(console);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		} catch (NoSuchFieldException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SecurityException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
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

	public void printPrompt() {
		try {
			printPrompt.invoke(console);
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
	}
	
	public double readDouble() {
		double value = 0;
		try {
			value = (double) readDouble.invoke(console);
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
	
	public int readInt() {
		int value = 0;
		try {
			value = (int)readInt.invoke(console);
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
	
	public String readLine() {
		String value = "";
		try {
			value = (String)readLine.invoke(console);
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
	
	public String readLine(String s) {
		String value = "";
		try {
			Object [] args = {s};
			value = (String)readLine_String.invoke(console, args);
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

	public void initScreen() {
		console.initScreen();
	}

	public void printScreen() {
		//console.printScreen();
		for (int row = 0; row < console.ROWS; row++) {
			String line = "";
			for (int col=0; col< console.COLS; col++) {
				line += screen[row][col];
			}
			System.out.println(line);
		}

	}

	public void clearScreen() {
		console.initScreen();
		console.printScreen();
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
