
public class User {
	private int id;
	private String password;
	private String emil;
	public User() {}
	public User(int id,String password,String emil){
		this.id=id;
		this.password=password;
		if(0<emil.indexOf("@")) {
			this.emil=emil;
		}
			this.emil=emil+"@itedu.com";
	}
	public User(int id,String password) {
		this.id=id;
		this.password=password;
		this.emil=id+"@itedu.com";
	}
	public void display() {
		System.out.println("id£º"+id+",ÃÜÂë£º"+password+",ÓÊÏä£º"+emil);
	}
}
