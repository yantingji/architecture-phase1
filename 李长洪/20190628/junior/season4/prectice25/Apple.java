package prectice25;

public class Apple extends Water implements Element{

	@Override
	public void element() {
		System.out.println("ÔªËØ");
	}

	@Override
	void water() {
		System.out.println("Ë®");
	}

}
