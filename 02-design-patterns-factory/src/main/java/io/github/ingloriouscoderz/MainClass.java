package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.computers.AbstractComputer;
import io.github.ingloriouscoderz.computers.ComputerFactory;

public class MainClass {

	public static void main(String[] args) {
		AbstractComputer pc = ComputerFactory.getComputer("PC", "2 GB", "500 GB", "2.4 GHZ");
		AbstractComputer server = ComputerFactory.getComputer("SERVER", "8 GB", "5000 GB", "7.4 GHZ");
		
		System.out.println("Factory pc config: " + pc);
		System.out.println("Factory server config: " + server);
	}

}
