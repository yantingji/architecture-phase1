package a18_Auto;

import java.util.Scanner;

public class Auto {
	private Integer tyre;
	private static String color;
	private Integer weight;
	private Integer speed;
	public Integer speed1=0;
	
	
	public void settyre(Integer i) {
		this.tyre=i;
	}
	public  Integer  gettyre() {
		return tyre;
		
	}
	public void settcolor(String color) {
		this.color=color;
	}
	public static String  getcolor() {
		return color;
		
	}
	public void settweight(Integer weight) {
		this.weight=weight;
	}
	public  Integer  getweight() {
		return weight;
		
	}
	public void setspeed(Integer speed) {
		this.speed=speed;
	}
	public  Integer  getspeed() {
		return speed;
		
	}
	
	public void  speed(int i) {
		setspeed(i*5);
		
	}
	void xx() {
		boolean stop=true;
		do {
			System.out.print("请输档位数:正数前进，负数倒退:刹车档是:0");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		speed(num);
		if(num==0) {
			
			
		
				stop=false;
		}
		speeddisplay();
		this.speed1=getspeed();
		
		}while(stop);
	}
	
	public void speeddisplay() {
		System.out.println("变速之前的速度为."+this.speed1);
		if(getspeed()<0) {
			if(this.speed<this.speed1) {
				System.out.println("加速倒车中.......");
			}else {
				System.out.println("减速速倒车中.......");
			}
			System.out.println("速度:"+getspeed());
		}else if(getspeed()==0) {
			System.out.println("停车中=====");
		}else if(getspeed()>0) {
			if(this.speed>this.speed1) {
				System.out.println("加速中.......");
			}else {
				System.out.println("减速中.......");
			}System.out.println("速度:"+getspeed());
			
		}
		this.speed1=getspeed();
	}
	public void display() {
		System.out.println("轮胎:"+gettyre());
		System.out.println("染色:"+color);
		System.out.println("重量:"+getweight());
	}
public Auto() {}
public Auto(Integer tyre,Integer weight,String color) {
	settcolor( color);
	settyre(tyre);
	settweight(weight);
	display();
	
}

}
