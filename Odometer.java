package org.chapter4.absolutejava;

public class Odometer {
	
	private double milesDriven;
	private double fuelEfficiency;
	
	public double getMilesDriven() {
		return this.milesDriven;
	}
	
	public void setMilesDriven() {
		this.milesDriven = 0;
	}
	
	public double getFuelEfficiency() {
		return this.fuelEfficiency;
	}
	
	public void setFuelEfficiency(double fuelEfficiency) {
		this.fuelEfficiency = fuelEfficiency;
	}
	
	public void addMilesDriven(double milesDriven) {
		this.milesDriven = this.milesDriven + milesDriven;
	}
	
	public double numGallons(double milesDriven, double fuelEfficiency) {
		fuelEfficiency = (1 / fuelEfficiency) * milesDriven;
		return fuelEfficiency;
	}
	
	public static void main(String[] args) {
		Odometer car = new Odometer();
		car.setMilesDriven();
		car.setFuelEfficiency(22);
		car.addMilesDriven(50);
		System.out.printf("%.2f%n", car.numGallons(car.getMilesDriven(), car.getFuelEfficiency()));
		car.setMilesDriven();
		car.addMilesDriven(22);
		System.out.printf("%.1f%n", car.numGallons(car.getMilesDriven(), car.getFuelEfficiency()));
		car.addMilesDriven(19);
		System.out.printf("%.2f%n", car.numGallons(car.getMilesDriven(), car.getFuelEfficiency()));
	}
}
