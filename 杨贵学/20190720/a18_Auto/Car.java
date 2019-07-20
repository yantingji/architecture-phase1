package a18_Auto;

import java.util.Scanner;

public class Car extends Auto{
	public  boolean air_conditioner;
	public boolean cd;
	public Car() {}
	public Car(Integer tyre,Integer weight,String color) {
		super( tyre, weight,color);
	}
	@Override
	public void  speed(int i) {
		setspeed(i*6);
		
	}
	public  void function(boolean air,boolean cd) {
		this.air_conditioner=air;
		this.cd=cd;
	}
	
	public void display1() {
		
		System.out.println("是否有空调:"+air_conditioner);
		System.out.println("是否有CD:"+cd);
		
	}

	public static void main(String[] args) {
		Car car=new Car(4,5,"red");
		car.function(false, true);
		car.display1();
		car.xx();
	}

}
