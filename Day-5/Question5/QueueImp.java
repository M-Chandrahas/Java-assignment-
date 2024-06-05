package com.ey.Question5;



import java.util.*;

import com.ey.Question4.Employee;

public class QueueImp {

	public static void main(String[] args) {
		Queue<Object> q= new LinkedList<>();
		q.add(1);
		q.add("sai");
		q.add(2.3);
		q.add(3.3f);
		q.add(true);
		q.add(Employee.class);
		System.err.println(q);
		
	}
	
}