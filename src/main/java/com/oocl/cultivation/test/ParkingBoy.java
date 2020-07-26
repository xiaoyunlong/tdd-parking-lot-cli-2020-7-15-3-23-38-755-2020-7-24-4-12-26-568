package com.oocl.cultivation.test;



public class ParkingBoy {

    public ParkingTicket parking(Car car) {

        return new ParkingTicket(car.getCarNumber());
    }

    public Car fetchCar(ParkingTicket parkingTicket) {
        if(parkingTicket==null){
            return null;
        }
        if(parkingTicket.getTicketNumber().equals("Wrong")){
            return null;
        }
        if(parkingTicket.isUsed()){
            return null;
        }
        parkingTicket.setUsed(true);
        return new Car(parkingTicket.getTicketNumber());
    }
}
