
public class vehicle {
	//速度
	int speed;
	//体积
	int size = 10;
	//移动
	public void move() {
		setSpeed(speed);
	}
	//广播
	private void setSpeed(int speed) {
		if(speed==0) {
			System.out.println("停车");
		}else if(speed<0){
			System.out.println("倒车请注意！");
		}
		else {
			System.out.println("我的速度是"+speed+"公里每小时");
		}
		if(size<=0) {
			size=0;
			System.out.println("汽车启动光速形态，体积变为粒子");
		}
	}
	//前进
	public void speedUp() {
		speed+=5;
		size-=2;
	}
	//后退
	public void speedDown() {
		speed-=5;
		size+=2;
	}
}
