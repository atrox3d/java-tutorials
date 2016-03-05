package io.github.ingloriouscoderz.model;

public class PC extends AbstractComputer {

	private String ram;
	private String hdd;
	private String cpu;

	public PC(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		System.out.println(this.getClass().getSimpleName() + ": initializing new " + this.getClass().getSimpleName() + ":" + this);
	}

	@Override
	public String getRAM() {
		return ram;
	}

	@Override
	public String getHDD() {
		return hdd;
	}

	@Override
	public String getCPU() {
		return cpu;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
}
