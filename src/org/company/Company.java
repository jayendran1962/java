package org.company;


public class Company {

	
	public void empId() {
		System.out.println("employee id is ; 123");
	}
	
	private void empName() {
System.out.println("employee name is ; abc");
	}
	
	private void compName() {
System.out.println("cmp nme is : xyz");
	}
   
	public static void main(String[] args) {
		Company a = new Company();
		a.empId();
		a.empName();
		a.compName();
	}
}
