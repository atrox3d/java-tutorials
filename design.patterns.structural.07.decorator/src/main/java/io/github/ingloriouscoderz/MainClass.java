package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.model.base.BasicCar;
import io.github.ingloriouscoderz.model.base.Car;
import io.github.ingloriouscoderz.model.decorator.SportsCar;

public class MainClass {

	public static void main(String[] args) {
		Car basicCar = new BasicCar();
		basicCar.assemble();
		
		Car sportsCar = new SportsCar(basicCar);
		sportsCar.assemble();
	}

}
