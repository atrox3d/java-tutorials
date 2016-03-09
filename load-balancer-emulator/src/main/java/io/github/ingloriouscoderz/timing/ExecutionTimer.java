package io.github.ingloriouscoderz.timing;

public class ExecutionTimer {
	private long start;
	private long end;
	
	
	public ExecutionTimer() {
		reset();
	}
	
	public void start() {
		start = System.currentTimeMillis();
		System.out.printf("start:%d%n", start);
	}
	
	public void stop() {
		end = System.currentTimeMillis();
		System.out.printf("stop:%d%n", end);
	}
	
	public long duration() {
		return (end - start);
	}
	
	public void reset() {
		start = end = 0;
	}
	
	@Override
	public String toString() {
		return String.format("%d ms", duration());
	}
}
