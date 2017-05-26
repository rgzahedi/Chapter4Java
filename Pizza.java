package org.chapter4.absolutejava;

public class Pizza {

	private String size;
	private int numCheese;
	private int numPepperoni;
	private int numHam;
	
	public Pizza() {
		size = "Unknown";
		numCheese = 0;
		numPepperoni = 0;
		numHam = 0;
	}
	
	public Pizza(String size, int numCheese, int numPepperoni, int numHam) {
		setSize(size);
		setNumCheese(numCheese);
		setNumPepperoni(numPepperoni);
		setNumHam(numHam);
	}
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		if ((size.equalsIgnoreCase("Small")) || (size.equalsIgnoreCase("Medium")) || (size.equalsIgnoreCase("Large"))
				|| (size.equalsIgnoreCase("Unknown"))) {
			this.size = size;
		} else {
			System.out.println("Error: There is no other size!");
			System.exit(0);
		}
	}
	
	public int getNumCheese() {
		return numCheese;
	}
	
	public void setNumCheese(int numCheese) {
		this.numCheese = numCheese;
	}
	
	public int getNumPepperoni() {
		return numPepperoni;
	}
	
	public void setNumPepperoni(int numPepperoni) {
		this.numPepperoni = numPepperoni;
	}
	
	public int getNumHam() {
		return numHam;
	}
	
	public void setNumHam(int numHam) {
		this.numHam = numHam;
	}
	
	public double calcCost() {
		if (size.equalsIgnoreCase("Small")) {
			return (double) (10 + (2 * numCheese) + (2 * numPepperoni) + (2 * numHam));
		} else if (size.equalsIgnoreCase("Medium")) {
			return (double) (12 + (2 * numCheese) + (2 * numPepperoni) + (2 * numHam));
		} else if (size.equalsIgnoreCase("Large")) {
			return (double) (14 + (2 * numCheese) + (2 * numPepperoni) + (2 * numHam));
		} else {
			return 0;
		}
	}
	
	public String getDescription() {
		return String.format("Pizza Size: %s%nNumber of Cheese Toppings: %d%nNumber of Pepperoni Toppings: %d%n"
				+ "Number of Ham Toppings: %d%nOverall Cost: $%.2f%n", size, numCheese, numPepperoni, numHam, calcCost());
	}
	
	public static void main(String[] args) {
		Pizza order = new Pizza("Large", 1, 1, 2);
		System.out.println(order.getDescription());
	}
}
