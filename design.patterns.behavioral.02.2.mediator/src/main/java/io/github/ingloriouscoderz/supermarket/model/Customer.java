package io.github.ingloriouscoderz.supermarket.model;


public class Customer {
	private static int totalCustomers = 0;
	static final int MAX_PROCESS_TIME = 10;
	
	private int id;
	private int processTime;
	private boolean served;
	
	public static Customer getCustomer() {
		return new Customer();
	}
	
	private Customer() {
		id = ++ Customer.totalCustomers;
		processTime = (int) (Math.random() * MAX_PROCESS_TIME);
		served = false;
		System.out.printf("%s initialized%n", this);
	}

	public boolean isServed() {
		return served;
	}

	public void setServed(boolean served) {
		this.served = served;
	}

	public static int totalCustomers() {
		return totalCustomers;
	}

	public int getId() {
		return id;
	}

	public int getProcessTime() {
		return processTime;
	}
	
	public int process() {
		if(processTime > 0) {
			processTime--;
		} else {
			setServed(true);
		}
		return processTime;
	}

	@Override
	public String toString() {
		return "Customer #" + id + " processTime=" + processTime;
	}
}
