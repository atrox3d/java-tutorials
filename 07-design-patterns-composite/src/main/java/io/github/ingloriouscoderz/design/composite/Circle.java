package io.github.ingloriouscoderz.design.composite;

public class Circle implements Shape {

	@Override
	public void draw(String fillColor) {
		System.out.println("drawing circle with color " + fillColor);
	}

}
