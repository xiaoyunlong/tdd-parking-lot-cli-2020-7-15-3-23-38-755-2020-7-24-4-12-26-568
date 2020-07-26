package com.oocl.cultivation.test;



public class ParkingBoy {

    public ParkingTicket parking(Car car) {

        return new ParkingTicket(car.getCarNumber());
    }

    public Car fetchCar(ParkingTicket parkingTicket) {
        return new Car("0000");
    }
}
