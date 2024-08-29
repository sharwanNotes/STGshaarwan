package com.coding.car;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CarTest {

	public static void main(String[] args) {
		List<Car> cars = Arrays.asList(new Car("Model X", 90000), new Car("Model S", 80000), new Car("Model 3", 35000),
				new Car("Model Y", 45000));

		Optional<Car> cheapestCar = cars.stream().min(Comparator.comparing(Car::getPrice));
		cheapestCar.ifPresent(car -> System.out.println("Cheapest Car Model: " + car.getModel()));
	}
}
