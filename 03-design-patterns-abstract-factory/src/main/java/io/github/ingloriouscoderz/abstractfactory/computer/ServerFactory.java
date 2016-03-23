package io.github.ingloriouscoderz.abstractfactory.computer;

import io.github.ingloriouscoderz.model.computer.AbstractComputer;
import io.github.ingloriouscoderz.model.computer.Server;

public class ServerFactory implements ComputerAbstractFactory {
	private String type;
	private String ram;
	private String hdd;
	private String cpu;

	public ServerFactory(
				String type,
				String ram,
				String hdd,
				String cpu
			) 
	{
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public AbstractComputer createComputer() {
		System.out.println(this.getClass().getSimpleName() + ": constructing new SERVER: ");
		AbstractComputer server = new Server(ram, hdd, cpu);
		System.out.println(server);
		return server;	
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + ":" + String.format(
				"RAM=%s, HDD=%s, CPU=%s",
				ram,
				hdd,
				cpu
			);
	}
}
