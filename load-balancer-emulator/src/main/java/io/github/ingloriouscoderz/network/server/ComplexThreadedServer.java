package io.github.ingloriouscoderz.network.server;

import java.net.Socket;

import io.github.ingloriouscoderz.network.server.handlers.ClientEchoHandler;

public class ComplexThreadedServer extends SimpleSocketServer implements Runnable{

	public ComplexThreadedServer(int port, int backlog) {
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
	    new ClientEchoHandler(conn).start();
	}

	@Override
	public void run() {
		serve();
	}
	
}
