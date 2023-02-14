package day08;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		
		System.out.println("Enter the number...");
		
		int p = x.nextInt();
		x.close();
		
		
		
		
		if (p%2==0)
		{
			System.out.println("p is even...");

	        }
		else 
		{
			System.out.println("p is odd...");
		
			}
		}

}
