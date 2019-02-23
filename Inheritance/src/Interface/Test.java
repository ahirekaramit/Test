package Interface;

public class Test implements I,I1{
	
	
	public void m1() {
		
	System.out.println("Hello");	
	}
	
	public void m2() {
		
		System.out.println("Bye");
	}
	
	
	
	public static void main(String[] args) {
		
		Test t=new Test();
		
																																										
		
		t.m1();
		t.m2();
	}
}
