package cs2;

public class alarmclock {
	private String sound;
	private int [] currentTime = new int[3]; // hour, minute, second
	private int [] wakeupTime = new int[3]; //hour, minute, second

	public alarmclock(){
		sound = "BEEP BEEP BEEP";
		currentTime[0] = 12;
		currentTime[1] = 0;
		currentTime[2] = 0;
		wakeupTime[0] = 6;
		wakeupTime[1] = 0;
		wakeupTime[2] = 0;
	}
	public alarmclock(String S, int h, int m, int s){
		sound = setSound(S);
		wakeupTime[0] = setHour(h);
		wakeupTime[1] = setMinute(m);
		wakeupTime[2] = setSecond(s);
	}
	public String setSound(String s){
		sound = s;
		return sound;
	}
	public int setHour(int s){
		wakeupTime[0] = s;
		return s;
	}
	public int setMinute(int s){
		wakeupTime[1] = s;
		return s;
	}
	public int setSecond(int s){
		wakeupTime[2] = s;
		return s;
	}
	public static void main(String[] args) {

	}

}
