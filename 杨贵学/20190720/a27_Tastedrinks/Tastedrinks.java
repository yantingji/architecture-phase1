package a27_Tastedrinks;

public class Tastedrinks {
	public void play() {
		System.out.println("DrinkNotFoundException");
	}
	public void play(int i,String j) {
		System.out.println("éÙ×ÓÖ­");
	}
	public void play(String i,int j) {
		System.out.println("Æ»¹ûÖ­");
	}
	public void play(int i) {
		
		if(i==1) {
			play(1,"");
			
		}else if(i==2) {
			play("",1);
		}else {
			play();
		}
	}
	
	void xx() {
		
	}

	public static void main(String[] args) {
//		for(int i=0;i<args.length;i++){
//			System.out.println(args[i]);
//			}
		
		
		Integer i= Integer.valueOf(args[0]);
		
		Tastedrinks aa=new Tastedrinks();
		aa.play(i);
		

	}

}
