package a14_StaticDemo;

public class StaticDemo {
	static int a=10;
	int b=5;

	public static void main(String[] args) {
		System.out.println(a);
		StaticDemo aa=new StaticDemo();
		System.out.println(aa.b);
		
	}

}
