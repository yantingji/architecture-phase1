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
		//前进
		public void speedUp() {
			speed+=5;
			System.out.println("加速");
		}
		//后退
		public void speedDown() {
			speed-=5;
			System.out.println("减速");
		}
		
		public void stop() {
			speed=0;
			System.out.println("停止");
		}
		
}
