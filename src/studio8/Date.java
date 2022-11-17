package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	private int month;
	private int day;
	private int year;
	private boolean holiday;
	
	/**
	 * Takes in parameter values and initializes them to the instance variables of a date
	 * 
	 * @param initmonth the month of the date
	 * @param initday the day of the date
	 * @param inityear the year of the date
	 * @param initholiday true if the date is a holiday, false otherwise
	 */
	public Date (int initMonth, int initDay, int initYear, boolean initHoliday)
	{
		month = initMonth;
		day = initDay;
		year = initYear;
		holiday = initHoliday;
	}

    @Override
	public String toString() {
		return "Date: " + month + "/" + day + "/" + year + " Holiday?: " + holiday;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isHoliday() {
		return holiday;
	}

	public void setHoliday(boolean holiday) {
		this.holiday = holiday;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public static void main(String[] args) {
		Date day1 = new Date(11, 17, 2022, false);
		Date day2 = new Date(11, 17, 2022, false);
		Date day3 = new Date(2, 4, 2018, true);
		Date day4 = new Date(5, 8, 2019, true);
		Date day5 = new Date(9, 9, 2007, false);
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(day1);
		list.add(day2);
		list.add(day3);
		list.add(day4);
		list.add(day5);
		System.out.println(list);
		HashSet<Date> set = new HashSet<Date>();
		set.add(day1);
		set.add(day2);
		set.add(day3);
		set.add(day4);
		set.add(day5);
		System.out.println(set);
    }

}
