package a25_Water;

public class Applejuice extends Water implements Filter,Buffer,Fruitjuice {

	public static void main(String[] args) {
		Applejuice applejuice=new Applejuice();
		applejuice.play("ƻ��֭");
		Applejuice ��ݮ=new Applejuice();
		applejuice.play("��ݮ֭");

	}
	void play(String string) {
		water();
		filter();
		buffer();
		fruitjuice( string);
	}

	@Override
	public void filter() {
		 System.out.println("2����");

		
	}

	@Override
	public void buffer() {
		System.out.println("3����");
		
	}

	@Override
	public void fruitjuice() {
		System.out.println("4��ӹ�֭");
		
	}
	public void fruitjuice(String string) {
		System.out.println("4���"+string);
		
	}

	@Override
	public void water() {
		 System.out.println("1ȡˮ");
		
	}

}
