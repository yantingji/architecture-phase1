package Zuoye0628;

import java.util.Scanner;

public class OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//猜数字游戏一个类A有一个成员变量v有一个初值100。定义一个类对A类的成员变量v进行猜。如果大了则提示大了小了则提示小了。等于则提示猜测成功。
		Scanner sc = new Scanner(System.in); 
		num nm = new num();
		while(true) {
			try {
				int line =  Integer.parseInt(sc.nextLine());
				if(line==nm.v) {
					System.out.println("成功しました");
					return;
				}else {
					System.out.println("失敗しました");
				}
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("Numを入力して下さい");
			}
		}
		
		/*请定义一个交通工具(Vehicle)的类其中有: 属性速度(speed)体积(size)等等 方法移动(move())设置速度(setSpeed(int speed))加速speedUp(),减速speedDown()等等.
		 *  最后在测试类Vehicle中的main()中实例化一个交通工具对象并通过方法给它初始化speed,size的值并且通过打印出来。另外调用加速减速的方法对速度进行改变
		 */
	/*	Vehicle ve = new Vehicle();
		ve.speed=30;
		ve.speedUp();
		ve.move();
		ve.speedDown();
		ve.move();
		*/
	}
public  static class num {
	final int v =100;
}
}
