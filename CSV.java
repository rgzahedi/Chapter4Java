package org.chapter4.absolutejava;

import java.util.*;
import java.io.*;

public class CSV {

	private double rating1;
	private double rating2;
	private double rating3;
	private double rating4;
	private double rating5;

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
		CSV csv = new CSV();
		System.out.println(csv.ratingSystem());
	}
}
