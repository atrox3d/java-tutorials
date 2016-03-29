package io.github.ingloriouscoderz.singleton;

public class LazyInitializedSingleton {
	private static LazyInitializedSingleton instance;
	
	private LazyInitializedSingleton() {}
	
	public static LazyInitializedSingleton getInstance() {
		if(instance==null) {
			System.out.println("instance is null, creating new LazyInitializedSingleton...");
			instance = new LazyInitializedSingleton();
		}
		System.out.println("returning LazyInitializedSingleton instance ...");
		return instance;
	}
}
