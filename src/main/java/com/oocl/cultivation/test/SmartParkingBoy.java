package com.oocl.cultivation.test;

public class SmartParkingBoy extends ParkingBoy{

    public SmartParkingBoy(ParkingLot... parkingLots) {
        super(parkingLots);
    }

    @Override
    public ParkingTicket parking(Car car) {
       ParkingLot correctParkingLot = this.parkingLots.get(0);
       int maxAvailableCapacity = 0;
        for (ParkingLot parkingLot : this.parkingLots) {
            int availableCapacity = parkingLot.getAvailableCapacity();
            if (availableCapacity > maxAvailableCapacity) {
                maxAvailableCapacity = availableCapacity;
                correctParkingLot = parkingLot;
            }
        }
        ParkingTicket ticket = correctParkingLot.parkingCarTOParkingLot(car);
        ticket.setCorrectParkingLot(correctParkingLot);
        return ticket;
    }
}
