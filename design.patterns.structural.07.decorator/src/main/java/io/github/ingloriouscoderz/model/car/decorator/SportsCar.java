package io.github.ingloriouscoderz.model.car.decorator;

import io.github.ingloriouscoderz.model.car.base.Car;

public class SportsCar extends CarDecorator {

	public SportsCar(Car c) {
		super(c);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("adding sport car feature");
	}

}
