
public class MyTime {
	//ʱ
	private int hour; 
	//��
	private int minute; 
	//��
	private int second; 
	//���췽��
	public MyTime(){
		
	}
	//���췽��
	public MyTime(int hour,int minute,int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	//����
	public void display() {
		//���Զ���λ
		if(this.second>60) {
			this.minute=this.minute+this.second/60;
			this.second=this.second%60;
		}
		//���Զ���λ
		if(this.minute>60) {
			this.hour=this.hour+this.second/60;
			this.minute=this.minute%60;
		}
		System.out.println(this.hour+":"+this.minute+":"+this.second);
	}
	//����
	public void addSecond(int sec) {
		this.second=second+sec;
	}
	//�ӷ�
	public void addMinute(int min) {
		this.minute=second+min;
	}
	//��ʱ
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
