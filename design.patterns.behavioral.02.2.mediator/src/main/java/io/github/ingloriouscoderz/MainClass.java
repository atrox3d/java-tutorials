package io.github.ingloriouscoderz;

import java.util.Random;

import io.github.ingloriouscoderz.supermarket.model.Customer;
import io.github.ingloriouscoderz.supermarket.service.QueueMediator;
import io.github.ingloriouscoderz.supermarket.service.TimeSimulator;

public class MainClass {

	public static void main(String[] args) {
		Random random = new Random();
		
		QueueMediator.addTeller().setQueue(QueueMediator.addQueue());
		QueueMediator.addTeller(QueueMediator.addQueue());
		
		while(true) {
			TimeSimulator.tick();
			if(random.nextBoolean()) {
				QueueMediator.assignCustomer(
						Customer.getCustomer()
				);
			}
			QueueMediator.processTick();
		}
	}

}
