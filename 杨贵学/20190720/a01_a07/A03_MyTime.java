package a01_a07;

public class A03_MyTime {
	private  Integer hour;
	private  Integer minute;
	private  Integer second;
	void sethour() {}
	void setminute() {}
	void setsecond() {}
	void addSecond(int sec) {
		if(sec+this.second>=60) {
			aaddMinute((sec+this.second)/60);
			this.second=(this.second+sec)%60;
		}else if(sec+this.second<60)
			this.second=this.second+sec;
		
	}
	void aaddMinute(int min) {
		if(min+this.minute>=60) {
			addHour((min+this.minute)/60);
			this.minute=(this.minute+min)%60;
		}else if(min+this.minute<60)
		this.minute=this.minute+min;
	}
	void addHour(int hou)  {
		
		this.hour+=hou;
		this.hour=this.hour%24;
	}
	
	void subSecond(int sec)  {
		
		if(this.second>=sec) {
			this.second=this.second-sec;
		}else if(this.second<sec&&sec<60) {
				subMinute((sec-this.second)/60+1);
				this.second=(this.second-sec+60);
				
			}else if((sec%60==0)&&(sec>=60)) {
					subMinute((sec-this.second)/60);
					
				} else {
						subMinute((sec-this.second)/60+1);
						this.second=60-(sec-this.second)%60;
					
			}
				
			}
			


	void subMinute(int min) {
		
		if(this.minute>=min) {
			this.minute=this.minute-min;
		}else if(this.minute<min&&min<60) {
				subHour((min-this.minute)/60+1);
				this.minute=(this.minute-min+60);
		}else if((min%60==0) &&( min>=60)){
					subHour((min-this.minute)/60);
					
				} else {
						subHour((min-this.minute)/60+1);
						this.minute=60-(min-this.minute)%60;
					
			}
				
			}
	void subHour(int hou) {
		if(hou>0) {
			
			this.hour=24-hou%24;
		}
		
	}
	
	void diaplay() {
		System.out.println("调整后时间:"+hour+","+minute+","+second);
	}
	void diaplay(int i,int a, int v) {
		System.out.println("初始时间:"+hour+","+minute+","+second);
	}
	public A03_MyTime(){}
	public A03_MyTime(Integer hour,Integer minute,Integer second){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
		diaplay( hour, minute, second);
	}

	public static void main(String[] args) {
		A03_MyTime time=new A03_MyTime(0,0,0);
		time.addSecond(1);
		time.aaddMinute(4);
		time.addHour(0);
		time.subSecond(1);
		time.subMinute(2);
		time.subHour(0);
		time.diaplay();
	}

}
