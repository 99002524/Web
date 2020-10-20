package com.sid.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo {
  public static void main(String args[]) {
	  Student stu1=new Student("Sidhanta","Rourkela",5788468);
	  Student stu2=new Student("Rahul","Nepal",5788469);
	  Student stu3=new Student("Naveen","Darbhanga",5788465);
	  Student stu4=new Student("Raj","Berhampur",5788471);
	  Student stu5=new Student("Sai","Chennai",5788450);
	  
	  ArrayList<Student> studentList =new ArrayList<>();
	  studentList.add(stu1);
	  studentList.add(stu2);
	  studentList.add(stu3);
	  studentList.add(stu4);
	  studentList.add(stu5);
	  
	  //for(Student stud: studentList) {
		//  System.out.println(stud);
		  
		  Collections.sort(studentList);
		  
		  for(Student stud: studentList) {
			  System.out.println(stud);
		  
	  }
  }
}
