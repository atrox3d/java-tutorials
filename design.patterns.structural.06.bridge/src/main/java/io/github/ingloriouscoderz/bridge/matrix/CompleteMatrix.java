package io.github.ingloriouscoderz.bridge.matrix;

import java.util.Collection;

public class CompleteMatrix extends Matrix {

	public CompleteMatrix(int rows, int cols, Collection<MatrixCell> data) throws Exception {
		super(rows, cols, data);
		
		for (int col = 0; col < cols; col++) {
			for (int row = 0; row < rows; row++) {
				createPosition(row, col);
			}
		}
	}

	@Override
	public void put(int row, int col, int value) throws MatrixOutOfBoundsException {
		//System.out.printf("setting cell %d:%d = %d%n", row, col, value);
		MatrixCell mc = getPosition(row, col);
		mc.value = value;
	}

	@Override
	public int get(int row, int col) throws MatrixOutOfBoundsException {
		MatrixCell mc = getPosition(row, col);
		return mc.value;
	}

}
