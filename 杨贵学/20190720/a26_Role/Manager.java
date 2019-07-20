package a26_Role;

public class Manager extends Employee{
	final String vehicle="王经理";
	
	
	public Manager(String string, int i, String string2) {
		super(string,i,string2);
	}


	public static void main(String[] args) {
		Manager manager=new Manager("小王经理",33,"男");
		manager.setsalary(777);
		manager.setID(100);
		manager.play();
		Employee employee=new Employee("小王",33,"男");
		employee.setsalary(500);
		employee.setID(100);
		employee.play();

	}

}
