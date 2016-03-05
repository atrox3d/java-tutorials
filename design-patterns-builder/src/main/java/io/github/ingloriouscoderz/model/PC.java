package io.github.ingloriouscoderz.model;

public class PC {
	private String ram;
	private String hdd;
	private String cpu;
    //optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	public PC(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		System.out.println(this.getClass().getSimpleName() + ": initializing new " + this.getClass().getSimpleName() + ":" + this);
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
