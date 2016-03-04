package io.github.ingloriouscoderz.abstractfactory;

import io.github.ingloriouscoderz.model.AbstractComputer;

public class ComputerFactory {

	public static AbstractComputer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}

}
