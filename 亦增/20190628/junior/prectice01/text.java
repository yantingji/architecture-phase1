package prectice01;

public class text {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		A a = new A();
		while(true){
			int line = sc.nextInt();
			if(line==a.getV()) {
				System.out.println("猜对了");
				return;
			}else {
				System.out.println("猜错了");
			}
		}
 }
}