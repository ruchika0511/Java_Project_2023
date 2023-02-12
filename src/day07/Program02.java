package day07;

public class Program02 {

	public static void main(String[] args) {
		// < > <= >= == != ----->true/false
		int a= 2;
		int b= 3;
		double c= 4;
		System.out.println(a>b);//f
		System.out.println(b>a);//t
		System.out.println(a<b);//t
		System.out.println(b<a);//f
		System.out.println("###########");
		System.out.println(a<=b);
		System.out.println(b>=a);
		System.out.println(a>=b);
		System.out.println(a<=c);
		System.out.println("##########");
		System.out.println(a!=b);
		System.out.println(b!=a);
		System.out.println(a!=c);
		System.out.println(b!=c);
		System.out.println(b==c);
		System.out.println(a==b);
	}

}
