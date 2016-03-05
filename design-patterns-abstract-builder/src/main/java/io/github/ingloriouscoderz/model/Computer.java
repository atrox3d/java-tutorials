package io.github.ingloriouscoderz.model;

public class Computer {

	private String ram;
	private String hdd;
	private String cpu;
    //optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	
	private static ComputerBuilder builder = null;

	private Computer(ComputerBuilder builder) {
		this.ram = builder.getRam();
		this.hdd = builder.getHdd();
		this.cpu = builder.getCpu();
		System.out.println(this.getClass().getSimpleName() + ": initializing new " + this.getClass().getSimpleName() + ":" + this);
	}

	public static Computer build(ComputerBuilder builder) {
		Computer.builder = builder;
		return new Computer(Computer.builder);
	}
	public String getRAM() {
		return ram;
	}

	public String getHDD() {
		return hdd;
	}

	public String getCPU() {
		return cpu;
	}

	@Override
	public String toString() {
		return String.format(
					"%s: RAM=%s, HDD=%s, CPU=%s",
					this.getClass().getSimpleName(),
					getRAM(),
					getHDD(),
					getCPU()
				);
	}

	public boolean isGraphicsCardEnabled() {
		// TODO Auto-generated method stub
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		// TODO Auto-generated method stub
		return isBluetoothEnabled;
	}
	
}
