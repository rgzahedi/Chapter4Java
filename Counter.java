package org.chapter4.absolutejava;

public class Counter {
	
	private int count;
	
	public void setCount() {
		this.count = 0;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public void addCount() {
		this.count = this.count + 1;
	}
	
	public void subtractCount() {
		this.count = this.count - 1;
		if (this.count < 1) {
			setCount();
		}
	}
	
	public void outputCount() {
		System.out.println(this.count);
	}

	@Override
	public String toString() {
		return "Counter [count=" + count + "]";
	}
	
	public boolean equals(Counter other) {
		return (this.getCount() == other.getCount());
	}
	
	public static void main(String[] args) {
		Counter ramein = new Counter();
		ramein.setCount();
		ramein.outputCount();
		Counter kamron = new Counter();
		kamron.setCount();
		for (int i = 0; i < 3; i++) {
			ramein.addCount();
			kamron.addCount();
		}
		ramein.outputCount();
		kamron.outputCount();
		kamron.subtractCount();
		System.out.println(ramein.equals(kamron));	
		for (int k = 0; k < 3; k++) {
			kamron.subtractCount();
		}
		kamron.outputCount();
		System.out.println(kamron.equals(ramein));
	}
}
