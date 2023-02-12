package day07;

public class Program03 {

	public static void main(String[] args) {
		// && || !
		int a= 25;
		int b= 50;
		int c= 40;
		System.out.println((a>b)&&(a>c));
		System.out.println((b>a)&&(b>c));
		System.out.println((c>a)&&(c>b));
		
		
		System.out.println((a>b)||(a>c));
		System.out.println((b>a)||(b>c));
		System.out.println((c>a)||(c>b));
		
		System.out.println(!(a>b));
		System.out.println(!(b>c));
		System.out.println(!(c<a));
		
		
	}

}
