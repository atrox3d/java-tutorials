package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.network.server.SimpleThreadedServer;

public class MainClass {

	public static void main(String[] args) {
//		PseudoPingEcho ppe = new PseudoPingEcho("127.0.0.1", 7);
//		ppe.ping(5000);
		
//		ReachableTest rt = new ReachableTest("127.0.0.1");
//		rt.ping(3000);
		
//		SocketClient sc = new SocketClient("127.0.0.1", 7);
//		sc.ping(3000);
		new SimpleThreadedServer(7, 10).serve();
	}
}
