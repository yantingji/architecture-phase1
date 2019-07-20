package a01_a07;
import java.util.Scanner;

public class A02_Vehicle02 {
	private  Integer speed;
	private  Integer size;
	private Object Scanner;
	
	void move(int num) {
		if(num>0) {
			System.out.println("现在行驶速度是:"+this.speed);
		} else if(num<0) {
			System.out.println("倒退速度速度是:"+this.speed);
		}else {
			System.out.println("现在停止状态:"+this.speed);
		}
	}
	void move() {
		this.speed=0;
		System.out.println("现在停止状态:"+this.speed);
	}
		
		
	void speedUp(int speed) {
		this.speed=speed*10;
		move(speed);
	}
	void speedDown(int speed) {
		this.speed=speed*10;
		move(speed);
	}
	void xx() {
		boolean stop=true;
		do {
			System.out.print("请输档位数：");
			System.out.print("刹车档是:0");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num>0) {
			
			speedUp(num);
		}
		else if(num<0) {
			speedDown(num);
			}else {
				stop=false;
				move();
			}
		
		
		}while(stop);
	}
public A02_Vehicle02() {}
public A02_Vehicle02(int i,int j) {
	this.speed=i;
	this.size=j;
	System.out.println("现在初始移动速度是:"+speed);;
	System.out.println("初始速度是:"+size);
}

	public static void main(String[] args) {
		A02_Vehicle02 Car=new A02_Vehicle02(0,50);
		Car.xx();
		

	}

}
