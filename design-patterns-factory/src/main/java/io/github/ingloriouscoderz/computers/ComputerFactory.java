package io.github.ingloriouscoderz.computers;

public class ComputerFactory {

	public static AbstractComputer getComputer(
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
