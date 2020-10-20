package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortDemo {
	public static void main(String args[]) {
		Employee employee1 = new Employee("Pradeep","Mysore",122);
		Employee employee2 = new Employee("Rama","Banglore",124);
		Employee employee3 = new Employee("Ravi","Manglore",125);
		Employee employee4 = new Employee("Raman","Mandya",126);
		ArrayList<Employee> employeeList = new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		employeeList.add(new Employee("Akashay","Jammu",111));
		for(Employee emp1 : employeeList) {
			System.out.println(emp1);
		}
		Collections.sort(employeeList, new NameSort());
		System.out.println("Sorted by Name");
		for(Employee emp1 : employeeList) {
			System.out.println(emp1);
		}
		Collections.sort(employeeList, new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				// TODO Auto-generated method stub
				return emp1.getCity().compareTo(emp2.getCity());
			}
			
		});
		System.out.println("Sorted by City");
		for(Employee emp1 : employeeList) {
			System.out.println(emp1);
		}
		Collections.sort(employeeList, (emp1,emp2)->{
			return emp1.getEmpId().compareTo(emp2.getEmpId());
			
		});
		System.out.println("Sorted by Employee");
		for(Employee emp1 : employeeList) {
			System.out.println(emp1);
		}
		
	}

}
