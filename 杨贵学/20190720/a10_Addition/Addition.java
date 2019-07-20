package a10_Addition;

public class Addition {
	public Addition() {}
	public Addition(int a,int b) {
		int sum=a+b;
		System.out.println("结果:"+sum);
	}
	public Addition(float  a,float  b) {
		float sum=a+b;
		System.out.println("结果:"+sum);
	}
	public Addition(String a,String b) {
		String sum=a+b;
		System.out.println("结果:"+sum);
	}
	public Addition(double a,double b) {
		double sum=a+b;
		System.out.println("结果:"+sum);
	}
	public Addition(long a,long b) {
		long sum=a+b;
		System.out.println("结果:"+sum);
	}

	public static void main(String[] args) {
		Addition a=new Addition("b","a");
		Addition aa=new Addition(500.0,5.022);

	}

}
