package junior.season4.prectice02;

public class Vehicle {
	private int speed;
	private int size = 10;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Vehicle() {
	}
	public void move() {
		speedSet(speed);
	}
	public void speedSet(int speed) {
		if(speed==0) {
			System.out.println("ͣ��");
		}else if(speed<0){
			System.out.println("������ע�⣡");
		}
		else {
			System.out.println("�ҵ��ٶ���"+speed+"����ÿСʱ");
		}
		if(size<=0) {
			size=0;
			System.out.println("��������������̬�������Ϊ����");
		}
	}
	public void speedUp() {
		speed+=5;
		size-=2;
	}
	public void speedDown() {
		speed-=5;
		size+=2;
	}
}
