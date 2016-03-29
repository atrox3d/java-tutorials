package io.github.ingloriouscoderz.bridge.matrix;

import java.util.Collection;

public class SparseMatrix extends Matrix {

	public SparseMatrix(int rows, int cols, Collection<MatrixCell> data) throws MatrixOutOfBoundsException {
		super(rows, cols, data);
	}

	@Override
	public void put(int row, int col, int value) throws MatrixOutOfBoundsException {
		MatrixCell mc = getPosition(row, col);
		
		if(mc != null) {
			if(value == 0) {
				deletePosition(mc);
			} else {
				mc.value = value;
			} 
		} else {
			mc = createPosition(row, col);
			mc.value = value;
		}
		mc.value = value;
	}

	@Override
	public int get(int row, int col) throws MatrixOutOfBoundsException {
		MatrixCell mc = getPosition(row, col);
		return mc==null?0:mc.value;
	}

}
