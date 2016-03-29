package io.github.ingloriouscoderz.model.point;

import io.github.ingloriouscoderz.model.point.base.DiagonalDraggablePoint;

public class PointDragger implements Runnable {
	
	DiagonalDraggablePoint ddp;
	String name;
	
	public PointDragger(DiagonalDraggablePoint ddp, String name) {
		this.ddp = ddp;
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			ddp.moveDiagonal(1, name);
			ddp.currentPosition(name);
		}
	}

}
