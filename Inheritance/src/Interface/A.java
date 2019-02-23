package Interface;

public class A {

	int a=90;
	int b=5;
	
	int c=a+b;
	int d=a/b;
	
	public void add() {
		
		System.out.println(c);
		
	}
	
	public void Div()
	{
		
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		A a= new A();
		a.add();
		a.Div();
		System.out.println("Run");
	}
	
}
