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
		return "我会唱歌";
	};

	@Override
	void play() {
		System.out.println(this.getname());
		System.out.println("年龄::"+this.getage());
		System.out.println(this.getsex());
		System.out.println(this.sing());
		System.out.println("薪水;"+this.salary);
		System.out.println("职工编号:"+ID);
		System.out.println("====");
		
	}

}
