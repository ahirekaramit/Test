package Inheritance_Multilevel;

public class C extends B {
int a=1200;

int b=1400;

C(int no){
	int number = no;
	
	
	// System.out.println("Cons");
}
public void m2(int number) {
	
	System.out.println("M2-----C" + number);
	
}

public void m3() {
	
	System.out.println("M3-----C");
}
}