package prectice22;

public class Bike implements Vehicle {

	@Override
	public void start(int a) {
		System.out.println("Bike的start方法");
	}

	@Override
	public void stop(String b) {
		System.out.println("Bike的stop方法");
	}

}
