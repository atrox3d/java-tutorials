package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.component.Component;
import io.github.ingloriouscoderz.component.CompoundPart;
import io.github.ingloriouscoderz.component.SinglePart;
import io.github.ingloriouscoderz.design.composite.Circle;
import io.github.ingloriouscoderz.design.composite.Drawing;
import io.github.ingloriouscoderz.design.composite.Triangle;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("---------------------------------------------------");
		System.out.println("TESTING COMPOSITE WITH drawing");
		System.out.println("---------------------------------------------------");
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
		
		System.out.println("---------------------------------------------------");
		System.out.println("TESTING COMPOSITE WITH components");
		System.out.println("---------------------------------------------------");

		Component monitor = new SinglePart("LCD monitor");
		Component keyboard = new SinglePart("keyboard");
		Component processor = new SinglePart("pentium");
		Component ram = new SinglePart("2GB RAM");
		Component hdd = new SinglePart("40GB hdd");
		
		Component mainSystem = new CompoundPart("backbone");
		mainSystem.add(processor);
		mainSystem.add(ram);
		mainSystem.add(hdd);
		
		Component computer = new CompoundPart("super pc");
		computer.add(mainSystem);
		computer.add(monitor);
		computer.add(keyboard);
		
		computer.describe();
	}
}
