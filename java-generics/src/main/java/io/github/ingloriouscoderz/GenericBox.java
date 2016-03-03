package io.github.ingloriouscoderz;

public class GenericBox <T> {

	private T t;
	
	public GenericBox(T t) {
		this.t= t;
	}
	
	public T getContent() {
		return t;
	}
	
	@Override
	public String toString() {
		return String.format("[GenericBox<%s>] : %s", t.getClass().getSimpleName(), t);
	}
}
