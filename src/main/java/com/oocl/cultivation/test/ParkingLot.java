package com.oocl.cultivation.test;

import java.util.HashMap;

public class ParkingLot {


    private int totalCapacity;
    private int availableCapacity = 3;
    private HashMap<ParkingTicket, Car> parkingCars = new HashMap<>();

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }
    public int getAvailableCapacity() {
        return availableCapacity;
    }

    public void setAvailableCapacity(int availableCapacity) {
        this.availableCapacity = availableCapacity;
    }

    public ParkingTicket parkingCarTOParkingLot(Car car) {
        if (availableCapacity == 0) {
            return null;
        }
        ParkingTicket ticket = new ParkingTicket(car.getCarNumber());
        this.parkingCars.put(ticket, car);
        availableCapacity--;
        return ticket;
    }
}
