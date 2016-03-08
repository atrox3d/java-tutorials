package io.github.ingloriouscoderz.bridge;

public class Pentagon extends Shape {

	public Pentagon(Color color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColor() {
		System.out.print(this.getClass().getSimpleName() + " filled with color ");
		color.applyColor();
	}

}
