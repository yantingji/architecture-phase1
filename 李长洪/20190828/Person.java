
public class Person {
	private String name;
	private int age;
	public Person() {
		
	}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public void display() {
		System.out.println("我是："+this.name+"，年龄是："+this.age);
	}
	
}
