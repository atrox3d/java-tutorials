package io.github.ingloriouscoderz.service.timing;

import io.github.ingloriouscoderz.service.Util;

public class ExecutionTimer {
	private long start;
	private long end;
	
	
	public ExecutionTimer() {
		reset();
	}
	
	public void start() {
		start = System.currentTimeMillis();
		echo(String.format("start:%d%n", start));
	}
	
	public void stop() {
		end = System.currentTimeMillis();
		echo(String.format("stop:%d%n", end));
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

	private void echo(String msg) {
		Util.echo(this, msg);
	}
}
