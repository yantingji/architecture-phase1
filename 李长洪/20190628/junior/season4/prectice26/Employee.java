package prectice26;

public class Employee extends Role {
	private int salary;
    static private String id  = "9527";
    public Employee() {};
    public Employee(int salary) {
    	this.salary=salary;
    };
    public Employee(int salary,String id,String name,int age,String sex) {
		super.name=name;
		super.age=age;
		super.sex=sex;
		this.salary=salary;
    };
    
    
	@Override
	void play() {
		System.out.println("play");
	}
	public final void sing() {
		System.out.println("����"+super.name+" ����"+super.age+" ����"+this.salary+" ID"+id);
	}
}
