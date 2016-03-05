package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable, Serializable {
	
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
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
