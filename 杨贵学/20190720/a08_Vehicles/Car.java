package a08_Vehicles;

public class Car extends Vehicles{
	public int seats;

	public Car(String brand, String color,int i) {
		super(brand, color);
		this.seats=i;
		
	}
	void showCar(int i) {
		System.out.println("额定载人数");
	}
	@Override
	public void showInfo () {
		System.out.println("颜色:"+Vehicles.getcolor());
		System.out.println("商标:"+Vehicles.getBrand());
		System.out.println("座位数量::"+seats);
	} 
	

}
