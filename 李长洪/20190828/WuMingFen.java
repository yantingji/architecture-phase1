
public class WuMingFen {
	public String theMa;
	public int quantity;
	public boolean likeSoup;
	//���췽��
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
		this.theMa="����";
		this.quantity=2;
		this.likeSoup=true;
	}
	public void check(){
		if(likeSoup) {
			System.out.println(this.theMa+"����,"+this.quantity+"��,"+"����");
		}else {
			System.out.println(this.theMa+"���룬"+this.quantity+"����"+"������");
		}
	}

}
