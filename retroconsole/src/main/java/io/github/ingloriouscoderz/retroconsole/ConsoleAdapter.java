package io.github.ingloriouscoderz.retroconsole;

public class ConsoleAdapter extends Console {
	public int ROWS;
	public int COLS;
	public char[][]screen;
	public int cursorRow;
	public int cursorCol;
	
	public ConsoleAdapter() {
		ROWS=super.ROWS;
		COLS=super.COLS;
		screen = new char[ROWS][COLS];
		cursorRow = cursorCol = 0;
		initScreen();
	}

}
