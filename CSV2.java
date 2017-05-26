package org.chapter4.absolutejava;

import java.util.*;
import java.io.*;

public class CSV2 {

	private double rating1;
	private double rating2;
	private double rating3;
	private double rating4;
	private double rating5;
	private int userRating1;
	private int userRating2;
	private int userRating3;
	private int userRating4;

	public void setUserRating1() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your rating for Product A:");
		int userRating1 = input.nextInt();
		if ((userRating1 < 0) || (userRating1 > 5)) {
			System.out.println("Fatal Error!");
			System.exit(0);
		} else {
			this.userRating1 = userRating1;
		}
	}

	public void setUserRating2() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your rating for Product B:");
		int userRating2 = input.nextInt();
		if ((userRating2 < 0) || (userRating2 > 5)) {
			System.out.println("Fatal Error!");
			System.exit(0);
		} else {
			this.userRating2 = userRating2;
		}
	}

	public void setUserRating3() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your rating for Product C:");
		int userRating3 = input.nextInt();
		if ((userRating3 < 0) || (userRating3 > 5)) {
			System.out.println("Fatal Error!");
			System.exit(0);
		} else {
			this.userRating3 = userRating3;
		}
	}

	public void setUserRating4() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input your rating for Product D:");
		int userRating4 = input.nextInt();
		if ((userRating4 < 0) || (userRating4 > 5)) {
			System.out.println("Fatal Error!");
			System.exit(0);
		} else {
			this.userRating4 = userRating4;
		}
		input.close();
	}
	
	public int getUserRating1() {
		return userRating1;
	}
	
	public int getUserRating2() {
		return userRating2;
	}
	
	public int getUserRating3() {
		return userRating3;
	}
	
	public int getUserRating4() {
		return userRating4;
	}

	private String readInput() {
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("ratings.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
		}
		fileIn.hasNext();
		fileIn.nextLine();
		String words = "";
		while (fileIn.hasNext()) {
			words = words + fileIn.next() + "\n";
		}
		return words;
	}

	public String ratingSystem() {
		String words = readInput();
		String delimiters = ",\n";
		int product1 = 0;
		int numLine1 = numLines();
		int product2 = 0;
		int numLine2 = numLines();
		int product3 = 0;
		int numLine3 = numLines();
		int product4 = 0;
		int numLine4 = numLines();
		int product5 = 0;
		int numLine5 = numLines();
		String token = "";
		StringTokenizer wordFactory = new StringTokenizer(words, delimiters);
		while (wordFactory.hasMoreTokens()) {
			token = wordFactory.nextToken();
			product1 = product1 + Integer.parseInt(token);
			if (token.equals("0")) {
				numLine1--;
			}
			token = wordFactory.nextToken();
			product2 = product2 + Integer.parseInt(token);
			if (token.equals("0")) {
				numLine2--;
			}
			token = wordFactory.nextToken();
			product3 = product3 + Integer.parseInt(token);
			if (token.equals("0")) {
				numLine3--;
			}
			token = wordFactory.nextToken();
			product4 = product4 + Integer.parseInt(token);
			if (token.equals("0")) {
				numLine4--;
			}
			token = wordFactory.nextToken();
			product5 = product5 + Integer.parseInt(token);
			if (token.equals("0")) {
				numLine5--;
			}
		}
		this.rating1 = (double) product1 / numLine1;
		this.rating2 = (double) product2 / numLine2;
		this.rating3 = (double) product3 / numLine3;
		this.rating4 = (double) product4 / numLine4;
		this.rating5 = (double) product5 / numLine5;
		return String.format(
				"Here are the ratings:%nProduct A: %.1f%nProduct B: %.1f%n"
						+ "Product C: %.1f%nProduct D: %.1f%nProduct E: %.1f%n",
				this.rating1, this.rating2, this.rating3, this.rating4, this.rating5);
	}
	
	public void outputPrediction() {
		setUserRating1();
		setUserRating2();
		setUserRating3();
		setUserRating4();
		String words = readInput();
		String delimiters = ",\n";
		String token = "";
		int numLine = numLines() - numLines();
		int overallRating;
		int absRating1;
		int absRating2;
		int absRating3;
		int absRating4;
		int absRating5;
		int difference = 0;
		int similarity = 5;
		StringTokenizer wordFactory = new StringTokenizer(words, delimiters);
		while (wordFactory.hasMoreTokens()) {
			token = wordFactory.nextToken();
			absRating1 = Math.abs((getUserRating1() - Integer.parseInt(token)));
			token = wordFactory.nextToken();
			absRating2 = Math.abs((getUserRating2() - Integer.parseInt(token)));
			token = wordFactory.nextToken();
			absRating3 = Math.abs((getUserRating3() - Integer.parseInt(token)));
			token = wordFactory.nextToken();
			absRating4 = Math.abs((getUserRating4() - Integer.parseInt(token)));
			token = wordFactory.nextToken();
			absRating5 = Integer.parseInt(token);
			overallRating = absRating1 + absRating2 + absRating3 + absRating4;
			difference = Math.abs(overallRating - absRating5);
			if (similarity > difference) {
				similarity = overallRating;
				numLine++;
			}
		}
		System.out.println("The prediction for Product E is " + similarity 
				+ " which is the " + numLine + " customer's rating for product E.");
	}

	private int numLines() {
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("ratings.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.exit(0);
		}
		fileIn.hasNextLine();
		fileIn.nextLine();
		int counter = 0;
		while (fileIn.hasNextLine()) {
			fileIn.nextLine();
			counter++;
		}
		return counter;
	}

	public String toString() {
		return String.format(
				"Here are the ratings:%nProduct A: %.1f%nProduct B: %.1f%n"
						+ "Product C: %.1f%nProduct D: %.1f%nProduct E: %.1f%n",
				this.rating1, this.rating2, this.rating3, this.rating4, this.rating5);
	}

	public static void main(String[] args) {
		CSV2 csv = new CSV2();
		System.out.println(csv.ratingSystem());
		csv.outputPrediction();
	}
}
