package com.sid.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
   public static void main(String args[]) {
	   List<Employee> employeeList=new ArrayList<>();
	   Employee emp1=new Employee("sidhanta","Rourkela",50000.0);
	   employeeList.add(emp1);
	   Employee emp2=new Employee("raj","Berhampur",60000.0);
	   employeeList.add(emp2);
	   Employee emp3=new Employee("sai","Chennai",40000.0);
	   employeeList.add(emp3);
	   Iterator<Employee> iter =employeeList.iterator();
	   while(iter.hasNext()) {
		   Employee emp=iter.next();
		   System.out.println(emp);
		   
		   for(Employee employ:employeeList) {
			  System.out.println(employ); 
		   }
		   ListIterator<Employee> listIter= employeeList.listIterator(employeeList.size());
		   while(listIter.hasPrevious()) {
			   Employee employee=listIter.previous();
			   System.out.println(employee);
		   }
			   
	   }
   }
}
