package io.github.ingloriouscoderz.bridge.color;

public class Triangle extends Shape {

	public Triangle(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		System.out.print(this.getClass().getSimpleName() + " filled with color ");
		color.applyColor();
	}

}
