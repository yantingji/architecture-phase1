package Zuoye0628;

public class Vehicle {
//定义速度，体积，商标，颜色
     int speed;
     int size;
     public String trademark;
     public String color;
     //无参数构造方法
     public Vehicle() {
     }
   //有参数构造方法
     public Vehicle(String trademark,String color) {
    	 this.trademark=trademark;
    	 this.color=color;
     }
     //输出车辆信息
     public void showInfo() {
    	 System.out.println("颜色是："+this.color+"，是"+this.trademark+"车");
     }
 	//让车辆移动
 	public void move() {
 		setSpeed(speed);
 	}
 //车辆移动，设置广播
 	private void setSpeed(int speed) {
 		if(speed==0) {
 			System.out.println("请停车");
 		}else if(speed<0){
 			System.out.println("请倒车");
 		}
 		else {
 			System.out.println("速度"+speed);
 		}
 		if(size<=0) {
 			size=0;
 			System.out.println("超级速度模式");
 		}
 	}
 	
 	
 	//使车辆前进
 	public void speedUp() {
 		speed+=8;
 		size-=2;
 	}
 	//让车后退
 	public void speedDown() {
 		speed-=8;
 		size+=2;
 	}
}
