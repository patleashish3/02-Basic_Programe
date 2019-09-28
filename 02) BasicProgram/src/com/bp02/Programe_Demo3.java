package com.bp02;

import java.util.Scanner;

public class Programe_Demo3 {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		int num1;
		String word1;
		System.out.println("Enter a Number");
		
		num1 = input.nextInt(); //read input for num1
		System.out.println("Enter a word");
		
		word1 = input.next(); //read input for word
		System.out.println("Your inputs are.....");
		
		System.out.println("The Number you have Entered is" +num1);
		System.out.println("The Number you have Entered is" +word1);
		
	}

}
