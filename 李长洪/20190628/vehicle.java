
public class vehicle {
	//�ٶ�
	int speed;
	//���
	int size = 10;
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
