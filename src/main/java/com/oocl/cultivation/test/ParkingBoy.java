package com.oocl.cultivation.test;



public class ParkingBoy {

    public ParkingTicket parking(Car car) {

        return new ParkingTicket(car.getCarNumber());
    }

    public Car fetchCar(ParkingTicket parkingTicket) {
        if(parkingTicket.getTicketNumber().equals("Wrong")){
            return null;
        }
        return new Car(parkingTicket.getTicketNumber());
    }
}
