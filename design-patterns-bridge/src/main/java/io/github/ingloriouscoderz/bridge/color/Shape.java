package io.github.ingloriouscoderz.bridge.color;

public abstract class Shape {
	protected Color color;

	public Shape(Color color) {
		this.color = color;
	}
	
	abstract public void applyColor();
}
