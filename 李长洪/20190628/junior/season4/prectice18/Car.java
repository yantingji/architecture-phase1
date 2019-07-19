package prectice18;

public class Car extends Auto{
	private String air;
	private String CD;
	public String getAir() {
		return air;
	}
	public void setAir(String air) {
		this.air = air;
	}
	public String getCD() {
		return CD;
	}
	public void setCD(String cD) {
		CD = cD;
	}
	//前进
	public void speedUp() {
		System.out.println("小汽车加速");
	}
	//后退
	public void speedDown() {
		System.out.println("小汽车减速");
	}
	
}
