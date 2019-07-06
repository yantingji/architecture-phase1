package junior.season4;

import junior.season4.prectice02.Vehicle;
import junior.season4.prectice03.MyTime;
import junior.season4.prectice04.Number;
import junior.season4.prectice05.Person;
import junior.season4.prectice06.GetSet;
import junior.season4.prectice07.WuMingFen;
import junior.season4.prectice08.Car;
import junior.season4.prectice08.ShowTruck;
import junior.season4.prectice09.User;
import junior.season4.prectice10.Addition;
public class Test {

	public static void main(String[] args) {
		//练习题01
//		Scanner sc = new Scanner(System.in);
//		Num nm = new Num();
//		while(true){
//			int line = sc.nextInt();
//			if(line==nm.getV()) {
//				System.out.println("成功");
//				return;
//			}else {
//				System.out.println("失败");
//			}
//		}
		//练习题02
		Vehicle ve = new Vehicle();
		ve.setSpeed(10);
		ve.speedUp();
		ve.move();
		ve.speedDown();
		ve.move();
		//练习题03
		MyTime time = new MyTime(10,20,150);
		time.display();
		//练习题04
		Number num = new Number(9,6);
		num.addition();
		num.subtration();
		num.multiplication();
		num.division();
		//练习题05
		Person pe = new Person("李",15);
		pe.display();
		//练习题06
		GetSet ge = new GetSet();
		ge.setAge(1000);
		int a=ge.getAge();
		ge.setName("李");
		String b=ge.getName();
		Person pea = new Person(b,a);
		pea.display();
		//练习题07
		WuMingFen f1 = new WuMingFen("牛肉",3,true);
		f1.check();
		WuMingFen f2 = new WuMingFen("牛肉",3);
		f2.check();
		WuMingFen f3 = new WuMingFen();
		f3.check();
		//练习题08
		Car ca = new Car(5,"红","kawasaki");
		ca.showCar();
		ca.showInfo();
		ShowTruck so = new ShowTruck(3);
		so.showTruck();
		so.setTrademark("大众");
		so.setColor("黑");
		so.showInfo();
		//练习题09
		User us1 = new User(123,"qaq","lichanghong");
		us1.display();
		User us2 = new User(123,"qaq");
		us2.display();
		//练习题10
		Addition ad1 = new Addition("45","12");
		ad1.add();
		Addition ad2 = new Addition(48,12);
		ad2.add();
		Addition ad3 = new Addition("46",12);
		ad3.add();

	}

}

