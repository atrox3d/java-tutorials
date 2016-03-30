package io.github.ingloriouscoderz.supermarket.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import io.github.ingloriouscoderz.supermarket.model.Customer;
import io.github.ingloriouscoderz.supermarket.model.CustomerQueue;
import io.github.ingloriouscoderz.supermarket.model.Teller;

public class QueueMediator {
	private static List<CustomerQueue> queues = new ArrayList<CustomerQueue>();
	private static List<Teller> tellers= new ArrayList<Teller>();
	
	public static CustomerQueue assignCustomer(Customer c) {
		CustomerQueue betterQueue = queues.get(0);
		
		for (CustomerQueue queue : queues) {
			if(queue.size() < betterQueue.size()) {
				betterQueue = queue;
			}
		}
		betterQueue.add(c);
		System.out.printf("Mediator: adding %s to %s%n", c, betterQueue);
		return betterQueue;
	}
	
	public static void processTick() {
		for (Teller teller : tellers) {
			teller.processCustomer();
		}
	}
	
	public static CustomerQueue addQueue() {
		CustomerQueue cq = CustomerQueue.getQueue(); 
		queues.add(cq);
		return cq;
	}
	
	public static Teller addTeller() {
		Teller t = Teller.getTeller();
		tellers.add(t);
		return t;
	}

	public static Teller addTeller(CustomerQueue q) {
		Teller t = Teller.getTeller(q);
		tellers.add(t);
		return t;
	}

	public int getTotalQueues() {
		return queues.size();
	}
}
