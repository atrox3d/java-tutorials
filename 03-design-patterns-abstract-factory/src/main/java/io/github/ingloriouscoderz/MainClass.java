package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.abstractfactory.ComputerFactory;
import io.github.ingloriouscoderz.abstractfactory.PCFactory;
import io.github.ingloriouscoderz.abstractfactory.ServerFactory;
import io.github.ingloriouscoderz.model.AbstractComputer;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("calling pc factory");
		AbstractComputer pc = ComputerFactory.getComputer(
				new PCFactory("PC", "2 GB", "500 GB", "2.4 GHZ")
				);
		
		System.out.println("calling server factory");
		AbstractComputer server = ComputerFactory.getComputer(
				new ServerFactory("SERVER", "8 GB", "5000 GB", "7.4 GHZ")
		);
		
		System.out.println("Factory pc config: " + pc);
		System.out.println("Factory server config: " + server);
	}

}
