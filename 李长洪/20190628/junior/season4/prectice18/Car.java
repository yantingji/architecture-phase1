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
	//ǰ��
	public void speedUp() {
		System.out.println("С��������");
	}
	//����
	public void speedDown() {
		System.out.println("С��������");
	}
	
}
