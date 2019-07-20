package a15_MainPackage;

public class MainSubClass extends MainClass{

	public MainSubClass() {
		
	}
	public MainSubClass(String string) {
		super(string);
	}

	public static void main(String[] args) {
		MainSubClass member=new MainSubClass("小花");
		System.out.println(member);

	}
	public static void  id() {
		System.out.println("学号123");
	}
	public  void  iid() {
		System.out.println("学号123");
	}

	@Override
	public String food() {
		
		return "喜欢香蕉";
	}
	public String toString() {
		return "name="+getName();
		
	}

}
