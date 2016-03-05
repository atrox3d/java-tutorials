package io.github.ingloriouscoderz.model;

public class Computer {
	public static class ComputerBuilder {
		private String ram;
		private String hdd;
		private String cpu;
	    //optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		public ComputerBuilder(String ram, String hdd, String cpu) {
			this.ram = ram;
			this.hdd = hdd;
			this.cpu = cpu;
			System.out.println(this.getClass().getSimpleName() + ": initializing new " + this.getClass().getSimpleName() + ":" + this);
		}

		public void setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
		}

		public void setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
		}
		
		public Computer build() {
			return new Computer(this);
		}

	}

	private String ram;
	private String hdd;
	private String cpu;
    //optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	private Computer(ComputerBuilder builder) {
		this.ram = builder.ram;
		this.hdd = builder.hdd;
		this.cpu = builder.cpu;
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
