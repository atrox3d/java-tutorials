package io.github.ingloriouscoderz.abstractfactory.computer;

import io.github.ingloriouscoderz.model.computer.AbstractComputer;

public class ComputerFactory {

	public static AbstractComputer getComputer(ComputerAbstractFactory factory) {
		System.out.println("ComputerFactory : building new computer using " + factory );
		return factory.createComputer();
	}

}
