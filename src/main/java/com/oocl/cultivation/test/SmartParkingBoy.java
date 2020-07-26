package com.oocl.cultivation.test;

public class SmartParkingBoy extends ParkingBoy{

    public SmartParkingBoy(ParkingLot... parkingLots) {
        super(parkingLots);
    }

    @Override
    public ParkingTicket parking(Car car) {
        return super.parking(car);
    }
}
