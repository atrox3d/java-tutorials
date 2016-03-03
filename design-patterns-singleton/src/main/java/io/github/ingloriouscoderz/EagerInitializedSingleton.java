package io.github.ingloriouscoderz;

public class EagerInitializedSingleton {
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {}
	
	public static EagerInitializedSingleton getInstance() {
		System.out.println("returning instance...");
		return instance;
	}
}
