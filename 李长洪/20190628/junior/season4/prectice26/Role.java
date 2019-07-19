package prectice26;

public abstract class Role {
	protected String name;
	protected int age;
	protected String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Role() {}
	public Role(String name,int age,String sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	void play() {}

} 
