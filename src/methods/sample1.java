package methods;

public class sample1 {

	public static void main(String []args) {
		
		m1();
		m2();
		sample1 k=new sample1();
		k.m4();
		k.m5();
		
	}
	public static void m1() {
		System.out.println("method m1 is static method in same class");
		
	}
	public static void m2() {
		System.out.println("method m2 is static method in same class");
		
	}
	public  void m4() {
		System.out.println("method m4 is non-static method in same class");
		
	}
	public  void m5() {
		System.out.println("method m5 is non-static method in same class");
		
	}
	
	

}
