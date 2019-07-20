package a09_networkUser;

public class NetUser {
	private String id;
	private Integer Password;
	private String email;
	public void setId(String id) {
		this.id=id;
	}
	public String getId() {
		return email;
		
	}
	public NetUser() {}
	public NetUser(String id,Integer password,String email) {
		this.id=id;
		this.Password=password;
		this.email=id+email;
	}
		public void plasy() {
			System.out.println("用户ID:"+id);
			System.out.println("用户密码:"+Password);
			System.out.println("邮箱账号:"+email);
		}
	

	public static void main(String[] args) {
		NetUser user= new NetUser("yangtingji",123456,"@itedu.com");
		user.plasy();
	}
	}