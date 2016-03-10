package io.github.ingloriouscoderz.network.server;

import java.io.IOException;

public class SimpleEchoServer extends SocketServer {

	public SimpleEchoServer(int port, int backlog) {
		super(port, backlog);
	}

	@Override
	public void serve() {
		super.serve();
		try {
			message = in.readLine();
			echo("waiting for input...");
			echo("received input:" + message);
			echo("sending back message: " + message);
			out.print(message);
			out.flush();
			echo("message sent.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
}
