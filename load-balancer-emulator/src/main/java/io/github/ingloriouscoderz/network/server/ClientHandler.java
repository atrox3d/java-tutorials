package io.github.ingloriouscoderz.network.server;

import java.net.Socket;

public class ClientHandler extends Thread {
	Socket conn;
	public ClientHandler(Socket conn) {
		this.conn = conn;
	}
}
