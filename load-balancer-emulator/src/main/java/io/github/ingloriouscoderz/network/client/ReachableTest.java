package io.github.ingloriouscoderz.network.client;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class ReachableTest {
	private String address;
	
	public ReachableTest(String address) {
		this.address = address;
	}

	public boolean ping(int timeout) {
		try {
			InetAddress host = InetAddress.getByName(address);
			System.out.println("name: " + host.getHostName());
			System.out.println("address: " + Arrays.toString(host.getAddress()));
			System.out.println("reach: " + host.isReachable(timeout));
			return host.isReachable(timeout);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
}
