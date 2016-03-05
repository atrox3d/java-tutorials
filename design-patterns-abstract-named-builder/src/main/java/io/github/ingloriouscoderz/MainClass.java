package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.model.Computer;
import io.github.ingloriouscoderz.model.ComputerBuilder;

public class MainClass {

	public static void main(String[] args) {
		ComputerBuilder pcBuilder = new ComputerBuilder().cpu("2GHZ").ram("2GB").hdd("500GB");
		Computer pc = Computer.build(pcBuilder);
		System.out.println(pc);
	}

}
