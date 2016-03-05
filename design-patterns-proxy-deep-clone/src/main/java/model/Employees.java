package model;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Employee> empList;

	public Employees(List<Employee> emplist) {
		super();
		this.empList = emplist;
	}

	public Employees() {
		empList = new ArrayList<Employee>();
	}
	
	public void loadData() {
		empList.add(new Employee().setId(0).setName("bob"));
		empList.add(new Employee().setId(1).setName("entoni"));
		empList.add(new Employee().setId(2).setName("palmer"));
	}
	
	public List<Employee> getEmpList() {
		return empList;
	}
	
	@Override
	public  Employees clone() throws CloneNotSupportedException {
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream out = new ObjectOutputStream(bos);
			out.writeObject(this);
			out.flush();
			
			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream in = new ObjectInputStream(bis);
			return (Employees) in.readObject();
		} catch (Exception e) {
			System.out.println("exception cloning, message :" +  e);
		}
		return null;
	}
}
