package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.network.client.PseudoPingEcho;
import io.github.ingloriouscoderz.network.server.ComplexThreadedServer;

public class MainClass {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ComplexThreadedServer(7, 10), "server");
		t1.start();
		
		for (int i = 0; i < 5; i++) {
			Thread tx = new Thread(
					new Runnable() {
						
						@Override
						public void run() {
							PseudoPingEcho ppe = new PseudoPingEcho("127.0.0.1", 7);
							ppe.ping(5000);
							
						}
					},
					String.valueOf(i)
				);
		
			tx.start();
		}
		
		try{Thread.sleep(5000);}catch(Exception x){}
	}
}
