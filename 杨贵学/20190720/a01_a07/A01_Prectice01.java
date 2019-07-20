package a01_a07;

import java.util.Scanner;

public class A01_Prectice01 {
	public static Integer a=55;
//	public Integer i;
	public static void bijiao() {
		boolean bool = true;
			do {
				System.out.print("请输入一个整数：");
				Scanner scanner = new Scanner(System.in);
				int num = scanner.nextInt();
				if(num>a) {
					System.out.println("请输入一个小�?"+num+"的整�?");
				}if(num<a) {
					System.out.println("请输入一个大�?"+num+"的整�?");
				}if(num==a) {
					System.out.println("输入于的整数与a相等");
					bool=false;
				}
			}while(bool);
	}
	public static void main(String[] args) {
		
			A01_Prectice01 aa=new A01_Prectice01();
			System.out.print("请输入一个整数：");
			Scanner scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			aa.bijiao();
		
		
	}

}
