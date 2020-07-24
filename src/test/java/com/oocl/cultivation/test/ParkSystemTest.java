package com.oocl.cultivation.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.security.krb5.internal.Ticket;


public class ParkSystemTest {

    @Test
    void should_return_a_parking_ticket_when_parking_given_car_parking_boy(){
        //given
        String carId = "A001";
        ParkingBoy parkingBoy = new ParkingBoy();
        Car car = new Car(carId);

        //when
        ParkingTicket parkingTicket = parkingBoy.parking(car);

        //then
        Assertions.assertEquals(parkingTicket.getToken(),"T001");

    }

    @Test
    void should_return_a_car_when_parking_boy_fetch_car_given_ticket(){
        //given

        ///when

        //then
    }

}
