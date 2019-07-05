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
//		Vehicle ve = new Vehicle();
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
		/*
		 * 【练习题04】构造方法 编写Java程序模拟简单的计算器。 定义名为Number的类其中有两个整型数据成员n1和n2应声明为私有。
		 * 编写构造方法赋予n1和n2初始值再为该类定义加addition、减subtration、乘multiplication、除division
		 * 等公有成员方法分别对两个成员变量执行加、减、乘、除的运算。 在main方法中创建Number类的对象调用各个 方法并显示计算结果。
		 */
//		Number num = new Number(9,6);
//		num.addition();
//		num.subtration();
//		num.multiplication();
//		num.division();
		/*
		 * 【练习题05】构造方法 编写Java程序用于显示人的姓名和年龄。 定义一个人类Person该类中应该有两个私有属性姓名name和年龄age。
		 * 定义构造方法用来初始化数据成员。再定义显示display方法将姓名和年龄打印出来。 在main方法中创建人类的实例然后将信息显示。
		 */
//		Person pe = new Person("李",15);
//		pe.display();
		/*
		 * 【练习题06】get方法和set方法  定义一个类该类有一个私有成员变量通过构造方法将其进行赋初值并提供该成员的 
		 * getXXX()和setXXX()方法提示假设有private String name;则有public void setName(String name) { this.name =
		 * name; } public String getName(){ return this.name; }
		 */
//		GetSet ge = new GetSet();
//		ge.setAge(1000);
//		int a=ge.getAge();
//		ge.setName("李");
//		String b=ge.getName();
//		Person pe = new Person(b,a);
//		pe.display();
		/*
		 * 【练习题07】构造方法与重载 为“无名的粉”写一个类class WuMingFen 要求： 1.有三个属性 面码:String theMa 粉的分量(两)
		 * int quantity 是否带汤 boolean likeSoup 2.写一个构造方法 以便于简化初始化过程 如 WuMingFen f1 = new
		 * WuMingFen(“牛肉”,3,true); 3.重载构造方法 使得初始化过程可以多样化 WuMingFen f2 = new
		 * WuMingFen(“牛肉”,2); 4.如何使得下列语句构造出来的粉对象是酸辣面码、2两、带汤的 WuMingFen f3 = new
		 * WuMingFen(); 5.写一个普通方法 check() 用于查看粉是否符合要求。即 将对象的三个属性打印在控制台上。
		 */
//		WuMingFen f1 = new WuMingFen("牛肉",3,true);
//		f1.check();
//		WuMingFen f2 = new WuMingFen("牛肉",3);
//		f2.check();
//		WuMingFen f3 = new WuMingFen();
//		f3.check();
		/*
		 * 【练习题08】构造方法的重载 定义一个名为Vehicles 交通工具 的基类 该类中应包含String类型的 成员属性brand 商标 和color 颜色
		 * 还应包含成员方法run 行驶 在控制台显示 “我已经开动了” 和showInfo 显示信息 在控制台显示商标和颜色 并编写构造方法初始化其成员属性。
		 * 编写Car 小汽车 类继承于Vehicles类 增加int型成员属性seats 座位 还应增加成员方法showCar 在控制台显示小汽车的信息
		 * 并编写构造方法。 编写Truck 卡车 类继承于Vehicles类 增加float型成员属性load 载重 还应增加成员方法showTruck
		 * 在控制台显示卡车的信息 并编写构造方法。 在main方法中测试以上各类。
		 */
//		Vehicle ve = new Vehicle();
//		ve.color="白";
//		ve.trademark="丰田";
//		ve.showInfo();
//		Car ca = new Car(5,"红","kawasaki");
//		ca.showCar();
//		ca.showInfo();
//		ShowTruck so = new ShowTruck(3);
//		so.showTruck();
//		so.trademark="大众";
//		so.color="黑";
//		so.showInfo();
		/*
		 * 【练习题09】构造方法与重载 定义一个网络用户类 要处理的信息有用户ID、用户密码、email地址。 在建立类的实例时
		 * 把以上三个信息都作为构造函数的参数输入 其中用户ID和用户密码时必须的 缺省的email地址是用户ID加上字符串“yantingji@itedu.com”
		 */
//		User us1 = new User(123,"qaq","lichanghong");
//		us1.display();
//		User us2 = new User(123,"qaq");
//		us2.display();
		/*
		 * 【练习题10】构造方法与重载、包 编写Addition类 该类中应包含一组实现两数相加运算的重载方法。
		 */
		Addition ad1 = new Addition("45","12");
		ad1.add();
		Addition ad2 = new Addition(48,12);
		ad2.add();
		Addition ad3 = new Addition("46",12);
		ad3.add();
		
	}
public static  class  num {
		final int v = 100;
	}
}

