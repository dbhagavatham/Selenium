package com.hp.exstream.qa.utils;

public class Demo {

	private int employeeId;
	private String employeeName;
	private static int myValue= 0;
	
	
	public void setMyValue(int myValP) {
		myValue = myValP;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	
	public Demo(int empId, String emplyeeName, int Myavlue){
	
		this.employeeId = empId;
		this.employeeName = emplyeeName;
		myValue = Myavlue;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return 		this.employeeId  +" :  "+this.employeeName+" : "+myValue;
	}
	
	public static void main(String[] args) {
		
		Demo obj1 = new Demo(1423,"Phani", 100);
		
		System.out.println(obj1);
		
		
		Demo obj2 = new Demo(1123,"Navadeep", 200);
		
		
		System.out.println(obj2);
		System.out.println(obj1);
	}
}
