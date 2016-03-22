package io.github.ingloriouscoderz.bridge.matrix;

import java.util.Collection;
import java.util.Iterator;

public abstract class Matrix {
	int rows, cols;
	Collection<MatrixCell> data;
	
	protected Matrix(int rows, int cols, Collection<MatrixCell> data) {
		this.rows = rows;
		this.cols = cols;
		this.data = data;
	}
	
	protected MatrixCell createPosition(int row, int col) throws MatrixOutOfBoundsException {
		MatrixCell mc = getPosition(row, col);
		if(mc == null) {
			mc = new MatrixCell(col, row);
		}
		data.add(mc);
		return mc;
	}
	
	protected void deletePosition(MatrixCell cell) throws MatrixOutOfBoundsException{
		data.remove(cell);
	}
	
	protected MatrixCell getPosition(int row, int col) throws MatrixOutOfBoundsException {
		if(row < 0 || row > this.rows || col < 0 || col > this.cols) {
			throw new MatrixOutOfBoundsException();
		}
		
		Iterator<MatrixCell> it = data.iterator();
		
		while(it.hasNext()) {
			MatrixCell mc = it.next();
			if(mc.row == row && mc.col == col) {
				return mc;
			}
		}
		return null;
	}
	
	public abstract void put( int row, int col, int value) throws MatrixOutOfBoundsException;
	public abstract int get( int row, int col) throws MatrixOutOfBoundsException;
}
