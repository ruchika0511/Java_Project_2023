package day05;

public class Program01 {

	public static void addMethod(int a, int b) {
		
		System.out.println(a+b);
	
	
	}
	
	
	private static void subMethod(int a,int b) {
		System.out.println(a-b);
	
	
	}
	
	protected static void mulMethod(int a, int b) {
		System.out. println(a*b);
	
	
	}
	static void sqrMethod(int a) {
		System.out.println(a*a);
		
	
	}
public void addMethodnonstatic(int a, int b) {
		
		System.out.println(a+b);
	
	
	}
	
	
	private void subMethodnonstatic(int a,int b) {
		System.out.println(a-b);
	
	
	}
	
	protected void mulMethodnonstatic(int a, int b) {
		System.out. println(a*b);
	
	
	}
	 void sqrMethodnonstatic(int a) {
		System.out.println(a*a);
		
	
	}
	
	   public static void main(String[]args) {
		
		addMethod(20,30);
		subMethod(40,59);
		mulMethod(60,69);
		sqrMethod(89);
		Program01 x= new Program01();
		x.addMethodnonstatic(23,25);
		x.subMethodnonstatic(56,57);
		x.mulMethodnonstatic(8,59);
		x.sqrMethodnonstatic(9);
		
		
		
	}
    
}
