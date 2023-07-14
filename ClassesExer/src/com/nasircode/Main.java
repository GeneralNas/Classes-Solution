package com.nasircode;

import com.nasircode.car.Car;
import com.nasircode.car.EngineType;
import com.nasircode.cardealership.CarDealership;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car("BMW",
                new BigDecimal("25000"),
                EngineType.PETROL);

        Car tesla = new Car("TESLA",
                new BigDecimal("50000"),
                EngineType.ELECTRIC);

        Car ford = new Car("FORD",
                new BigDecimal("30000"),
                EngineType.PETROL);

        Car benz = new Car("Mercedes Benz",
                new BigDecimal("40000"),
                EngineType.ELECTRIC);

        Car honda = new Car("HONDA",
                new BigDecimal("23000"),
                EngineType.PETROL);

        Car hyundai = new Car("HYUNDAI",
                new BigDecimal("15000"),
                EngineType.ELECTRIC);

        CarDealership vroom = new CarDealership("VROOM",
                5);

        vroom(bmw, tesla, ford, benz, honda, hyundai, vroom);


    }

    private static void vroom(Car bmw, Car tesla, Car ford, Car benz, Car honda, Car hyundai, CarDealership vroom) {
        vroom.addCar(bmw);
        vroom.addCar(tesla);
        vroom.addCar(ford);
        vroom.addCar(hyundai);
        vroom.addCar(honda);
        vroom.addCar(benz);

        System.out.println(vroom.getNUmberOfCars());
        System.out.println(vroom.getMaxNumOfCars());
        System.out.println(Arrays.toString(vroom.getCars()));
        Car car = vroom.findCarByManufacturer("BMW");
        System.out.println(car);
    }

}