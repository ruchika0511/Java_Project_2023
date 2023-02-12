package day07;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		// + - * /(Q) %(R) Numbers
		Scanner x= new Scanner(System.in);
		System.out.println("Enter int value of a..");
		int a= x.nextInt();
		System.out.println("Enter int value of b..");
	    int b= x.nextInt();
	    		System.out.println("Enter double value of c..");
	    double c= x.nextDouble();
	    
//int() int---->int
	    //int () double---->double
	    //int () float----->float
	   
	   System.out.println(a+b);
	   System.out.println(b+c);
	   System.out.println(a+c);
	   System.out.println(a-b);
	   System.out.println(b-c);
	   System.out.println(a-c);
	   System.out.println(a*b);
	System.out.println(b*c);
	System.out.println(a*c);
	System.out.println(a/b);
	System.out.println(b/c);
	System.out.println(a/c);
	System.out.println(a%b);
	System.out.println(b%c);
	System.out.println(a%c);
	
	
	
	
	
	}

}
