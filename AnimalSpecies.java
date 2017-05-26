package org.selftestexercises.chapter4.absolutejava;

public class AnimalSpecies {

	private String animalName;
	private double population;
	private double growthRate;

	public AnimalSpecies() {
		animalName = "Unknown";
		population = 0;
		growthRate = 0;
	}

	public AnimalSpecies(String animalName) {
		setAnimalName(animalName);
	}

	public AnimalSpecies(double population) {
		setPopulation(population);
	}

	public AnimalSpecies(String animalName, double population) {
		setAnimalName(animalName);
		setPopulation(population);
	}

	public AnimalSpecies(String animalName, double population, AnimalSpecies other) {
		setAnimalName(animalName);
		setPopulation(population);
		setGrowthRate(other);
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getAnimalName() {
		return this.animalName;
	}

	public void setPopulation(double population) {
		this.population = population;
	}

	public double getPopulation() {
		return this.population;
	}

	public void setGrowthRate(AnimalSpecies other) {
		this.growthRate = ((this.population - other.population) / other.population) * 100;
	}

	public double getGrowthRate() {
		return this.growthRate;
	}

	public boolean equals(AnimalSpecies other) {
		return (this.population == other.population);
	}

	public String toString() {
		return String.format("Animal Species: %s%nPopulation: %.1f%nGrowth Rate: %.1f%%%n", animalName, population,
				growthRate);
	}

	public boolean endangered(double growthRate) {
		if (growthRate < 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		AnimalSpecies cockatielPast = new AnimalSpecies("Cockatiel", 112);
		System.out.println(cockatielPast);
		AnimalSpecies cockatielPresent = new AnimalSpecies("Cockatiel", 220, cockatielPast);
		System.out.println(cockatielPresent);
		System.out.println(cockatielPresent.endangered(cockatielPresent.getGrowthRate()));
	}
}
