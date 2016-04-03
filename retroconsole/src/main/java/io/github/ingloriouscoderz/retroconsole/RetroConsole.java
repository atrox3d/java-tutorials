package io.github.ingloriouscoderz.retroconsole;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import io.github.ingloriouscoderz.retroconsole.services.ReflectionPrivateMemberHacker;

public class RetroConsole {
	private Console console;
	private char[][] screen;
	private Field screenField;
	private Method printPrompt;
	private Method readDouble;
	private Method readInt;
	private Method readLine;
	private Method readLine_String;
	
		
	private void initPrivateFields() {
		screenField = ReflectionPrivateMemberHacker.getPublicVersionOfField(console, "screen");
	}

	private void initPrivateMethods() {
		printPrompt = ReflectionPrivateMemberHacker.getPublicVersionOfMethod(console, "printPrompt", String.class);
		readDouble = ReflectionPrivateMemberHacker.getPublicVersionOfMethod(console, "readDouble", String.class);
		readInt = ReflectionPrivateMemberHacker.getPublicVersionOfMethod(console, "readInt", String.class);
		readLine = ReflectionPrivateMemberHacker.getPublicVersionOfMethod(console, "readLine", String.class);
		readLine_String = ReflectionPrivateMemberHacker.getPublicVersionOfMethod(console, "readLine", String.class);
	}
	public RetroConsole() {
		// find a way to change finals ROWS COLS variables
		console = new Console();
		initPrivateFields();
		initPrivateMethods();
		setScreen(new char[console.ROWS+1][console.COLS-1]);
		screen=getScreen();
	}

	public void printPrompt(String prompt) {
		ReflectionPrivateMemberHacker.invokePrivateMethod(console, printPrompt, prompt);
	}
	
	public double readDouble(String prompt) {
		double value = 0;
		value = ReflectionPrivateMemberHacker.invokePrivateMethod(console, readDouble, prompt);
		return value;
	}
	
	public int readInt(String prompt) {
		int value = 0;
		value = ReflectionPrivateMemberHacker.invokePrivateMethod(console, readInt, prompt);
		return value;
	}
	
	public String readLine() {
		String value = "";
		value = ReflectionPrivateMemberHacker.invokePrivateMethod(console, readLine);
		return value;
	}
	
	public String readLine(String prompt) {
		String value = "";
		value = ReflectionPrivateMemberHacker.invokePrivateMethod(console, readLine_String, prompt);
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
		return ReflectionPrivateMemberHacker.getPrivateFieldValue(console, screenField);
	}

	public void setScreen(char[][] screen) {
//		privateHelpers.fields.setScreenField(screen);
		ReflectionPrivateMemberHacker.setPrivateFieldValue(console, screenField, screen);
	}


}
