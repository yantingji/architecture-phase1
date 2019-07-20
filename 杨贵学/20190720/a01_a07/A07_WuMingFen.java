package a01_a07;

public class A07_WuMingFen {
	public String theMa;
	public  int quantity;
	public boolean likeSoup;
	
	public A07_WuMingFen() {}
	public A07_WuMingFen(String string, int i) {
		this.theMa=string;
		this.quantity=i;
	}
	public A07_WuMingFen(String theMa,int quantity,boolean likeSoup) {
		this.theMa=theMa;
		this.quantity=quantity;
		this.likeSoup=likeSoup;
	}
	void check() {
		System.out.println("面码:"+theMa);
		System.out.println("粉的分量(两):"+quantity);
		if(likeSoup) {
			System.out.println("是否带汤:带汤");
			
		}else {
			System.out.println("是否带汤:不带汤");
		}
		System.out.println("-----------");
		
	}

	public static void main(String[] args) {
		A07_WuMingFen f1 = new A07_WuMingFen("牛肉",3,true); 
		A07_WuMingFen f2 = new A07_WuMingFen("牛肉",2); 
		A07_WuMingFen f3 = new A07_WuMingFen("酸辣粉",2,true); 
		f1.check();
		f2.check();
		f3.check();

	}

}
