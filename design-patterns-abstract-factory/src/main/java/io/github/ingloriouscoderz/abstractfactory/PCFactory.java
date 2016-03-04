package io.github.ingloriouscoderz.abstractfactory;

import io.github.ingloriouscoderz.model.AbstractComputer;
import io.github.ingloriouscoderz.model.PC;
import io.github.ingloriouscoderz.model.Server;

public class PCFactory implements ComputerAbstractFactory {
	private String type;
	private String ram;
	private String hdd;
	private String cpu;

	public static AbstractComputer createComputer(
				String type,
				String ram,
				String hdd,
				String cpu
			) 
	{
		switch(type.toUpperCase()) {
		case "PC":
			return new PC(ram, hdd, cpu);
		case "SERVER":
			return new Server(ram, hdd, cpu);
		}
		
		return null;
	}
}
