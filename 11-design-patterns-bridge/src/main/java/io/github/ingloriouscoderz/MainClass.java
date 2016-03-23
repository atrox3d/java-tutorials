package io.github.ingloriouscoderz;

import java.util.Vector;

import io.github.ingloriouscoderz.bridge.color.Red;
import io.github.ingloriouscoderz.bridge.color.Shape;
import io.github.ingloriouscoderz.bridge.color.Triangle;
import io.github.ingloriouscoderz.bridge.matrix.CompleteMatrix;
import io.github.ingloriouscoderz.bridge.matrix.MatrixCell;

public class MainClass {
 
    public static void main(String[] args) throws Exception {
    	System.out.println("---------------------------------------------------");
    	System.out.println("test bridge pattern with shape");
    	Shape t = new Triangle(new Red());
    	t.applyColor();
    	System.out.println("---------------------------------------------------");
    	final int ROWS = 3;
    	final int COLS = 4;
    	
    	CompleteMatrix cmv = new CompleteMatrix(ROWS, COLS, new Vector<MatrixCell>());
    	
    	for (int col = 0; col < COLS; col++) {
        	for (int row = 0; row < ROWS; row++) {
        		//System.out.printf("getting value of cell %d:%d%n", row, col);
        		System.out.print(cmv.get(row,  col) + " ");
    		}
        	System.out.println();
		}

    	System.out.println("put values...");
    	cmv.put(1, 2, 1);
    	cmv.put(2, 1, 2);
    	cmv.put(0, 3, 3);
    	cmv.put(1, 2, 0);
    	
    	for (int col = 0; col < COLS; col++) {
        	for (int row = 0; row < ROWS; row++) {
        		System.out.print(cmv.get(row,  col) + " ");
    		}
        	System.out.println();
		}
    }
}
