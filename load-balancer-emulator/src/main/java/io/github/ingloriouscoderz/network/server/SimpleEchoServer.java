package io.github.ingloriouscoderz.network.server;

import java.net.Socket;

import io.github.ingloriouscoderz.network.server.handlers.threaded.ThreadedClientEchoHandler;


public class SimpleEchoServer extends SimpleSocketServer {

	public SimpleEchoServer(int port, int backlog) {
		super(port, backlog);
	}

	
	@Override
	protected void handleClient(Socket conn) {
		Thread t = new Thread( new ThreadedClientEchoHandler(conn));
		t.start();
	}

	
}
