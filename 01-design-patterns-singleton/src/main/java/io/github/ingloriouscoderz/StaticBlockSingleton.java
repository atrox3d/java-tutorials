package io.github.ingloriouscoderz;

public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {}
	
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch (Exception e) {
			throw new RuntimeException("failed to initialize singleton");
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		System.out.println("returning StaticBlockSingleton instance...");
		return instance;
	}

}
