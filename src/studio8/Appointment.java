package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	
	public Appointment (Date initDate, Time initTime)
	{
		date = initDate;
		time = initTime;
	}
	
	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Time getTime() {
		return time;
	}


	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Appointment: " + date + "; " + time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

	public static void main(String[] args) {
		Date day = new Date(12, 5, 2022, false);
		Time now = new Time(5, 45, false);
		Appointment one = new Appointment(day, now);
		Date day2 = new Date(4, 8, 2022, false);
		Time now2 = new Time(6, 18, false);
		Appointment two = new Appointment(day2, now2);
		LinkedList<Appointment> Calendar = new LinkedList<Appointment>();
		Calendar.add(one);
		Calendar.add(two);
		System.out.println(Calendar);
	}

}
