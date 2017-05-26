package org.selftestexercises.chapter4.absolutejava;

import java.util.*;

public class Date {

	private int month;
	private int day;
	private int year;

	public Date() {
		month = 1;
		day = 1;
		year = 1000;
	}

	public Date(int monthInt, int day, int year) {
		setDate(monthString(monthInt), day, year);
	}

	public Date(String monthString, int day, int year) {
		setDate(monthString, day, year);
	}

	public Date(int year) {
		setDate(1, 1, year);
	}

	public Date(Date aDate) {
		if (aDate == null) {
			System.out.println("Fatal Error");
			System.exit(0);
		}
		month = aDate.month;
		year = aDate.year;
		day = aDate.day;
	}

	public void setYear(int year) {
		if ((year < 1000) || (year > 9999)) {
			System.out.println("Fatal Error");
			System.exit(0);
		} else {
			this.year = year;
		}
	}

	public int getYear() {
		return year;
	}

	public void setMonth(int monthNumber) {
		if ((monthNumber < 0) || (monthNumber > 12)) {
			System.out.println("Fatal Error");
			System.exit(0);
		} else {
			month = getMonth();
		}
	}

	public int getMonth() {
		if (this.month == 1) {
			return 1;
		} else if (this.month == 2) {
			return 2;
		} else if (this.month == 3) {
			return 3;
		} else if (this.month == 4) {
			return 4;
		} else if (this.month == 5) {
			return 5;
		} else if (this.month == 6) {
			return 6;
		} else if (this.month == 7) {
			return 7;
		} else if (this.month == 8) {
			return 8;
		} else if (this.month == 9) {
			return 9;
		} else if (this.month == 10) {
			return 10;
		} else if (this.month == 11) {
			return 11;
		} else if (this.month == 12) {
			return 12;
		} else {
			System.out.println("Fatal Error!");
			System.exit(0);
			return 0;
		}
	}

	private String monthString(int monthNumber) {
		switch (monthNumber) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			System.out.println("Fatal Error!");
			System.exit(0);
			return "Error";
		}
	}

	public int retrieveMonth(String month) {
		if (month.equals("January")) {
			return 1;
		} else if (month.equals("February")) {
			return 2;
		} else if (month.equals("March")) {
			return 3;
		} else if (month.equals("April")) {
			return 4;
		} else if (month.equals("May")) {
			return 5;
		} else if (month.equals("June")) {
			return 6;
		} else if (month.equals("July")) {
			return 7;
		} else if (month.equals("August")) {
			return 8;
		} else if (month.equals("September")) {
			return 9;
		} else if (month.equals("October")) {
			return 10;
		} else if (month.equals("November")) {
			return 11;
		} else if (month.equals("December")) {
			return 12;
		} else {
			System.out.println("Fatal Error!");
			System.exit(0);
			return 0;
		}
	}

	public void setDay(int day) {
		if ((day <= 0) || (day > 31)) {
			System.out.println("Fatal Error");
			System.exit(0);
		} else {
			this.day = day;
		}
	}

	public int getDay() {
		return day;
	}

	public String toString() {
		return (monthString(month) + " " + day + ", " + year);
	}

	public boolean equals(Date otherDate) {
		return ((month == otherDate.month) && (day == otherDate.day) && (year == otherDate.year));
	}

	public boolean precedes(Date otherDate) {
		return ((year < otherDate.year) || (year == otherDate.year && getMonth() < otherDate.getMonth())
				|| (year == otherDate.year && month == otherDate.month) && day < otherDate.day);
	}

	private boolean dateOK(int monthInt, int dayInt, int yearInt) {
		if ((monthInt == 1) || (monthInt == 3) || (monthInt == 5) || (monthInt == 7) || (monthInt == 8)
				|| (monthInt == 10) || (monthInt == 12)) {
			return ((dayInt >= 1) && (dayInt <= 31) && (yearInt >= 1000) && (yearInt <= 9999));
		} else if ((monthInt == 4) || (monthInt == 6) || (monthInt == 9) || (monthInt == 11)) {
			return ((dayInt >= 1) && (dayInt <= 30) && (yearInt >= 1000) && (yearInt <= 9999));
		} else {
			if (yearInt % 4 != 0) {
				return ((dayInt >= 1) && (dayInt <= 28) && (yearInt >= 1000) && (yearInt <= 9999));
			} else if (yearInt % 100 != 0) {
				return ((dayInt >= 1) && (dayInt <= 29) && (yearInt >= 1000) && (yearInt <= 9999));
			} else if (yearInt % 400 != 0) {
				return ((dayInt >= 1) && (dayInt <= 28) && (yearInt >= 1000) && (yearInt <= 9999));
			} else {
				return ((dayInt >= 1) && (dayInt <= 29) && (yearInt >= 1000) && (yearInt <= 9999));
			}
		}
	}
	
	private boolean dateOK(String monthString, int dayInt, int yearInt) {
		if ((monthString.equals("January")) || (monthString.equals("March")) || (monthString.equals("May")) || 
				(monthString.equals("July")) || (monthString.equals("August")) || (monthString.equals("October")) || 
				(monthString.equals("December"))) {
			return ((dayInt >= 1) && (dayInt <= 31) && (yearInt >= 1000) && (yearInt <= 9999));
		} else if ((monthString.equals("April")) || (monthString.equals("June")) || (monthString.equals("September"))
				|| (monthString.equals("November"))) {
			return ((dayInt >= 1) && (dayInt <= 30) && (yearInt >= 1000) && (yearInt <= 9999));
		} else {
			if (yearInt % 4 != 0) {
				return ((dayInt >= 1) && (dayInt <= 28) && (yearInt >= 1000) && (yearInt <= 9999));
			} else if (yearInt % 100 != 0) {
				return ((dayInt >= 1) && (dayInt <= 29) && (yearInt >= 1000) && (yearInt <= 9999));
			} else if (yearInt % 400 != 0) {
				return ((dayInt >= 1) && (dayInt <= 28) && (yearInt >= 1000) && (yearInt <= 9999));
			} else {
				return ((dayInt >= 1) && (dayInt <= 29) && (yearInt >= 1000) && (yearInt <= 9999));
			}
		}
	}

	public void readInput() {
		boolean tryAgain = true;
		Scanner input = new Scanner(System.in);
		while (tryAgain) {
			System.out.println("Enter month, day, and year");
			System.out.println("as three integers:");
			System.out.println("do not use commas or other punctuations.");
			int monthInput = input.nextInt();
			int dayInput = input.nextInt();
			int yearInput = input.nextInt();
			if (dateOK(monthInput, dayInput, yearInput)) {
				setDate(monthInput, dayInput, yearInput);
				tryAgain = false;
			} else {
				System.out.println("Illegal date. Reenter input.");
			}
		}
		input.close();
	}

	public void setDate(String monthString, int day, int year) {
		if (dateOK(retrieveMonth(monthString), day, year)) {
			this.month = retrieveMonth(monthString);
			this.day = day;
			this.year = year;
		} else {
			System.out.println("Fatal Error");
			System.exit(0);
		}
	}

	private boolean monthOK(String month) {
		return (month.equals("January") || month.equals("February") || month.equals("March") || month.equals("April")
				|| month.equals("May") || month.equals("June") || month.equals("July") || month.equals("August")
				|| month.equals("September") || month.equals("October") || month.equals("November")
				|| month.equals("December"));
	}

	public void setDate(int month, int day, int year) {
		if (monthOK(monthString(month))) {
			if (dateOK(monthString(month), day, year)) {
				this.month = month;
				this.day = day;
				this.year = year;
			} else {
				System.out.println("Fatal Error!");
				System.exit(0);
			}
		}
	}

	public void setDate(int year) {
		setDate(1, 1, year);
	}

	public static void main(String[] args) {
		Date date1 = new Date("December", 16, 1770), date2 = new Date(1, 27, 1756), date3 = new Date(1882),
				date4 = new Date();
		System.out.println("Whose birthday is " + date1 + "?");
		System.out.println("Whose birthday is " + date2 + "?");
		System.out.println("Whose birthday is " + date3 + "?");
		System.out.println("Whose birthday is " + date4 + "?");
	}
}
