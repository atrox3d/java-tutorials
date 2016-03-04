package io.github.ingloriouscoderz.model;

public class PC extends AbstractComputer {

	private String ram;
	private String hdd;
	private String cpu;

	public PC(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		System.out.println("PC: initializing new PC:" + this);
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

}
