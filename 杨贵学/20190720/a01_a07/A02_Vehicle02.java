package a01_a07;
import java.util.Scanner;

public class A02_Vehicle02 {
	private  Integer speed;
	private  Integer size;
	private Object Scanner;
	
	void move(int num) {
		if(num>0) {
			System.out.println("������ʻ�ٶ���:"+this.speed);
		} else if(num<0) {
			System.out.println("�����ٶ��ٶ���:"+this.speed);
		}else {
			System.out.println("����ֹͣ״̬:"+this.speed);
		}
	}
	void move() {
		this.speed=0;
		System.out.println("����ֹͣ״̬:"+this.speed);
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
			System.out.print("���䵵λ����");
			System.out.print("ɲ������:0");
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
	System.out.println("���ڳ�ʼ�ƶ��ٶ���:"+speed);;
	System.out.println("��ʼ�ٶ���:"+size);
}

	public static void main(String[] args) {
		A02_Vehicle02 Car=new A02_Vehicle02(0,50);
		Car.xx();
		

	}

}
