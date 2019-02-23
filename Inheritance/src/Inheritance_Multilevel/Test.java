package Inheritance_Multilevel;

public class Test {

	public static void main(String[] args) {
		
		C c=new C(100);    // Constructor execute always parent to child.
	
		
		System.out.println(c.x);
	    System.out.println(c.y);
		
	    c.m2(5657558);
		c.m3();
		c.m1();
	}
}
