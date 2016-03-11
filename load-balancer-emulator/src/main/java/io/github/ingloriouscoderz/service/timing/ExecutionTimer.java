package io.github.ingloriouscoderz.service.timing;

import io.github.ingloriouscoderz.service.Util;

public class ExecutionTimer {
	private long start;
	private long end;
	private Object caller;
	
	
	public ExecutionTimer() {
		reset();
	}
	
	public ExecutionTimer(Object thiz) {
		this();
		setCaller(thiz);
	}
	
	public void setCaller(Object thiz) {
		caller = thiz;
	}

	public void start() {
		start = System.currentTimeMillis();
		echo(String.format("start:%d", start));
	}
	
	public void stop() {
		end = System.currentTimeMillis();
		echo(String.format("stop:%d", end));
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
		Util.echo(caller, this, msg);
	}
}
