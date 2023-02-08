package day03;

public class Program03 {

	public static int fun() {
	int a=10;
	int b=11;
	int c=5;
	System.out.println(a*a);
	System.out.println(a+b);
	System.out.println(a/c);
	return (b+c)*a;
	

	}
public static void main(String[] args) {
	int d=20;
	int e=fun();
	System.out.println(d+e);
}

}
