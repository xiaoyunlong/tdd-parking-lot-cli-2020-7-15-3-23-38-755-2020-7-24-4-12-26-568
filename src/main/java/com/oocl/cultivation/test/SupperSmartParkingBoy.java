package com.oocl.cultivation.test;

import java.text.DecimalFormat;

public class SupperSmartParkingBoy extends ParkingBoy {

    public SupperSmartParkingBoy(ParkingLot... parkingLots) {
        super(parkingLots);
    }

    @Override
    public ParkingTicket parking(Car car) {
        DecimalFormat df = new DecimalFormat("0.00");//保留两位小数
        ParkingLot correctParkingLot = this.parkingLots.get(0);
        int available = correctParkingLot.getAvailableCapacity();
        int total = correctParkingLot.getTotalCapacity();
        String rate = df.format((double) available / total);
        double maxAvailableRate = Double.parseDouble(rate);

        for (ParkingLot parkingLot : this.parkingLots) {
            available = parkingLot.getAvailableCapacity();
            total = parkingLot.getTotalCapacity();
            rate = df.format((double) available / total);
            double availableRate = Double.parseDouble(rate);

            if (availableRate > maxAvailableRate) {
                maxAvailableRate = availableRate;
                correctParkingLot = parkingLot;
            }
        }
        ParkingTicket ticket = correctParkingLot.parkingCarTOParkingLot(car);
        ticket.setCorrectParkingLot(correctParkingLot);
        return ticket;
    }
}
