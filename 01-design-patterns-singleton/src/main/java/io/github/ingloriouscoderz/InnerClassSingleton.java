package io.github.ingloriouscoderz;

public class InnerClassSingleton {
	private InnerClassSingleton() {}
	
	private static class SingletonHelper {
		private static final InnerClassSingleton INSTANCE; // = new InnerClassSingleton();
		
		static {
			INSTANCE = new InnerClassSingleton();
			System.out.println("initializing SingletonHelper: INSTANCE=" + INSTANCE);
		}
		
		private SingletonHelper() {}
	}
	
	public static InnerClassSingleton getInstance() {
		InnerClassSingleton instance = SingletonHelper.INSTANCE;
		System.out.println("returning INSTANCE...");
		return instance;
	}
}
