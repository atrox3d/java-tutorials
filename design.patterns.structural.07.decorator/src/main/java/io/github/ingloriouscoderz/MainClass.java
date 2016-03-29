package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.model.car.base.BasicCar;
import io.github.ingloriouscoderz.model.car.base.Car;
import io.github.ingloriouscoderz.model.car.decorator.SportsCar;
import io.github.ingloriouscoderz.model.point.PointDragger;
import io.github.ingloriouscoderz.model.point.base.DiagonalDraggablePoint;
import io.github.ingloriouscoderz.model.point.base.SequentialPoint;
import io.github.ingloriouscoderz.model.point.synchro.SynchronizedPoint;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("------------------------------------------------------------");
		System.out.println("TEST CAR DECORATOR");
		System.out.println("------------------------------------------------------------");
		Car basicCar = new BasicCar();
		basicCar.assemble();
		
		Car sportsCar = new SportsCar(basicCar);
		sportsCar.assemble();


		System.out.println("------------------------------------------------------------");
		System.out.println("TEST NON SYNCHRONIZED POINT DECORATOR");
		System.out.println("------------------------------------------------------------");

		DiagonalDraggablePoint sp = new SequentialPoint();
		
		PointDragger pd1 = new PointDragger(sp, "Thread 1");
		PointDragger pd2 = new PointDragger(sp, "Thread 2");
		
		Thread t1 = new Thread(pd1);
		Thread t2 = new Thread(pd2);
		
		t1.start();
		t2.start();
		
		while(t1.isAlive() || t2.isAlive())
			;
		
		sp.currentPosition("main");
	

		System.out.println("------------------------------------------------------------");
		System.out.println("TEST SYNCHRONIZED POINT DECORATOR");
		System.out.println("------------------------------------------------------------");

		DiagonalDraggablePoint ssp = new SynchronizedPoint(new SequentialPoint());
		
		pd1 = new PointDragger(ssp, "Thread 1");
		pd2 = new PointDragger(ssp, "Thread 2");
		
		t1 = new Thread(pd1);
		t2 = new Thread(pd2);
		
		t1.start();
		t2.start();
		
		while(t1.isAlive() || t2.isAlive())
			;
		
		sp.currentPosition("main");
	}

}
