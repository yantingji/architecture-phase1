package a08_Vehicles;

public class Car extends Vehicles{
	public int seats;

	public Car(String brand, String color,int i) {
		super(brand, color);
		this.seats=i;
		
	}
	void showCar(int i) {
		System.out.println("�������");
	}
	@Override
	public void showInfo () {
		System.out.println("��ɫ:"+Vehicles.getcolor());
		System.out.println("�̱�:"+Vehicles.getBrand());
		System.out.println("��λ����::"+seats);
	} 
	

}
