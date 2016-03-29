package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.model.Computer;
import io.github.ingloriouscoderz.model.ComputerBuilder;

public class MainClass {

	public static void main(String[] args) {
		ComputerBuilder pcBuilder = new ComputerBuilder().setCpu("2GHZ").setRam("2GB").setHdd("500GB");
		Computer pc = Computer.build(pcBuilder);
		System.out.println(pc);
	}

}
