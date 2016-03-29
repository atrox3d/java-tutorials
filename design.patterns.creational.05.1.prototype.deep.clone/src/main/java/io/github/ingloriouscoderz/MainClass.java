package io.github.ingloriouscoderz;

import model.Employee;
import model.Employees;

public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		Employees copy = emps.clone();
		System.out.println(copy != null);
		copy.getEmpList().add(new Employee().setId(4).setName("test"));
	
		System.out.println(emps.getEmpList());
		System.out.println(copy.getEmpList());
	}

}
