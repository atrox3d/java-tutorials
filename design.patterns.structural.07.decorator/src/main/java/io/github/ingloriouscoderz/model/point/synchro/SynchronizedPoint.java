package io.github.ingloriouscoderz.model.point.synchro;

import io.github.ingloriouscoderz.model.point.base.DiagonalDraggablePoint;
import io.github.ingloriouscoderz.model.point.base.SequentialPoint;

public class SynchronizedPoint implements DiagonalDraggablePoint {

	SequentialPoint sp;
	
	public SynchronizedPoint(SequentialPoint sp) {
		this.sp = sp;
	}

	@Override
	public void moveDiagonal(int distance, String draggerName) {
		synchronized (sp) {
			sp.moveDiagonal(distance, draggerName);
		}
	}

	@Override
	public void currentPosition(String client) {
		sp.currentPosition(client);
	}

}
