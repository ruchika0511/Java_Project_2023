package day06;

public class Program01 {

	public static void main(String[] args) {

	add(20,30);
	add(1.1,1.2);
	add(23,24,25);
	add(324,854);
	

	
	}

	public static void add(int a, int b) {
	System.out.println(a+b);
	
}
 
	public static void add(double c, double d) {
	System.out.println(c+d);
}

	public static void add(int a, int b, int c) {
	System.out.println(a+b+c);
}
	public static void add(long e, long f) {
		System.out.println(e+f);
	}


}
