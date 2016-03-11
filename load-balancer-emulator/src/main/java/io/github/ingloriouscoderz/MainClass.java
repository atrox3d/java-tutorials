package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.network.client.PseudoPingEcho;
import io.github.ingloriouscoderz.network.client.SocketClient;
import io.github.ingloriouscoderz.network.server.ComplexThreadedServer;
import io.github.ingloriouscoderz.network.server.SimpleThreadedServer;

public class MainClass {

	public static void main(String[] args) {
		Thread t = new Thread(new ComplexThreadedServer(7, 10));
		t.start();
		PseudoPingEcho ppe = new PseudoPingEcho("127.0.0.1", 7);
		ppe.ping(5000);
		
//		ReachableTest rt = new ReachableTest("127.0.0.1");
//		rt.ping(3000);
		
//		SocketClient sc = new SocketClient("127.0.0.1", 7);
//		sc.ping(3000);
		
		
//		new SimpleThreadedServer(7, 10).serve();
	}
}
