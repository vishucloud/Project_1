package com.purplewisteria.collections.sorted.set;

public class Dog implements Comparable <Dog>  {
	
	private int size;

	public Dog(int size) {
		super();
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public int compareTo(Dog o) {
		
		  return this.size-o.size;
		  
	}
	
	@Override 
	public String toString() {
		
		return "Dog size " + this.size;
	}

}
