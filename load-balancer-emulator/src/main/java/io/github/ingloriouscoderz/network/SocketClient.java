package io.github.ingloriouscoderz.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SocketClient {
	private String host;
	private int port;
	private Socket socket;
	private InetSocketAddress address;
	private PrintWriter out;
	private BufferedReader in;
	
	public SocketClient(String host, int port) {
		this.host = host;
		this.port = port;
		this.address = new InetSocketAddress(host, port);
		this.socket = new Socket();
	}
	
	public boolean ping(int delay) {
		try {
			System.out.printf("connecting to host %s:%d...%n", host, port);
			socket.connect(address);
			System.out.println("done.");
			
			System.out.println("creating I/O...");
			out = new PrintWriter(socket.getOutputStream());
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String message = String.valueOf(delay);
			System.out.println("writing message:" + delay);
			out.println(message);
			System.out.println("done.");
			
			System.out.println("waiting response...");
			String response = in.readLine();
			System.out.println("done.");
			 if(message.equals(response))
			 {
				 return true;
			 } else {
				 return false;
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
