package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.design.adapter.SocketAdapter;
import io.github.ingloriouscoderz.design.adapter.SocketClassAdapter;
import io.github.ingloriouscoderz.design.adapter.SocketObjectAdapter;
import io.github.ingloriouscoderz.design.adapter.Volt;

public class MainClass {

	public static void main(String[] args) {
	}
	
	public void testClassAdapter() {
		SocketAdapter sockAdapter = new SocketClassAdapter();
		Volt v3 = sockAdapter.get3Volt();
		Volt v12 = sockAdapter.get12Volt();
		Volt v120= sockAdapter.get120Volt();
		
		System.out.println("v3 using class adapter=" + v3.getVolts());
		System.out.println("v12 using class adapter=" + v12.getVolts());
		System.out.println("v120 using class adapter=" + v120.getVolts());
	}

	public void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketObjectAdapter();
		Volt v3 = sockAdapter.get3Volt();
		Volt v12 = sockAdapter.get12Volt();
		Volt v120= sockAdapter.get120Volt();
		
		System.out.println("v3 using object adapter=" + v3.getVolts());
		System.out.println("v12 using object adapter=" + v12.getVolts());
		System.out.println("v120 using object adapter=" + v120.getVolts());
	}
}
