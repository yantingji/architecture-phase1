package a22_Vehicle;

public class InterfaceDemo {

	public static void main(String[] args) {
		Vehicle bike=new Bike();
		Vehicle bus=new Bus();
		bike.start();
		bike.stop();
		bus.start();
		bus.stop();

	}

}
