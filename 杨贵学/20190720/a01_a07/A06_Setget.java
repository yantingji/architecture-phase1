package a01_a07;

public class A06_Setget {
	private static String name;
	private Integer age;
	public  void setname(String name1) {
		this.name=name1;
	}
	public static String getname() {
		return name;
	}
	public void setage(Integer age1) {
		this.age=age1;
	}
	public Integer getage() {
		return age;
		
	}
	

	public static void main(String[] args) {
		A06_Setget person=new A06_Setget();
		person.setname("Ğ¡Íõ");
		person.setage(22);
		
		String i =getname();
		System.out.println(i);
		System.out.println(person.age);
		
		
		
	}

}
