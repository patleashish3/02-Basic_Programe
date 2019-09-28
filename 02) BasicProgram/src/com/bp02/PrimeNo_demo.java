package com.bp02;

public class PrimeNo_demo {
	public static void main(String[] args) {
		int i, m = 0, flag = 0;
		int n = 17; // number to be checked
		m = n / 2;
		for (i = 2; i <= m; i++) {
			if (n % i == 0)
				;
			{
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println("Number is Prime");
		else
			System.out.println("Number is not Prime");

	}

}
