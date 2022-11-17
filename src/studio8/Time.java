package studio8;

import java.util.Objects;

public class Time {
	private int hour;
	private int minute;
	private boolean twelve;
	
	/**
	 * Constructor that takes in the parameters and assigns them to the instance variables for a time
	 * 
	 * @param initHour the hour (0-23) of the time
	 * @param initMinute the minute (0-59) of the time
	 * @param initTwelve true if the time should be shown in 12 hour format, false if it should be shown in 24 hour format
	 */
	public Time (int initHour, int initMinute, boolean initTwelve)
	{
		hour = initHour;
		minute = initMinute;
		twelve = initTwelve;
	}
	
	@Override
	public String toString() {
		int displayHour = hour;
		if (twelve)
		{
			if (hour > 12)
			{
				displayHour = hour - 12;
			}
		}
		return "Time: " + displayHour + ":" + minute;
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

	public boolean isTwelve() {
		return twelve;
	}

	public void setTwelve(boolean twelve) {
		this.twelve = twelve;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

	public static void main(String[] args) {
		Time now = new Time(15, 54, true);
		Time difTime = new Time(15, 54, false);
		System.out.println(now.equals(difTime));
    	
    }

}