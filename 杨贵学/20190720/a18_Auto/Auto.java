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
			System.out.print("���䵵λ��:����ǰ������������:ɲ������:0");
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
		System.out.println("����֮ǰ���ٶ�Ϊ."+this.speed1);
		if(getspeed()<0) {
			if(this.speed<this.speed1) {
				System.out.println("���ٵ�����.......");
			}else {
				System.out.println("�����ٵ�����.......");
			}
			System.out.println("�ٶ�:"+getspeed());
		}else if(getspeed()==0) {
			System.out.println("ͣ����=====");
		}else if(getspeed()>0) {
			if(this.speed>this.speed1) {
				System.out.println("������.......");
			}else {
				System.out.println("������.......");
			}System.out.println("�ٶ�:"+getspeed());
			
		}
		this.speed1=getspeed();
	}
	public void display() {
		System.out.println("��̥:"+gettyre());
		System.out.println("Ⱦɫ:"+color);
		System.out.println("����:"+getweight());
	}
public Auto() {}
public Auto(Integer tyre,Integer weight,String color) {
	settcolor( color);
	settyre(tyre);
	settweight(weight);
	display();
	
}

}
