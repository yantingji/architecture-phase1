package junior.season4.prectice08;

public  abstract class Vehicles {
	private String trademark;
	private String color;
	public String getTrademark() {
		return trademark;
	}
	public void setTrademark(String trademark) {
		this.trademark = trademark;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Vehicles() {
	}
	public Vehicles(String trademark,String color) {
		this.trademark=trademark;
		this.color=color;
	}
	public void showInfo() {
		System.out.println("颜色:"+this.color+"品牌"+this.trademark);
	}
	public void run() {
		System.out.println("我开动了");
	}
}

