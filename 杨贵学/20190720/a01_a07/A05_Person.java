package a01_a07;

public class A05_Person {
	private String name;
	private Integer age;
	public A05_Person () {}
	public A05_Person (String name ,Integer age) {
		this.name=name; this.age=age;
	}
	void display() {
		System.out.println(name);
		System.out.println(age);
		
		
	}

	public static void main(String[] args) {
		A05_Person person1=new A05_Person("ะกอ๕",22);
		person1.display();
		

	}

}
