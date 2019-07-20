package a25_Water;

public class Applejuice extends Water implements Filter,Buffer,Fruitjuice {

	public static void main(String[] args) {
		Applejuice applejuice=new Applejuice();
		applejuice.play("Æ»¹ûÖ­");
		Applejuice ²ÝÝ®=new Applejuice();
		applejuice.play("²ÝÝ®Ö­");

	}
	void play(String string) {
		water();
		filter();
		buffer();
		fruitjuice( string);
	}

	@Override
	public void filter() {
		 System.out.println("2¹ýÂË");

		
	}

	@Override
	public void buffer() {
		System.out.println("3»º³å");
		
	}

	@Override
	public void fruitjuice() {
		System.out.println("4Ìí¼Ó¹ûÖ­");
		
	}
	public void fruitjuice(String string) {
		System.out.println("4Ìí¼Ó"+string);
		
	}

	@Override
	public void water() {
		 System.out.println("1È¡Ë®");
		
	}

}
