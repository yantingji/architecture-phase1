
public class Number {
	private int n1;
	private int n2;
	private int n3=0;
	public Number() {
	}
	public Number(int a, int b) {
		this.n1=a;
		this.n2=b;
	}
	//加
	public void addition() {
		 n3= this.n1+this.n2;
		System.out.println("他们的和为"+n3);
	}
	//减
	public void subtration() {
		 n3= this.n1-this.n2;
		System.out.println("他们的差为"+n3);
	}
	//乘
	public void multiplication() {
		 n3= this.n1*this.n2;
		System.out.println("他们的积为"+n3);
	}
	//除
	public void division() {
		 n3= this.n1/this.n2;
		 int n4=this.n1%this.n2;
		System.out.println("他们的商为"+n3+"."+n4);
	}

}
