package prectice18;

public class Auto {
	private int tyrenum;
	private String color;
	private int weight;
	private int speed;
	public Auto(int Tyrenum,String Color,int Weight,int Speed) {
		this.tyrenum = Tyrenum; 
		this.color=Color;
		this.weight=Weight;
		this.speed=Speed;
	}
	public Auto() {}
		//ǰ��
		public void speedUp() {
			speed+=5;
			System.out.println("����");
		}
		//����
		public void speedDown() {
			speed-=5;
			System.out.println("����");
		}
		
		public void stop() {
			speed=0;
			System.out.println("ֹͣ");
		}
		
}
