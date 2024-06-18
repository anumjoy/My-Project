package package3;

public class Manager extends Employee{

	int hra=5000;

	public static void main(String[] args) {
	Manager m=new Manager();
	m.name="Anu";
	m.display();
	System.out.println("Name is:"+m.name);
	
	
	int totalSalary=m.basicpay+m.hra; //local variable, so cant be used in child class(in HrManager)
	System.out.println("Total salary of manager is:"+totalSalary);
	}

}
