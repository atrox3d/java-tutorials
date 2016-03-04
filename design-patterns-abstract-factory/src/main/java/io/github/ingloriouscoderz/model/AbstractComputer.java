package io.github.ingloriouscoderz.model;

public abstract class AbstractComputer {
	
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();

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
}
