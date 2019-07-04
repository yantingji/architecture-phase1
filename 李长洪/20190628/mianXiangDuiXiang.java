import java.util.Scanner;

public class mianXiangDuiXiang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 【练习题01】类的成员变量 猜数字游戏一个类A有一个成员变量v有一个初值100。
		 * 定义一个类对A类的成员变量v进行猜。如果大了则提示大了小了则提示小了。等于则提示猜测成功。
		 */
//		Scanner sc = new Scanner(System.in);
//		num nm = new num();
//		while(true){
//			try {
//			int line = Integer.parseInt(sc.nextLine());
//			if(line==nm.v) {
//				System.out.println("成功");
//				return;
//			}else {
//				System.out.println("失败");
//			}
//			}catch(Exception e) {
//				System.out.println("请输入数字！");
//			}
//		}
		/*
		 * 【练习题02】类的成员变量 请定义一个交通工具(Vehicle)的类其中有: 属性速度(speed)体积(size)等等
		 * 方法移动(move())设置速度(setSpeed(int speed))加速speedUp(),减速speedDown()等等.
		 * 最后在测试类Vehicle中的main()中实例化一个交通工具对象并通过方法给它初始化speed,size的值并且通过打印出来。
		 * 另外调用加速减速的方法对速度进行改变。
		 */ 
//		vehicle ve = new vehicle();
//		ve.speed=10;
//		ve.speedUp();
//		ve.move();
//		ve.speedDown();
//		ve.move();
		/*
		 * 【练习题03】类的成员变量与方法、构造方法 在程序中经常要对时间进行操作但是并没有时间类型的数据。
		 * 那么我们可以自己实现一个时间类来满足程序中的需要。
		 * 定义名为MyTime的类其中应有三个整型成员时hour分minute秒second为了保证数据的安全性这三个成员变量应声明为私有。
		 * 为MyTime类定义构造方法以方便创建对象时初始化成员变量。 再定义diaplay方法用于将时间信息打印出来。 为MyTime类添加以下方法
		 * addSecond(int sec) addMinute(int min) addHour(int hou) subSecond(int sec)
		 * subMinute(int min) subHour(int hou) 分别对时、分、秒进行加减运算。
		 */
//		MyTime time = new MyTime(10,20,150);
//		time.display();
		
	
	}
public static  class  num {
		final int v = 100;
	}
}

