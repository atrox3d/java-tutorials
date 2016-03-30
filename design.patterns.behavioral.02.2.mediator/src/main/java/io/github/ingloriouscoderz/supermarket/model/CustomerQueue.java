package io.github.ingloriouscoderz.supermarket.model;

import java.util.ArrayDeque;

public class CustomerQueue {
	private static int totalQueues = 0;
	
	private ArrayDeque<Customer> queue;
	private int id;

	public static CustomerQueue getQueue() {
		return new CustomerQueue();
	}
	
	private CustomerQueue() {
		queue = new ArrayDeque<Customer>();
		id = ++ CustomerQueue.totalQueues;
		System.out.printf("%s initialized%n", this);
	}

	public static int getTotalQueues() {
		return totalQueues;
	}

	public boolean add(Customer e) {
		System.out.printf("%s : adding %s%n", this, e);
		return queue.add(e);
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public Customer getNextCustomer() {
		return queue.poll();
	}

	public int size() {
		return queue.size();
	}

	@Override
	public String toString() {
		return "CustomerQueue #" + id;
	}

	
}
