
public class Car extends Vehicle {
	//��λ
	public int seats;
	public Car() {
	}
	public Car(int seats,String color,String trademark) {
		this.seats=seats;
		super.color=color;
		super.trademark=trademark;
	}
	public void showCar() {
		System.out.println("��"+seats+"��");
	}
}
