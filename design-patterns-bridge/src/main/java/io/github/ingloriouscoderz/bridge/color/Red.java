package io.github.ingloriouscoderz.bridge.color;

public class Red implements Color {

	@Override
	public void applyColor() {
		System.out.println(this.getClass().getSimpleName());
	}

}
