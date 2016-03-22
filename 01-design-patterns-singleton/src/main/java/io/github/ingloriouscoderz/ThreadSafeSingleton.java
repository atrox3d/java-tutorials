package io.github.ingloriouscoderz;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {}

	public static synchronized ThreadSafeSingleton getInstance() {
		if(instance==null) {
			System.out.println("instance is null, creating new ThreadSafeSingleton...");
			instance = new ThreadSafeSingleton();
		}
		System.out.println("returning ThreadSafeSingleton instance ...");
		return instance;
	}
}
