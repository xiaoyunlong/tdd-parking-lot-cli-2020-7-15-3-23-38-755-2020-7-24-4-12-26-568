package com.oocl.cultivation.test;


public class ParkingBoy {
    private int parkingLotCapacity = 3;

    public ParkingTicket parking(Car car) {
        if (car == null) {
            return null;
        }
        if (car.isParked()) {
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

    public String queryMessage(ParkingTicket ticket) {
        if(ticket.getTicketNumber().equals("Wrong")){
            return "Unrecognized parking ticket.";
        }
        if (ticket.isUsed()){
            return "Unrecognized parking ticket.";
        }
        return "ok";
    }
}
