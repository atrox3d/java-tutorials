package io.github.ingloriouscoderz.network.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class SimpleEchoServer extends SocketServer {

	public SimpleEchoServer(int port, int backlog) {
		super(port, backlog);
	}

//	@Override
//	public void serve() {
//		super.serve();
//	}
	
	@Override
	protected void handleClient(Socket conn) {
		try {
			echo("creating I/O channels...");
			out = new PrintStream(conn.getOutputStream());
			in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			echo("waiting for input...");
			message = in.readLine();
			echo("received input:" + message);
			echo("sending back message: " + message);
			out.print(message);
			out.flush();
			echo("message sent.");
			echo("closing connections");
			in.close();
			out.close();
			conn.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
