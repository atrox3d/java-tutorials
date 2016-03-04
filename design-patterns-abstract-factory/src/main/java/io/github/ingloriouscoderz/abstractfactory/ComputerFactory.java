package io.github.ingloriouscoderz.abstractfactory;

import io.github.ingloriouscoderz.model.AbstractComputer;

public class ComputerFactory {

	public static AbstractComputer getComputer(ComputerAbstractFactory factory) {
		System.out.println("ComputerFactory : building new computer using " + factory );
		return factory.createComputer();
	}

}
