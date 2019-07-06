package junior.season4.prectice04;

public class Number {
	private int n1;
	public int getN1() {
		return n1;
	}
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public int getN2() {
		return n2;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	private int n2;
	private int n3=0;
	public Number() {
	}
	public Number(int a, int b) {
		this.n1=a;
		this.n2=b;
	}
	public void addition() {
		 n3= this.n1+this.n2;
		System.out.println("���ǵĺ�Ϊ"+n3);
	}
	public void subtration() {
		 n3= this.n1-this.n2;
		System.out.println("���ǵĲ�Ϊ"+n3);
	}
	public void multiplication() {
		 n3= this.n1*this.n2;
		System.out.println("���ǵĻ�Ϊ"+n3);
	}
	public void division() {
		 n3= this.n1/this.n2;
		 int n4=this.n1%this.n2;
		System.out.println("���ǵ���Ϊ"+n3+"."+n4);
	}

}
