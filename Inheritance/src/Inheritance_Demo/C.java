package Inheritance_Demo;

public class C  extends B{

	public void m4() {
		
		System.out.println("M4 odf C--------------");
	}
	
	public static void main(String[] args) {
		
		B b =new C();
		
		System.out.println(b.x);
		System.out.println(b.y);
		
		b.m1();
		b.m2();
		b.m3();
	}
}
