package io.github.ingloriouscoderz;

public class MainClass {

	public static void main(String[] args) {
		EagerInitializedSingleton eis1 = EagerInitializedSingleton.getInstance();
		EagerInitializedSingleton eis2 = EagerInitializedSingleton.getInstance();
		System.out.println("instance1==instance2:" + (eis1==eis2));
	}

}
