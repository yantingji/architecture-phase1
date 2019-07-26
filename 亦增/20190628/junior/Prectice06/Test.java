package Prectice06;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetSet ge = new GetSet();
		ge.setAge(1000);
		int a=ge.getAge();
		ge.setName("é°‘åå");
		String b=ge.getName();
		Person pea = new Person(b,a);
		pea.display();
	}

}
