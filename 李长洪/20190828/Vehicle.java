
public class Vehicle {
	//�ٶ�
	int speed;
	//���
	int size = 10;
	//�̱�
	public String trademark;
	//��ɫ
	public String color;
	//���췽��
	public Vehicle() {
	}
	//���췽��
	public Vehicle(String trademark,String color) {
		this.trademark=trademark;
		this.color=color;
	}
	//��ʾ��Ϣ
	public void showInfo() {
		System.out.println("��ɫ�ǣ�"+this.color+"����"+this.trademark+"��");
	}
	//�ƶ�
	public void move() {
		setSpeed(speed);
	}
	//�㲥
	private void setSpeed(int speed) {
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
	//ǰ��
	public void speedUp() {
		speed+=5;
		size-=2;
	}
	//����
	public void speedDown() {
		speed-=5;
		size+=2;
	}
}
