package com.arcus;

public class Employee {
String ename;

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}
public void displayInfo() {
	System.out.println("Hi Mr./Mrs. "+ename);
}
}
