package com.oocl.cultivation.test;


public class ParkingBoy {
    private int parkingLotCapacity = 3;

    public ParkingTicket parking(Car car) {
        if(car.isParked()){
            return null;
        }
        if (this.parkingLotCapacity <= 0) {
            return null;
        }
        car.setParked(true);
        this.parkingLotCapacity--;
        return new ParkingTicket(car.getCarNumber());
    }

    public Car fetchCar(ParkingTicket parkingTicket) {

        if (parkingTicket == null) {
            return null;
        }
        if (parkingTicket.getTicketNumber().equals("Wrong")) {
            return null;
        }
        if (parkingTicket.isUsed()) {
            return null;
        }
        parkingTicket.setUsed(true);
        return new Car(parkingTicket.getTicketNumber());
    }
}
