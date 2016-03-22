package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.design.composite.Circle;
import io.github.ingloriouscoderz.design.composite.Drawing;
import io.github.ingloriouscoderz.design.composite.Triangle;

public class MainClass {

	public static void main(String[] args) {
		Drawing d = new Drawing();
		
		for(int i=0; i<3; i++) {
			d.add(new Triangle());
			d.add(new Circle());
		}
		
		d.draw("red");
		
		d.clear();
		d.add(new Triangle());
		d.add(new Circle());
		d.draw("black");
	}
}
