package junior.season4.prectice08;

public class Car extends Vehicles {
	//��λ
	public int seats;
	public Car() {
	}
	public Car(int seats,String color,String trademark) {
		this.seats=seats;
		super.setColor(color);
		super.setTrademark(trademark);
	}
	public void showCar() {
		System.out.println("��"+seats+"��");
	}
}
