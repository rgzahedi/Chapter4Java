package org.chapter4.absolutejava;

public class Temperature {
	
	private double valueOfTemp;
	private char scale;
	
	public Temperature() {
		this.valueOfTemp = 0;
		this.scale = 'C';
	}
	
	public Temperature(double valueOfTemp) {
		setValueOfTemp(valueOfTemp);
		this.scale = 'C';
	}
	
	public Temperature(char scale) {
		this.valueOfTemp = 0;
		setScale(scale);
	}
	
	public Temperature(double valueOfTemp, char scale) {
		setValueOfTemp(valueOfTemp);
		setScale(scale);
	}
	
	private double getValueOfTempC() {
		double degreesC = 5 * (valueOfTemp - 32) / 9;
		return degreesC;
	}
	
	private double getValueOfTempF() {
		double degreesF = (9 * (valueOfTemp) / 5) + 32;
		return degreesF;
	}
	
	public void outputFormula() {
		if (scale == 'F') {
			System.out.printf("%.1f" + " degrees " + "%c%n", getValueOfTempC(), scale);
		} else if (scale == 'C') {
			System.out.printf("%.1f" + " degrees " + "%c%n", getValueOfTempF(), scale);
		} else {
			System.out.println("Fatal Error!");
			System.exit(0);
		}
	}
	
	public void setValueOfTemp(double valueOfTemp) {
		this.valueOfTemp = valueOfTemp;
	}
	
	public void setScale(char scale) {
		if ((scale != 'C') && (scale != 'F')) {
			System.out.println("Fatal Error!");
			System.exit(0);
		} else {
			this.scale = scale;
		}
	}
	
	public char getScale() {
		return this.scale;
	}
	
	public double getValueOfTemp() {
		return this.valueOfTemp;
	}
	
	public void setBoth(double valueOfTemp, char scale) {
		if ((scale != 'C') && (scale != 'F')) {
			System.out.println("Fatal Error!");
			System.exit(0);
		} 
		this.scale = scale;
		this.valueOfTemp = valueOfTemp;
	}
	
	public boolean equals(Temperature other) {
		if ((this.getScale() == 'C') && (other.getScale() == 'F')) {
			double degreesC = other.getValueOfTempC();
			return (this.getValueOfTemp() == degreesC);
		} else if ((this.getScale() == 'F') && (other.getScale() == 'C')) {
			double degreesF = other.getValueOfTempF();
			return (this.getValueOfTemp() == degreesF);
		} else {
			return (this.getValueOfTemp() == other.getValueOfTemp());
		}
	}
	
	public boolean moreThan(Temperature other) {
		if ((this.getScale() == 'C') && (other.getScale() == 'F')) {
			double degreesC = other.getValueOfTempC();
			return (this.getValueOfTemp() > degreesC);
		} else if ((this.getScale() == 'F') && (other.getScale() == 'C')) {
			double degreesF = other.getValueOfTempF();
			return (this.getValueOfTemp() > degreesF);
		} else {
			return (this.getValueOfTemp() > other.getValueOfTemp());
		}
	}
	
	public boolean lessThan(Temperature other) {
		if ((this.getScale() == 'C') && (other.getScale() == 'F')) {
			double degreesC = other.getValueOfTempC();
			return (this.getValueOfTemp() < degreesC);
		} else if ((this.getScale() == 'F') && (other.getScale() == 'C')) {
			double degreesF = other.getValueOfTempF();
			return (this.getValueOfTemp() < degreesF);
		} else {
			return (this.getValueOfTemp() < other.getValueOfTemp());
		}
	}
	
	public String toString() {
		return (valueOfTemp + " degrees " + scale);
	}
		
	
	public static void main(String[] args) {
		Temperature time = new Temperature();
		System.out.println(time);
		Temperature time1 = new Temperature(-40, 'F');
		System.out.println(time1);
		System.out.println(time.equals(time1));
		System.out.println(time.moreThan(time1));
		System.out.println(time.lessThan(time1));
	}
}
