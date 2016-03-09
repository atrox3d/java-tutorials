package io.github.ingloriouscoderz.network.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	private ServerSocket server;
	private Socket conn;
	private PrintStream out;
	private BufferedReader in;
	private String message;
	
	private int port;
	private int backlog;

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
			
			String message = in.readLine();
			out.print(message);
			out.flush();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void echo(String msg) {
		System.out.println(msg);
	}
}
