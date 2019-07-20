package a01_a07;

public class A04_Number {
	private  Integer n1;
	private  Integer n2;
	
	
	public A04_Number() {}
	public A04_Number( Integer n1,Integer n2) {
		this.n1=n1;this.n2=n2;
		
		
	}
	public Integer addition() {
		Integer num=this.n1+this.n2;
		return num;
	}
	public Integer  subtration() {
		Integer num=this.n1-this.n2;
		return num;
	}
	public Integer  multiplication() {
		Integer num=this.n1*this.n2;
		return num;
	}
	public Integer division() {
		Integer num=this.n1/this.n2;
		return num;
	}
	public void display() {
		System.out.println("相加:"+addition());
		System.out.println("相减:"+subtration());
		System.out.println("相乘:"+multiplication());
		System.out.println("取整:"+division());
		System.out.println("=========");
	}

	public static void main(String[] args) {
		A04_Number bb=new A04_Number(2,4);
		bb.display();

	}

}
