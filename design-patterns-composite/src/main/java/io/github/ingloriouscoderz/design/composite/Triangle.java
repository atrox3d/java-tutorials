package io.github.ingloriouscoderz.design.composite;

public class Triangle implements Shape {

	@Override
	public void draw(String fillColor) {
		System.out.println("drawing triangle with color " + fillColor);
	}

}
