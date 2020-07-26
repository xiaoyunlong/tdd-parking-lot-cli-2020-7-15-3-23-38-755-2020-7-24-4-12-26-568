package com.oocl.cultivation.test;

public class SupperSmartParkingBoy extends ParkingBoy{

    public SupperSmartParkingBoy(ParkingLot... parkingLots) {
        super(parkingLots);
    }

    @Override
    public ParkingTicket parking(Car car) {
        return super.parking(car);
    }
}
