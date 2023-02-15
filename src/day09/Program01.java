package day09;

public class Program01 {

	public static void main(String[] args) {
		int a=30;
		int b=60;
		int c=100;
		if ((a>=b)&&(a>=c)) 
		{
			if((a==b) && (a==c))
			{
			System.out.println("a,b,c are equal..");	
			}
			else if(( a==b) && (a>c))
			{
			System.out.println("a & b are equal and greater than c..");
			
			}
			else if((a==c)&&(a>b))
			{
				System.out.println("a & c are equal and greater than b..");
				
			}
			else if (b>c)
			{
				System.out.println("a is greater than b and b is greater than c...");
			}
			else if (c>b)
			{
				System.out.println("a is greater than c and c is greater than b..");
			
			}
			else
			{
				System.out.println("a is greater than b and c and b & c are equal...");
			}
		
		}
			
		
			
		else if (b>=a && b>=c)
			{
				
			if (a==c)
				{
					System.out.println("b is greater than a and c & a and c are equal...");
				}
				else if (c>a)
				{
				System.out.println("b is greater than c and c is greater than a...");
				}
				else if (a>c)
				{
					System.out.println("b is greater than a & a is grester than c..");
				}
				else
				{
					System.out.println("if b and c are equal and c is greater than a..");
					
				}
				
					
			}
		else 
		{
		if (a>b) 
		{
			System.out.println("c is greater than a and a is greater than b..");
		}	
		else if (b>a)
		{
			System.out.println("c is greater than b and b is greater than a..");
		}
		else
		{
			System.out.println("c is greater than a &b and a & b are equal..");
		}
			
			
			
			
			
			
			
			
			
			
		}
				
			
	}
			
		
		
		
		
	
		
				
		
		
		
		
		
		
		}

