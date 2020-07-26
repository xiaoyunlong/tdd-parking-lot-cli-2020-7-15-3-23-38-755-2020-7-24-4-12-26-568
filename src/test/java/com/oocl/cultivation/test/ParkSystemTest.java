package com.oocl.cultivation.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.security.krb5.internal.Ticket;


public class ParkSystemTest {

    @Test
    void should_return_a_parking_ticket_when_parking_given_car_parking_boy(){
        //given
        String carNumber = "A001";
        ParkingBoy parkingBoy = new ParkingBoy();
        Car car = new Car(carNumber);

        //when
        ParkingTicket parkingTicket = parkingBoy.parking(car);

        //then
        Assertions.assertNotNull(parkingTicket);

    }

    @Test
    void should_return_correct_car_when_fetch_car_given_ticket_and_car_in_parking_lot_and_parking_boy(){
        //given
        String carNumber = "A001";
        ParkingBoy parkingBoy = new ParkingBoy();
        Car car = new Car(carNumber);
        ParkingTicket parkingTicket = new ParkingTicket(carNumber);

        //when
        Car result = parkingBoy.fetchCar(parkingTicket);

        //then
        Assertions.assertEquals(car.getCarNumber(),result.getCarNumber());

    }

    @Test
    void should_return_two_ticket_when_parking_given_two_cars_and_parking_boy(){
        //given
        String firstCarNumber = "A001";
        String secondCarNumber = "A002";
        ParkingBoy parkingBoy = new ParkingBoy();
        Car firstCar = new Car(firstCarNumber);
        Car secondCar = new Car(secondCarNumber);

        //when
        ParkingTicket firstTicket = parkingBoy.parking(firstCar);
        ParkingTicket secondTicket = parkingBoy.parking(secondCar);
        //then
        Assertions.assertNotNull(firstTicket);
        Assertions.assertNotNull(secondTicket);
    }




}
