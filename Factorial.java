package com.b12Android.AssignmentPrograms;

import java.util.Scanner;
public class Factorial {
	public static int factorial(int n) {
		if(n==1)
		{return n;}
		return n*factorial(n-1);
	}
	
public static void main(String args[])
{ 
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to find its factorial ");
	System.out.println("Factorial of number 5 is "+ factorial(sc.nextInt()));
	}
}
