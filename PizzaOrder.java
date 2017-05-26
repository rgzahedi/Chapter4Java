package org.chapter4.absolutejava;

import org.chapter4.absolutejava.Pizza;

public class PizzaOrder {
	
	private Pizza order1;
	private Pizza order2;
	private Pizza order3;
	private int numPizzas;
	
	public void setNumPizzas(int numPizzas) {
		if ((numPizzas < 1) || (numPizzas > 3)) {
			System.out.println("Error: Number of pizzas must be between 1 and 3!");
			System.exit(0);
		} else {
			this.numPizzas = numPizzas;
		}
	}
	
	public PizzaOrder() {
		numPizzas = 0;
		order1 = new Pizza();
		order2 = new Pizza();
		order3 = new Pizza();
	}
	
	public PizzaOrder(int numPizzas, Pizza pizza1, Pizza pizza2, Pizza pizza3) {
		setNumPizzas(numPizzas);
		setPizza1(pizza1);
		setPizza2(pizza2);
		setPizza3(pizza3);
	}
	
	public PizzaOrder(int numPizzas, Pizza pizza1) {
		setNumPizzas(numPizzas);
		setPizza1(pizza1);
	}
	
	public PizzaOrder(int numPizzas, Pizza pizza1, Pizza pizza2) {
		setNumPizzas(numPizzas);
		setPizza1(pizza1);
		setPizza2(pizza2);
	}
	
	public int getNumPizzas() {
		return numPizzas;
	}
	
	public void setPizza1(Pizza pizza1) {
		this.order1 = pizza1;
	}
	
	public Pizza getPizza1() {
		return order1;
	}
	
	public void setPizza2(Pizza pizza2) {
		this.order2 = pizza2;
	}
	
	public Pizza getPizza2() {
		return order2;
	}
	
	public void setPizza3(Pizza pizza3) {
		this.order3 = pizza3;
	}
	
	public Pizza getPizza3() {
		return order3;
	}
	
	public double calcTotal() {
		if (numPizzas == 1) {
			return (double) (order1.calcCost());
		} else if (numPizzas == 2) {
			return (double) (order1.calcCost() + order2.calcCost());
		} else if (numPizzas == 3) {
			return (double) (order1.calcCost() + order2.calcCost() + order3.calcCost());
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Pizza pizza1 = new Pizza("large", 1, 0, 1);
		Pizza pizza2 = new Pizza("medium", 2, 2, 0);
		PizzaOrder order = new PizzaOrder(2, pizza1, pizza2);
		order.setNumPizzas(2);
		order.setPizza1(pizza1);
		order.setPizza2(pizza2);
		double total = order.calcTotal();
		System.out.println(total);
		Pizza pizza3 = new Pizza("small", 2, 5, 0);
		order.setNumPizzas(3);
		order.setPizza3(pizza3);
		total = order.calcTotal();
		System.out.println(total);
	}
}
