package a13_aaa;

public class Aaa {
	public Aaa() {}
	public Aaa(int a,int b) {
		if(a>b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		
	}
	public Aaa(double a,double b, double c) {
		double sum=a*b*c;
		System.out.println(sum);
	}
	public Aaa(String a,String b) {
		if(a.equals(b)) {
			System.out.println(a+"等于"+b);
		}else {
			System.out.println(a+"不等于"+b);
		}
	}

	public static void main(String[] args) {
		Aaa c=new Aaa(1,2);
		Aaa c1=new Aaa(1,2,3);
		Aaa c2=new Aaa("nihao","nihao");


	}

}
