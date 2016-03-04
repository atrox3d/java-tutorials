package io.github.ingloriouscoderz.abstractfactory;

import io.github.ingloriouscoderz.model.AbstractComputer;
import io.github.ingloriouscoderz.model.PC;
import io.github.ingloriouscoderz.model.Server;

public class PCFactory implements ComputerAbstractFactory {
	private String type;
	private String ram;
	private String hdd;
	private String cpu;

	public PCFactory(
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
		AbstractComputer pc = new PC(ram, hdd, cpu);
		System.out.println(this.getClass().getName() + ": constructing new PC: " + pc);
		return pc;	
	}
}
