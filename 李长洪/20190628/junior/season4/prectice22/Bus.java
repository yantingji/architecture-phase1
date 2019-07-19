package prectice22;

public class Bus implements Vehicle {

	@Override
	public void start(int a) {
		System.out.println("Bus的start方法");
	}

	@Override
	public void stop(String b) {
		System.out.println("Bus的stop方法");
	}

}
