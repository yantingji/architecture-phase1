package a17_Father;

public class Father {
	
	public String src="aa1";
}
class Son extends Father{
	public Son() {
		System.out.println(src);
	}
	public static void main(String[] args) {
		Son son=new Son();

	}
	
}