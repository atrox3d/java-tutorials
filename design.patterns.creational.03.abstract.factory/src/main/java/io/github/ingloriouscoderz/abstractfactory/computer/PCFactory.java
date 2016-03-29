package io.github.ingloriouscoderz.abstractfactory.computer;

import io.github.ingloriouscoderz.model.computer.AbstractComputer;
import io.github.ingloriouscoderz.model.computer.PC;

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
		System.out.println(this.getClass().getSimpleName() + ": constructing new PC: ");
		AbstractComputer pc = new PC(ram, hdd, cpu);
		System.out.println(pc);
		return pc;	
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
