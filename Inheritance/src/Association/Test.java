package Association;

public class Test {

public static void main(String[] args) {
	
	Bank bank=new Bank();
	bank.setName("SBI");
	
	Employee emp=new Employee();
	emp.setName("Amit");
	
	System.out.println(emp.getName() + " is employee of " + bank.getName() + " Bank ");
}
	
}
