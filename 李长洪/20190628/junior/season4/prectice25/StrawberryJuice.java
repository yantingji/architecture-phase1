package prectice25;

public class StrawberryJuice extends Water implements Buffer,Filter,Suger{

	@Override
	public void buffer() {
		System.out.println("����");
	}

	@Override
	void water() {
		System.out.println("ˮ");
	}

	@Override
	public void filter() {
		System.out.println("����");
	}

	@Override
	public void suger() {
		System.out.println("��");
	}
	
	
}