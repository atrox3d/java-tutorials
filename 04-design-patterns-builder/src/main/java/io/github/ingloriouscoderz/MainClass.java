package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.model.Computer;

public class MainClass {

	public static void main(String[] args) {
		Computer pc = new Computer.ComputerBuilder("2GB", "200GB", "2GHZ").setBluetoothEnabled(false).build();
		System.out.println(pc);
	}

}
