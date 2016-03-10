package io.github.ingloriouscoderz.network.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	protected ServerSocket server;
	protected Socket conn;
	protected PrintStream out;
	protected BufferedReader in;
	protected String message;
	
	protected int port;
	protected int backlog;

	public SocketServer(int port, int backlog) {
		this.port = port;
		this.backlog = backlog;
	}
	
	public void serve() {
		try {
			echo("creating server side socket...");
			server = new ServerSocket(port, backlog);
			echo("server socket created, waiting for connection...");
			conn = server.accept();
			echo(String.format(
						"Connection received from %s%n", 
						conn.getInetAddress().getHostName()
					));
			
			echo("creating I/O channels...");
			out = new PrintStream(conn.getOutputStream());
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			out.printf("Welcome to %s %s%n", this.getClass().getName(), "1.0");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		close();
	}

	protected void close() {
		try {
			echo("closing connections");
			in.close();
			out.close();
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	protected void echo(String msg) {
		System.out.println(msg);
	}
}
