package junior.season4.prectice07;

public class WuMingFen {
	private String theMa;
	private int quantity;
	private boolean likeSoup;
	public String getTheMa() {
		return theMa;
	}
	public void setTheMa(String theMa) {
		this.theMa = theMa;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean isLikeSoup() {
		return likeSoup;
	}
	public void setLikeSoup(boolean likeSoup) {
		this.likeSoup = likeSoup;
	}
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
