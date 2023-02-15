package day08;

import java.util.Scanner;

public class Program05 {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
			System.out.println("enter the number:-");
			int a= x.nextInt();
			int b=x.nextInt();
			int c=x.nextInt();
			x.close();
	
	if ((a>b)&&(a>c))
    {
		System.out.println("if a is the greatest number...");
	}
	else if ((b>a)&&(b>c))
	{
		System.out.println("if b is the greatest number...");
	
	}
	else 
	{
		System.out.println("if c is the greatest number...");
	}
	
  }
	
}
