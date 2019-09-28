package com.bp02;

public class SwapNos_Demo {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int temp;
		System.out.println("---Before swapping---");
		System.out.println("Value of num1 is:" + num1);
		System.out.println("Value of num2 is:" + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("---After swapping---");
		System.out.println("Value of num1 is:" + num1);
		System.out.println("Value of num2 is:" + num2);

	}

}
