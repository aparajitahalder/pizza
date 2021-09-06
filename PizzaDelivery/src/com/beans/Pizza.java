package com.beans;

import com.beans.Pizza;


public class Pizza implements Comparable<Pizza>{


	private String pizzaName;
	int sizeInCms; 
	private String majorIngredientOne; 
	private String majorIngredientTwo; 
	private String majorIngredientThree; 
	private float weight; 
	private float price;
	
	
	
	// Default Constructor
	public Pizza() {
		pizzaName = null;
		sizeInCms = 0;
		majorIngredientOne = null;
		majorIngredientTwo = null;
		majorIngredientThree = null;
		weight = 0;
		price = 0;
	}

	
	public Pizza(String name) {
		super();
		this.pizzaName=name;
	}

	public Pizza(int sz) {
		super();
		this.sizeInCms=sz;
	}
	
    // Parameterized Constructor
	public Pizza(String pizzaName, int sizeInCms, String majorIngredientOne,
			String majorIngredientTwo, String majorIngredientThree,
			float weight, float price) {
		super();
		this.pizzaName = pizzaName;
		this.sizeInCms = sizeInCms;
		this.majorIngredientOne = majorIngredientOne;
		this.majorIngredientTwo = majorIngredientTwo;
		this.majorIngredientThree = majorIngredientThree;
		this.weight = weight;
		this.price = price;
	}




	

	//Display Preparation Procedure
    public void preparation() {
    	
    	System.out.println("Preparing Pizza..");
    	
	}




	public String getPizzaName() {
		return pizzaName;
	}




	public void setPizzaName(String pizzaName) {
		this.pizzaName = pizzaName;
	}




	public int getSizeInCms() {
		return sizeInCms;
	}




	public void setSizeInCms(int sizeInCms) {
		this.sizeInCms = sizeInCms;
	}




	public String getMajorIngredientOne() {
		return majorIngredientOne;
	}




	public void setMajorIngredientOne(String majorIngredientOne) {
		this.majorIngredientOne = majorIngredientOne;
	}




	public String getMajorIngredientTwo() {
		return majorIngredientTwo;
	}




	public void setMajorIngredientTwo(String majorIngredientTwo) {
		this.majorIngredientTwo = majorIngredientTwo;
	}




	public String getMajorIngredientThree() {
		return majorIngredientThree;
	}




	public void setMajorIngredientThree(String majorIngredientThree) {
		this.majorIngredientThree = majorIngredientThree;
	}




	public float getWeight() {
		return weight;
	}




	public void setWeight(float weight) {
		this.weight = weight;
	}




	public float getPrice() {
		return price;
	}




	public void setPrice(float price) {
		this.price = price;
	}



	public String hashCode() {
		System.out.println("hashCode called");
		return pizzaName;
	}

	
	public boolean equals(Object obj) {
		Pizza other = (Pizza) obj;
		System.out.println("equals called "+this.getPizzaName()+"------"+other.getPizzaName());
		
		if (pizzaName != other.pizzaName)
			return false;
		return true;
	}

	
	public String displayData() {
		return pizzaName + sizeInCms+majorIngredientOne+majorIngredientTwo + majorIngredientThree+ weight + price ;
		
	}

	
	public int compareTo(Pizza p) {
		System.out.println("in CompareTo "+this.pizzaName+"------"+p.pizzaName);
		return this.pizzaName-p.pizzaName;
	}
	
	
	public String toString() {
		return "Pizza [pizzaName=" + pizzaName + ", sizeInCms=" + sizeInCms
				+ ", majorIngredientOne=" + majorIngredientOne
				+ ", majorIngredientTwo=" + majorIngredientTwo
				+ ", majorIngredientThree=" + majorIngredientThree
				+ ", weight=" + weight + ", price=" + price + "]";
	}




} 
	
	

