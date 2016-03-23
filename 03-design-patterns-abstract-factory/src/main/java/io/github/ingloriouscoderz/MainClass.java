package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.abstractfactory.audiodevice.AudioClient;
import io.github.ingloriouscoderz.abstractfactory.audiodevice.CDDevicesFactory;
import io.github.ingloriouscoderz.abstractfactory.audiodevice.TapeDevicesFactory;
import io.github.ingloriouscoderz.abstractfactory.computer.ComputerFactory;
import io.github.ingloriouscoderz.abstractfactory.computer.PCFactory;
import io.github.ingloriouscoderz.abstractfactory.computer.ServerFactory;
import io.github.ingloriouscoderz.model.computer.AbstractComputer;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------");
		System.out.println("TESTING ABSTRACT PC FACTORY");
		System.out.println("-----------------------------------------------------------");
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
		System.out.println("-----------------------------------------------------------");
		System.out.println("TESTING ABSTRACT DEVICE FACTORY");
		System.out.println("-----------------------------------------------------------");
		AudioClient client = new AudioClient();
		client.selectTechnology(new TapeDevicesFactory());
		client.test("paranoid android");
		
		client.selectTechnology(new CDDevicesFactory());
		client.test("i will");
	}

}
