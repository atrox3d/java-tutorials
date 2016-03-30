package io.github.ingloriouscoderz.supermarket.model;

public class Teller {
	private static int totalTellers = 0;
	
	private CustomerQueue queue;
	private int id;
	private Customer customer;
	
	public static Teller getTeller() {
		return new Teller();
	}
	
	public static Teller getTeller(CustomerQueue q) {
		return new Teller(q);
	}
	
	private Teller() {
		queue = null;
		customer = null;
		id = ++ Teller.totalTellers;
		System.out.printf("%s initialized%n", this);
}
	
	private Teller(CustomerQueue q) {
		this();
		setQueue(q);
	}

		
	public CustomerQueue getQueue() {
		return queue;
	}


	public void setQueue(CustomerQueue queue) {
		this.queue = queue;
	}

	public boolean isFree() {
		if(queue==null) return true;
		if(queue.isEmpty()) return true;
		return false;
	}
	
	public void processCustomer() {
		if(isFree()) {
			return;
		}
		
		if(customer == null || customer.isServed()) {
			customer = queue.getNextCustomer();
		}
		
		System.out.printf("%s: processing %s%n", this, customer);
		customer.process();
	}

	@Override
	public String toString() {
		return "Teller #" + id;
	}

}
