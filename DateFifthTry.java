package org.selftestexercises.chapter4.absolutejava;

import java.util.*;

public class DateFifthTry {

	private String month;
	private int day;
	private int year;

	public void writeOutput() {
		System.out.println(month + " " + day + ", " + year);
	}

	public String toString() {
		return (month + " " + day + ", " + year);
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

	public void setMonth(int monthNumber) {
		if ((monthNumber <= 0) || (monthNumber > 12)) {
			System.out.println("Fatal Error!");
			System.exit(0);
		} else {
			month = monthString(monthNumber);
		}
	}

	public void setDay(int day) {
		if ((day <= 0) || (day > 31)) {
			System.out.println("Fatal Error!");
			System.exit(0);
		} else {
			this.day = day;
		}
	}

	public void setYear(int year) {
		if ((year < 1000) || (year > 9999)) {
			System.out.println("Fatal Error!");
			System.exit(0);
		} else {
			this.year = year;
		}
	}

	public void setDate(int month, int day, int year) {
		if (dateOK(month, day, year)) {
			this.month = monthString(month);
			this.day = day;
			this.year = year;
		} else {
			System.out.println("Fatal Error!");
			System.exit(0);
		}
	}

	public int getDay() {
		return this.day;
	}

	public int getYear() {
		return this.year;
	}

	public int getMonth() {
		if (this.month.equalsIgnoreCase("January")) {
			return 1;
		} else if (this.month.equalsIgnoreCase("February")) {
			return 2;
		} else if (this.month.equalsIgnoreCase("March")) {
			return 3;
		} else if (this.month.equalsIgnoreCase("April")) {
			return 4;
		} else if (this.month.equalsIgnoreCase("May")) {
			return 5;
		} else if (this.month.equalsIgnoreCase("June")) {
			return 6;
		} else if (this.month.equalsIgnoreCase("July")) {
			return 7;
		} else if (this.month.equalsIgnoreCase("August")) {
			return 8;
		} else if (this.month.equalsIgnoreCase("September")) {
			return 9;
		} else if (this.month.equalsIgnoreCase("October")) {
			return 10;
		} else if (this.month.equalsIgnoreCase("November")) {
			return 11;
		} else if (this.month.equalsIgnoreCase("December")) {
			return 12;
		} else {
			System.out.println("Fatal Error!");
			System.exit(0);
			return 0;
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

	public boolean equals(DateFifthTry otherDate) {
		return ((month.equalsIgnoreCase(otherDate.month)) && (day == otherDate.day) && (year == otherDate.year));
	}

	public boolean precedes(DateFifthTry otherDate) {
		return ((year < otherDate.year) || (year == otherDate.year && getMonth() < otherDate.getMonth())
				|| (year == otherDate.year && month.equals(otherDate.month) && day < otherDate.day));
	}
}
