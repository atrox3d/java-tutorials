package io.github.ingloriouscoderz.bridge.color;

public class Green implements Color {

	@Override
	public void applyColor() {
		System.out.println(this.getClass().getSimpleName());
	}

}
