package a26_Role;

public class Employee extends Role{
	private double salary;
	static Integer ID;
	public void setsalary(Integer salary) {
		this.salary=salary;
	}
	public double getsalary() {
		return salary;
		
	}
	public void setID(Integer ID) {
		this.ID=ID;
	}

	Employee(){
		
	}
	Employee(String name,Integer age,String sex){
		super(name,age,sex);
	}
	
	final String sing() {
		return "�һᳪ��";
	};

	@Override
	void play() {
		System.out.println(this.getname());
		System.out.println("����::"+this.getage());
		System.out.println(this.getsex());
		System.out.println(this.sing());
		System.out.println("нˮ;"+this.salary);
		System.out.println("ְ�����:"+ID);
		System.out.println("====");
		
	}

}
