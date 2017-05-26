package org.chapter4.absolutejava;

import java.util.*;

public class Pet {

	private String name;
	private int age;
	private double weight; //in pounds
	private String animalType;
	
	public String toString() {
		return ("Name: " + name + " Age: " + age + " years"
				+ "\nWeight: " + weight + " pounds" + "\nSpecies: " + animalType);
	}
	
	public Pet(String initialName, int initialAge, double initialWeight, String typeOfAnimal) {
		name = initialName;
		animalType = typeOfAnimal;
		if (((initialAge < 0) || (initialWeight < 0)) && ((!(typeOfAnimal.equalsIgnoreCase("dog"))) 
				|| (!(typeOfAnimal.equalsIgnoreCase("cat"))))) {
			System.out.println("Error: Negative age, weight, or type of animal.");
			System.exit(0);
		} else {
			age = initialAge;
			weight = initialWeight;
		}
	}
	
	public void set(String newName, int newAge, double newWeight, String typeOfAnimal) {
		name = newName;
		animalType = typeOfAnimal;
		if (((newAge < 0) || (newWeight < 0)) && ((!(typeOfAnimal.equalsIgnoreCase("dog"))) 
				|| (!(typeOfAnimal.equalsIgnoreCase("cat"))))) {
			System.out.println("Error: Negative age, weight, or type of animal.");
			System.exit(0);
		} else {
			age = newAge;
			weight = newWeight;
		}
	}
	
	public Pet(String initialName) {
		name = initialName;
		age = 0;
		weight = 0;
		animalType = "Unknown";
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public Pet(int initialAge) {
		name = "No name yet.";
		weight = 0;
		animalType = "Unknown";
		if (initialAge < 0) {
			System.out.println("Error: Negative Age!");
			System.exit(0);
		} else {
			age = initialAge;
		}
	}
	
	public void setAge(int newAge) {
		if (newAge < 0) {
			System.out.println("Error: Negative Age!");
			System.exit(0);
		} else {
			age = newAge;
		}
	}
	
	public Pet(double initialWeight) {
		name = "No name yet.";
		age = 0;
		animalType = "Unknown";
		if (initialWeight < 0) {
			System.out.println("Error: Negative Weight!");
			System.exit(0);
		} else {
			weight = initialWeight;
		}
	}
	
	public void setWeight(double newWeight) {
		if (newWeight < 0) {
			System.out.println("Error: Negative Weight!");
			System.exit(0);
		} else {
			weight = newWeight;
		}
	}
	
	public void setAnimalType(String typeOfAnimal) {
		if ((!(typeOfAnimal.equalsIgnoreCase("dog"))) || (!(typeOfAnimal.equalsIgnoreCase("cat")))) {
			System.out.println("Error: Animal is not dog or cat!");
			System.exit(0);
		} else {
			animalType = typeOfAnimal;
		}
	}
	
	public String getAnimalType() {
		return animalType;
	}
	
	public Pet() {
		name = "No name yet.";
		age = 0;
		weight = 0;
		animalType = "Unknown";
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public double acepromazine() {
		double dosage; //in ml
		if (this.animalType.equalsIgnoreCase("dog")) {
			dosage = ((weight / 2.2) * (10 / 0.03));
			return dosage;
		} else if (this.animalType.equalsIgnoreCase("cat")) {
			dosage = ((weight / 2.2) * (10 / 0.002));
			return dosage;
		} else {
			return 0;
		}
	}
	
	public double carprofen() {
		double dosage; //in ml
		if (this.animalType.equalsIgnoreCase("dog")) {
			dosage = ((weight / 2.2) * (12 / 0.5));
			return dosage;
		} else if (this.animalType.equalsIgnoreCase("cat")) {
			dosage = ((weight / 2.2) * (12 / 0.25));
			return dosage;
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Pet usersPet = new Pet("Jane Doe");
		System.out.println("My records on your pet are incomplete.");
		System.out.println("Here is what they currently say:");
		System.out.println(usersPet);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the pet's name:");
		String name = keyboard.nextLine();
		System.out.println("Please enter what type of animal it is:");
		String animalType = keyboard.nextLine();
		System.out.println("Please enter the pet's age:");
		int age = keyboard.nextInt();
		System.out.println("Please enter the pet's weight:");
		double weight = keyboard.nextDouble();
		System.out.println("Please enter what type of animal it is:");
		usersPet.set(name, age, weight, animalType);
		System.out.println("My records now say:");
		System.out.println(usersPet);
		keyboard.close();
		
		System.out.println(usersPet.carprofen());
	}
}
