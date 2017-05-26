package org.chapter4.absolutejava;

public class Fraction {

	private int numerator;
	private int denominator;

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public double returnAns(int numerator, int denominator) {
		return (((double) numerator) / ((double) denominator));
	}

	public String reducedAns(int numerator, int denominator) {
		assert (denominator != 0);
		int divisor = 1;
		int gcd = 0;
		if ((numerator > 0) && (denominator > 0)) {
			while ((divisor <= numerator) && (divisor <= denominator)) {
				if (((numerator % divisor) == 0) && ((denominator % divisor) == 0)) {
					if (gcd < divisor) {
						gcd = divisor;
					}
				}
				divisor++;
			}
			return ((numerator / gcd) + "/" + (denominator / gcd));
		} else if ((numerator < 0) || (denominator < 0)) {
			divisor = -1;
			while ((divisor >= numerator) || (divisor >= denominator)) {
				if (((numerator % divisor) == 0) && ((denominator % divisor) == 0)) {
					if (gcd > divisor) {
						gcd = divisor;
					}
				}
				divisor--;
			}
			return ((numerator / -gcd) + "/" + (denominator / -gcd));
		} else {
			return (numerator + "/" + denominator);
		}
	}
	
	public static void main(String[] args) {
		Fraction tester = new Fraction();
		System.out.println(tester.reducedAns(20, 60));
	}
}
