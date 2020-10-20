package com.sid.training;
public class Student implements Comparable<Student>{
  private String name;
  private String city;
  private Integer rollno;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Integer getRollno() {
	return rollno;
}
public void setRollno(Integer rollno) {
	this.rollno = rollno;
}
public Student(String name, String city, Integer rollno) {
	super();
	this.name = name;
	this.city = city;
	this.rollno = rollno;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public String toString() {
	return "name: "+name+" city: "+city+" rollno: "+rollno;
}
public int compareTo(Student stu) {
   return this.getRollno().compareTo(stu.getRollno()) ;
}
}
