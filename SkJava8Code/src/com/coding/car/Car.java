package com.coding.car;

public class Car {
	 private String model;
	    private double price;

	    // Constructor
	    public Car(String model, double price) {
	        this.model = model;
	        this.price = price;
	    }

	    // Getters
	    public String getModel() {
	        return model;
	    }

	    public double getPrice() {
	        return price;
	    }

	    // toString method for easy printing
	    @Override
	    public String toString() {
	        return "Car{" +
	                "model='" + model + '\'' +
	                ", price=" + price +
	                '}';
	    }
	}

