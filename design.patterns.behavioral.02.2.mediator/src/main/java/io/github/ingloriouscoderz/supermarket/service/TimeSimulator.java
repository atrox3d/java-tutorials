package io.github.ingloriouscoderz.supermarket.service;

public class TimeSimulator {
	private static long seconds = 0;
	public TimeSimulator() {
		// TODO Auto-generated constructor stub
	}

	public static void tick() {
		try {
			++seconds;
			System.out.println("TimeSimulator : tick #" + seconds);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
