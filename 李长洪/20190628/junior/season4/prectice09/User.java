package junior.season4.prectice09;

public class User {
	private int id;
	private String password;
	private String emil;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmil() {
		return emil;
	}
	public void setEmil(String emil) {
		this.emil = emil;
	}
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
		System.out.println("id��"+id+",���룺"+password+",���䣺"+emil);
	}
}
