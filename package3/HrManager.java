package package3;

public class HrManager extends Manager {
	
	int ta=5000;
	
	public static void main(String[] args) {
		HrManager h=new HrManager();
		int totalSalary=h.ta+ h.basicpay+h.hra;
		System.out.println("Total salary of HR Manager is:"+totalSalary);

	}

}
