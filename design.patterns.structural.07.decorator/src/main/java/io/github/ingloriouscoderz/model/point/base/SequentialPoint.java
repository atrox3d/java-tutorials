package io.github.ingloriouscoderz.model.point.base;

public class SequentialPoint implements DiagonalDraggablePoint {
	private int x, y;
	
	public SequentialPoint() {
		x = y = 0;
	}

	@Override
	public void moveDiagonal(int distance, String draggerName) {
		System.out.printf("Move by %s from {%d:%d} to {%d:%d}%n", draggerName, x, y, x+distance, y+distance);
		x+=distance;
		y+=distance;
	}

	@Override
	public void currentPosition(String client) {
		System.out.printf( "%s: Current position : {%d:%d}%n", client, x, y);	
	}

}
