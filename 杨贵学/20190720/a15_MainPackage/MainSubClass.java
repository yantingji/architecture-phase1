package a15_MainPackage;

public class MainSubClass extends MainClass{

	public MainSubClass() {
		
	}
	public MainSubClass(String string) {
		super(string);
	}

	public static void main(String[] args) {
		MainSubClass member=new MainSubClass("С��");
		System.out.println(member);

	}
	public static void  id() {
		System.out.println("ѧ��123");
	}
	public  void  iid() {
		System.out.println("ѧ��123");
	}

	@Override
	public String food() {
		
		return "ϲ���㽶";
	}
	public String toString() {
		return "name="+getName();
		
	}

}
