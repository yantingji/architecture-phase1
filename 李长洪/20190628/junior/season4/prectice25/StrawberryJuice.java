package prectice25;

public class StrawberryJuice extends Water implements Buffer,Filter,Suger{

	@Override
	public void buffer() {
		System.out.println("»º³å");
	}

	@Override
	void water() {
		System.out.println("Ë®");
	}

	@Override
	public void filter() {
		System.out.println("¹ıÂË");
	}

	@Override
	public void suger() {
		System.out.println("ÌÇ");
	}
	
	
}