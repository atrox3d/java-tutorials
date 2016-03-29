package io.github.ingloriouscoderz.model.car.decorator;

import io.github.ingloriouscoderz.model.car.base.Car;

public class CarDecorator implements Car {

	protected Car car;
	
	public CarDecorator(Car c) {
		this.car = c;
	}

	@Override
	public void assemble() {
		car.assemble();
	}

}
