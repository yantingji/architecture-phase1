package Prectice04;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number num = new Number(100, 20);
		System.out.println(num.getN1() + " + " + num.getN2() + " = " + num.addition());
		System.out.println(num.getN1() + " - " + num.getN2() + " = " + num.subtration());
		System.out.println(num.getN1() + " ~ " + num.getN2() + " = " + num.multiplication());
		System.out.println(num.getN1() + " € " + num.getN2() + " = " + num.division());
	}

}
