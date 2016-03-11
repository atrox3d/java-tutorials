package io.github.ingloriouscoderz.network.server;

import java.net.Socket;

import io.github.ingloriouscoderz.network.server.handlers.ClientEchoHandler;
import io.github.ingloriouscoderz.network.server.handlers.threaded.ThreadedClientEchoHandler;

public class ComplexThreadedServer extends SimpleSocketServer implements Runnable{

	public ComplexThreadedServer(int port, int backlog) {
		super(port, backlog);
	}
	
	@Override
	public void serve() {
		echo("calling super.serve()");
		super.serve();
		echo("ciclyng connections");
		while(true) {
			echo("connection cycle");
			conn = acceptConnection();
			handleClient(conn);
		}
	}

	protected void handleClient(Socket conn) {
	    //create new thread to handle client
		echo("creating new ThreadedClientEchoHandler");
		Thread t = new Thread( new ThreadedClientEchoHandler(conn));
		t.start();
		
	}

	@Override
	public void run() {
		serve();
	}
	
}
