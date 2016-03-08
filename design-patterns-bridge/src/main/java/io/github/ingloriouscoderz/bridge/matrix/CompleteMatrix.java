package io.github.ingloriouscoderz.bridge.matrix;

import java.util.Collection;

public class CompleteMatrix extends Matrix {

	protected CompleteMatrix(int rows, int cols, Collection<MatrixCell> data) throws Exception {
		super(rows, cols, data);
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				createPosition(i, j);
			}
		}
	}

	@Override
	public void put(int row, int col, int value) throws MatrixOutOfBoundsException {
		MatrixCell mc = getPosition(row, col);
		mc.value = value;
	}

	@Override
	public int get(int row, int col) throws MatrixOutOfBoundsException {
		MatrixCell mc = getPosition(row, col);
		return mc.value;
	}

}
