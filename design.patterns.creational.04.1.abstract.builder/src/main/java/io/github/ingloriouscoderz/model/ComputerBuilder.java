package io.github.ingloriouscoderz.model;

public class ComputerBuilder {
	private String ram;
	private String hdd;
	private String cpu;
    //optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	public ComputerBuilder(/*String ram, String hdd, String cpu*/) {
//		this.ram = ram;
//		this.hdd = hdd;
//		this.cpu = cpu;
//		System.out.println(this.getClass().getSimpleName() + ": initializing new " + this.getClass().getSimpleName() + ":" + this);
	}

	public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
		return this;
	}

	public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
		this.isBluetoothEnabled = isBluetoothEnabled;
		return this;
	}

	public String getRam() {
		return ram;
	}

	public ComputerBuilder setRam(String ram) {
		this.ram = ram;
		return this;
	}

	public String getHdd() {
		return hdd;
	}

	public ComputerBuilder setHdd(String hdd) {
		this.hdd = hdd;
		return this;
	}

	public String getCpu() {
		return cpu;
	}

	public ComputerBuilder setCpu(String cpu) {
		this.cpu = cpu;
		return this;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
//	public Computer build() {
//		return new Computer(this);
//	}

}
