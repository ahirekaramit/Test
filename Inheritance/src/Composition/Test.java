package Composition;

public class Test {
public static void main(String[] args) {

Car c=new Car();
 Engine e=new Engine();
 
 c.setCar("Swift");
 c.setEnggcc(e);
 
 e.setEngine("Maruti- Suzuki");
 e.setC(c);
 
 
 System.out.println(c.getCar()+"     " +e.getEngine());
 
 

}

}