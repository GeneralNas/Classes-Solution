package com.nasircode.cardealership;

import com.nasircode.car.Car;

import java.util.Arrays;
import java.util.Objects;

public class CarDealership {
    private String name;
    private int maxNumOfCars;
    private Car[] cars;

    public CarDealership(String name, int maxNumOfCars) {
        this.name = name;
        this.maxNumOfCars = maxNumOfCars;
        this.cars = new Car[maxNumOfCars];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxNumOfCars() {
        return maxNumOfCars;
    }

    public void setMaxNumOfCars(int maxNumOfCars) {
        this.maxNumOfCars = maxNumOfCars;
    }

    public Car[] getCars() {
        return cars;
    }

    public void setCars(Car[] cars) {
        this.cars = cars;
    }

    public int getNumberOfCars () {
        int count = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] != null) {
                count++;
            }
        }
        return count;
    }

    public void addCar(Car car) {
        //Iterate through the cars array
        for (int i = 0; i < cars.length; i++) {
            //IF CARS ARRAY HAS A NULL VALUE IN CURRENT POSITION I ADD A NEW CAR AND BREAK THE LOOP TO PREVENT ADDING SAME CAR IN ANOTHER POSITION.
            if(cars[i] == null) {
                cars[i] = car;
                System.out.println("This car was added: " + car);
                break;
                //IF LOOP IS IN LAST POSITION AND NO EMPTY SPACE IS FOUND I LET USER KNOW THERES NO MORE ROOM FOR ANOTHER CAR.
            } else if(i == cars.length - 1) {
                System.out.println("There's no room for more cars");
            }
        }
    }

    public Car findCarByManufacturer (String manufacturer) {
        Car result = null;
        for (Car car : cars) {
            if (car.getManufacturer().equals(manufacturer)) {
                result = car;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "CarDealership{" +
                "name='" + name + '\'' +
                ", maxNumOfCars=" + maxNumOfCars +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDealership that = (CarDealership) o;
        return maxNumOfCars == that.maxNumOfCars && Objects.equals(name, that.name) && Arrays.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, maxNumOfCars);
        result = 31 * result + Arrays.hashCode(cars);
        return result;
    }
}
