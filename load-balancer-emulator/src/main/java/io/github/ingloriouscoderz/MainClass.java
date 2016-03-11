package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.network.client.PseudoPingEcho;
import io.github.ingloriouscoderz.network.client.SocketClient;
import io.github.ingloriouscoderz.network.server.ComplexThreadedServer;
import io.github.ingloriouscoderz.network.server.SimpleThreadedServer;

public class MainClass {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ComplexThreadedServer(7, 10));
		t1.start();
		
		Thread t2 = new Thread(
					new Runnable() {
						
						@Override
						public void run() {
							PseudoPingEcho ppe = new PseudoPingEcho("127.0.0.1", 7);
							ppe.ping(5000);
							
						}
					}
				);
		
		t2.start();
		
		try{Thread.sleep(5000);}catch(Exception x){}
//		ReachableTest rt = new ReachableTest("127.0.0.1");
//		rt.ping(3000);
		
//		SocketClient sc = new SocketClient("127.0.0.1", 7);
//		sc.ping(3000);
		
		
//		new SimpleThreadedServer(7, 10).serve();
	}
}
