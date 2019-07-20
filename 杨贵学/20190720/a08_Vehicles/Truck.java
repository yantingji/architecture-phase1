package a08_Vehicles;

import java.awt.geom.Arc2D.Float;

public class Truck extends Vehicles{
	public float load;
	public Truck(String brand, String color,double load) {
		super(brand, color);
		this.load=(float) load;
		
	}


	@Override
	public void showInfo () {
		System.out.println("颜色:"+Vehicles.getcolor());
		System.out.println("商标:"+Vehicles.getBrand());
		System.out.println("载重:"+load);
		
	} 
	public static void main(String[] args) {
		Vehicles truck=new Truck("Mazda","red",3.33333);
		truck.showInfo();
		Vehicles car=new Car("Benz","red",3);
		car.showInfo();
		
	}

}
