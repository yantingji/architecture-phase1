package a08_Vehicles;

import java.awt.geom.Ellipse2D.Float;

public abstract class Vehicles {
	private static String brand ;
	private static String color ;
	public void setbrand(String brand) {
		this.brand=brand;
	}
	public String getbrand() {
		return brand;
		
	}
	public void setcolor(String color) {
		this.color=color;
	}
	public static String getcolor() {
		return color;
	}
	void run() {
		System.out.println("我已经开动了");
	}
	public void showInfo () {
		System.out.println("颜色:"+this.color);
		System.out.println("商标:"+this.getBrand());
	} 
	
	public Vehicles() {}
	public Vehicles(String brand,String color,Float i ) {
		this.setBrand(brand);
		this.color=color;
		
	}
	public Vehicles(String brand,String color ) {
		this.setBrand(brand);
		this.color=color;
	}

	
	/**
	 * @return the brand
	 */
	public static  String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

}
