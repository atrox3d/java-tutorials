package io.github.ingloriouscoderz.network.server;

import java.net.Socket;

import io.github.ingloriouscoderz.network.server.handlers.threaded.ThreadedClientEchoHandler;

public class SimpleThreadedServer extends SimpleSocketServer {

	public SimpleThreadedServer(int port, int backlog) {
		super(port, backlog);
	}
	
	@Override
	public void serve() {
		super.serve();
		while(true) {
			conn = acceptConnection();
			handleClient(conn);
		}
	}

	@Override
	protected void handleClient(Socket conn) {
		Thread t = new Thread( new ThreadedClientEchoHandler(conn));
		t.start();
	}
	
}
