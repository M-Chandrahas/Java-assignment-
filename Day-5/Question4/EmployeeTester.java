package com.ey.Question4;



public class EmployeeTester {
	public static void main(String[] args) {
		EmployeeValidator ev= new EmployeeValidator();
		Employee e1=new Employee(1,"FN","LN");
		Employee e2=new Employee(2,"FN","LN");
		Employee e3=new Employee(3,"FN","LN");
		Employee e4=new Employee(4,"FN","LN");
		Employee e5=new Employee(5,"FN","LN");
		ev.addemployee(e1);
		ev.addemployee(e2);
		ev.addemployee(e3);
		ev.addemployee(e4);
		ev.addemployee(e5);
		
		ev.list();
		
		ev.fnamesort();
		
	}

}
