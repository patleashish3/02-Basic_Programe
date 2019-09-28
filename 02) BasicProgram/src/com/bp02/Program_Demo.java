package com.bp02;

public class Program_Demo {
	// Properties
	// Below are Global Variables
	int a; // Declaration of variable
	int b = 20;// initialization of variable
	// operation

	void m1() {
		a = 10; // Assignment of variable Global variable
		int c = 30; // local varables
		System.out.println(a);
		System.out.println(b);
    }
	
	public static void main(String[] args) {
		Program_Demo cs=new Program_Demo(); //Object Creation
		cs.m1(); //Method calling by object
		System.out.println(cs.b);//global variable calling by object
		
	}

}
