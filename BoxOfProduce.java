package org.chapter4.absolutejava;

import java.util.*;
import java.io.*;

public class BoxOfProduce {

	private String fruitsOrVegetables1;
	private String fruitsOrVegetables2;
	private String fruitsOrVegetables3;

	public BoxOfProduce() {
		System.out.println(findFruitsOrVegetables1());
		System.out.println(findFruitsOrVegetables2());
		System.out.println(findFruitsOrVegetables3());
	}

	public String getFruitsOrVegetables1() {
		return fruitsOrVegetables1;
	}

	private void setFruitsOrVegetables1(String fruitsOrVegetables1) {
		this.fruitsOrVegetables1 = fruitsOrVegetables1;
	}

	public String findFruitsOrVegetables1() {
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("food.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.exit(0);
		}
		fileIn.hasNextLine();
		String word = "";
		for (int i = 1; i <= ((int) ((Math.random() * 5) + 1)); i++) {
			word = fileIn.nextLine();
		}
		return String.format("Here are the fruits and vegetables randomly selected:%n%s", word);
	}

	public void substitute1() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("food.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.exit(0);
		}
		System.out.println("What would you like to substitute in to the box #1 (make sure to reference the list):");
		String answer = input.nextLine();
		while (fileIn.hasNextLine()) {
			String word = fileIn.nextLine();
			if (answer.equalsIgnoreCase(word)) {
				setFruitsOrVegetables1(answer);
				break;
			}
		}
	}

	public String getFruitsOrVegetables2() {
		return fruitsOrVegetables2;
	}

	private void setFruitsOrVegetables2(String fruitsOrVegetables2) {
		this.fruitsOrVegetables2 = fruitsOrVegetables2;
	}

	public String findFruitsOrVegetables2() {
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("food.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.exit(0);
		}
		fileIn.hasNextLine();
		String word = "";
		for (int i = 1; i <= ((int) ((Math.random() * 5) + 1)); i++) {
			word = fileIn.nextLine();
		}
		return word;
	}

	public void substitute2() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("food.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.exit(0);
		}
		System.out.println("What would you like to substitute in to the box #2 (make sure to reference the list):");
		String answer = input.nextLine();
		while (fileIn.hasNextLine()) {
			String word = fileIn.nextLine();
			if (answer.equalsIgnoreCase(word)) {
				setFruitsOrVegetables2(answer);
				break;
			}
		}
	}

	public String getFruitsOrVegetables3() {
		return fruitsOrVegetables3;
	}

	private void setFruitsOrVegetables3(String fruitsOrVegetables3) {
		this.fruitsOrVegetables3 = fruitsOrVegetables3;
	}

	public String findFruitsOrVegetables3() {
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("food.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.exit(0);
		}
		fileIn.hasNextLine();
		String word = "";
		for (int i = 1; i <= ((int) ((Math.random() * 5) + 1)); i++) {
			word = fileIn.nextLine();
		}
		return word;
	}

	public void substitute3() {
		Scanner input = new Scanner(System.in);
		Scanner fileIn = null;
		try {
			fileIn = new Scanner(new FileInputStream("food.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found!");
			System.exit(0);
		}
		System.out.println("What would you like to substitute in to the box #3 (make sure to reference the list):");
		String answer = input.nextLine();
		while (fileIn.hasNextLine()) {
			String word = fileIn.nextLine();
			if (answer.equalsIgnoreCase(word)) {
				setFruitsOrVegetables3(answer);
				break;
			}
		}
		input.close();
	}

	public void setFruitsOrVegetables(String fruitsOrVegetables1, String fruitsOrVegetables2,
			String fruitsOrVegetables3) {
		this.fruitsOrVegetables1 = fruitsOrVegetables1;
		this.fruitsOrVegetables2 = fruitsOrVegetables2;
		this.fruitsOrVegetables3 = fruitsOrVegetables3;
	}

	public String toString() {
		return String.format("%s%n%s%n%s%n", fruitsOrVegetables1, fruitsOrVegetables2, fruitsOrVegetables3);
	}

	public static void main(String[] args) {
		BoxOfProduce box = new BoxOfProduce();
		System.out.println();
		box.substitute1();
		box.substitute2();
		box.substitute3();
		System.out.println();
		System.out.println("Here is the new substitutions for the box of produce:");
		System.out.println(box.getFruitsOrVegetables1());
		System.out.println(box.getFruitsOrVegetables2());
		System.out.println(box.getFruitsOrVegetables3());
	}
}