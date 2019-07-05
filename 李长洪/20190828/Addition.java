
public class Addition {
	private int num1;
	private int num2;
	public Addition() {
	}
	public Addition(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public Addition(String num1,String num2) {
		this.num1=Integer.parseInt(num1);
		this.num2=Integer.parseInt(num2);
	}
	public Addition(String num1,int num2) {
		this.num1=Integer.parseInt(num1);
		this.num2=num2;
	}
	public Addition(byte  num1,byte  num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public Addition(long num1,long num2) {
		this.num1=(int)num1;
		this.num2=(int)num2;
	}
	public Addition(float  num1,float   num2) {
		this.num1=(int)num1;
		this.num2=(int)num2;
	}
	public Addition(double num1,double  num2) {
		this.num1=(int)num1;
		this.num2=(int)num2;
	}

	public void add() {
		int num3=num1+num2;
		System.out.println("他们的和为"+num3);
	}
}
