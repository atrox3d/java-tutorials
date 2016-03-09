package io.github.ingloriouscoderz.network;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

import io.github.ingloriouscoderz.timing.ExecutionTimer;

public class PseudoPingEcho {
	private String address;
	private int port;
	private final int ECHO = 80;
	private Socket echo;
	private ExecutionTimer timer;
	
	public PseudoPingEcho(String address, int port) {
		this.address = address;
		
		this.port = ECHO;
		if(port > 0) {
			this.port = port;
		}
		
		timer = new ExecutionTimer();
	}
	
	public boolean ping(int delay) {
		try {
			
			String message = String.valueOf(delay);
			
			System.out.printf("opening socket : %s:%d...%n", address, port);
			echo = new Socket(address, port);
			System.out.printf("opening input stream on socket : %s:%d...%n", address, port);
			DataInputStream dis = new DataInputStream(echo.getInputStream());
			System.out.printf("opening output stream on socket : %s:%d...%n", address, port);
			PrintStream ps = new PrintStream(echo.getOutputStream());
			
			System.out.printf("sending delayedMessage '%s' on socket : %s:%d...%n", delay, address, port);
			timer.reset();
			timer.start();
			ps.print(message);
			@SuppressWarnings("deprecation")
			String answer = dis.readLine();
			timer.stop();
			if(answer.equals(message)) {
				System.out.println(String.format("address %s is alive, server answered in %s", address, timer));
				return true;
			} else {
				System.out.println(String.format("address %s is dead or not responding to echo", address));
				return false;
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
