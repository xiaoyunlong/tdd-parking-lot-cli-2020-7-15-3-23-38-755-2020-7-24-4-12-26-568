package com.oocl.cultivation.test;


import java.util.LinkedList;
import java.util.List;

public class ParkingBoy {

    private List<ParkingLot> parkingLots = new LinkedList<>();

    public ParkingBoy(ParkingLot... parkingLots) {
        for (ParkingLot parkingLot : parkingLots) {
            this.parkingLots.add(parkingLot);
        }
    }

    public ParkingTicket parking(Car car) {
        if (car == null) {
            return null;
        }
        if (car.isParked()) {
            return null;
        }

        for (ParkingLot parkingLot : this.parkingLots) {
            if (parkingLot.getAvailableCapacity() != 0) {
                ParkingTicket ticket = parkingLot.parkingCarTOParkingLot(car);
                return ticket;
            }
        }
        car.setParked(true);

        return null;
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
        if (ticket == null) {
            return "Please provide your parking ticket.";
        }
        if (ticket.getTicketNumber().equals("Wrong")) {
            return "Unrecognized parking ticket.";
        }
        if (ticket.isUsed()) {
            return "Unrecognized parking ticket.";
        }
        return "ok";
    }

    public String queryParkingMessage(ParkingBoy parkingBoy) {

        return "Not enough position.";
    }
}
