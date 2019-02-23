package Aggrigation;

public class Test {

	public static void main(String[] args) {
		
		Student stu= new Student();
	    stu.setRollno("33");
	    stu.setName(" Amit ");
	    
	    Address adr=new Address();
	    
	    adr.setArea("pune");
	    adr.setCity("Akurdi");
	    
	    stu.setAddress(adr);

	    System.out.println(stu.getName() + stu.getRollno() +" "+  adr.getArea()+ " " + adr.getCity());
	}
}
