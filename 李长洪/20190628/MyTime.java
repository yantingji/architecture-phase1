
public class MyTime {
	//时
	private int hour; 
	//分
	private int minute; 
	//秒
	private int second; 
	//构造方法
	public MyTime(){
		
	}
	//构造方法
	public MyTime(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	//计算
	public void display() {
		//秒自动进位
		if(this.second>60) {
			this.minute=this.minute+this.second/60;
			this.second=this.second%60;
		}
		//分自动进位
		if(this.minute>60) {
			this.hour=this.hour+this.second/60;
			this.minute=this.minute%60;
		}
		System.out.println(this.hour+":"+this.minute+":"+this.second);
	}
	//加秒
	public void addSecond(int sec) {
		this.second=second+sec;
	}
	//加分
	public void addMinute(int min) {
		this.minute=second+min;
	}
	//加时
	public void addHour(int hou) {
		this.hour=second+hou;
	}
	public void subSecond(int sec) {
		this.second=second-sec;
	}
	public void subMinute(int min) {
		this.minute=second-min;
	}
	public void subHour(int hou) {
		this.hour=second-hou;
	}
}
