package a26_Role;

public abstract class Role {
	private String name;
	private Integer age;
	private String sex;
	protected void setname(String name) {
		this.name=name;
	}
	
	protected String getname() {
		return name;
		
	}
	protected void setage(Integer age) {
		this.age=age;
	}
	
	protected Integer getage() {
		return age;
		
	}
	protected void setsex(String sex) {
		this.sex=sex;
	}
	
	protected String getsex() {
		return sex;
		
	}
	
	abstract void play();
	protected Role() {}
	protected Role(String name,Integer age,String sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	

}
