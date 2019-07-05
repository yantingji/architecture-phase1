
public class WuMingFen {
	public String theMa;
	public int quantity;
	public boolean likeSoup;
	//构造方法
	public WuMingFen(String theMa,int quantity,boolean likeSoup) {
		this.theMa=theMa;
		this.quantity=quantity;
		this.likeSoup=likeSoup;
	}
	public WuMingFen(String theMa,int quantity) {
		this.theMa=theMa;
		this.quantity=quantity;
	}
	
	public WuMingFen() {
		this.theMa="酸辣";
		this.quantity=2;
		this.likeSoup=true;
	}
	public void check(){
		if(likeSoup) {
			System.out.println(this.theMa+"面码,"+this.quantity+"两,"+"带汤");
		}else {
			System.out.println(this.theMa+"面码，"+this.quantity+"两，"+"不带汤");
		}
	}

}
