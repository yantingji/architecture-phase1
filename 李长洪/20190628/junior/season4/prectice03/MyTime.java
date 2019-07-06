package junior.season4.prectice03;

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	public MyTime(){

	}
	public MyTime(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public void display() {
		if(this.second>60) {
			this.minute=this.minute+this.second/60;
			this.second=this.second%60;
		}
		if(this.minute>60) {
			this.hour=this.hour+this.second/60;
			this.minute=this.minute%60;
		}
		System.out.println(this.hour+":"+this.minute+":"+this.second);
	}
	public void addSecond(int sec) {
		this.second=second+sec;
	}
	public void addMinute(int min) {
		this.minute=second+min;
	}
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
