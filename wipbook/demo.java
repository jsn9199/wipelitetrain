package com.wipbook;

import java.util.InputMismatchException;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
	Scanner scan =new Scanner(System.in);
	int n=0;
	int m=0;
	int res=0;
	try {
	n=scan.nextInt();
	m=scan.nextInt();
	res=n/m;
	}
	catch(InputMismatchException e) {
		System.out.println("input mis"+e);
	}
	catch(ArithmeticException e) {
		System.out.println("not divided by zero"+e);
	}
	System.out.println(res);

	}

}