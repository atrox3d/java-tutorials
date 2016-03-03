package io.github.ingloriouscoderz;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("testing EagerInitializedSingleton...");
		EagerInitializedSingleton eis1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton eis2 = EagerInitializedSingleton.getInstance();
		System.out.println("instance1==instance2:" + (eis1==eis2));
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("testing StaticBlockSingleton...");
		StaticBlockSingleton sbs1 = StaticBlockSingleton.getInstance();
		StaticBlockSingleton sbs2 = StaticBlockSingleton.getInstance();
		System.out.println("instance1==instance2:" + (sbs1==sbs2));
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("testing LazyInitializedSingleton...");
		LazyInitializedSingleton lis1 = LazyInitializedSingleton.getInstance();
		LazyInitializedSingleton lis2 = LazyInitializedSingleton.getInstance();
		System.out.println("instance1==instance2:" + (lis1==lis2));

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("testing ThreadSafeSingleton...");
		ThreadSafeSingleton tss1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton tss2 = ThreadSafeSingleton.getInstance();
		System.out.println("instance1==instance2:" + (tss1==tss2));
	}

}
