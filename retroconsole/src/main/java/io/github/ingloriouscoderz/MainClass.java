package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.retroconsole.RetroConsole;

public class MainClass {

	   public static void main (String[] args)
	   {
		   RetroConsole c = new RetroConsole();

		   c.clearScreen();
		   c.gotoXY(20, 6);
		   c.putString("Hello world");
		   c.printScreen();
		   c.waitForKeyPress();
//		   String a = c.readLine("Press enter: ");
//		   //c.initScreen();
//		   //c.printScreen();
//		   c.clearScreen();
//		   String ans = c.readLine("Enter data here: ");
//		   c.putStringAt(ans, 7, 20);
//		   c.printScreen();
//		   ans = c.readLine("A second input line: ");
	   }

}
