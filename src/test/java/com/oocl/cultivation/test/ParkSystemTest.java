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
        String firstTickNumber = "A001";
        String secondTickNumber = "A002";
        ParkingBoy parkingBoy = new ParkingBoy();
        ParkingTicket firstTicket = new ParkingTicket(firstTickNumber);
        ParkingTicket secondTicket = new ParkingTicket(secondTickNumber);
        Car firstCar = new Car(firstTickNumber);
        Car secondCar = new Car(secondTickNumber);

        //when
        Car firstResultCar = parkingBoy.fetchCar(firstTicket);
        Car secondResultCar = parkingBoy.fetchCar(secondTicket);
        //then
        Assertions.assertEquals(firstCar.getCarNumber(),firstResultCar.getCarNumber());
        Assertions.assertEquals(secondCar.getCarNumber(),secondResultCar.getCarNumber());

    }

    @Test
    void should_return_two_cars_when_fetch_car_given_two_tickets_and_two_cars_in_parking_lot_and_parking_boy(){
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

    @Test
    void should_return_null_when_fetch_car_given_wrong_ticket_and_parking_boy(){
        //given
        String ticketNumber = "Wrong";
        ParkingBoy parkingBoy = new ParkingBoy();
        ParkingTicket wrongTicket = new ParkingTicket(ticketNumber);

        //when
        Car result  = parkingBoy.fetchCar(wrongTicket);

        //then
        Assertions.assertNull(result);
    }

    @Test
    void should_return_null_when_fetch_car_given_no_ticket_and_parking_boy(){
        //given
        ParkingBoy parkingBoy = new ParkingBoy();

        //when
        Car car = parkingBoy.fetchCar(null);

        //then
        Assertions.assertNull(car);
    }

    @Test
    void should_return_null_when_fetch_car_given_used_ticket_and_parking_boy(){
        //given
        String ticketNumber = "A001";
        ParkingBoy parkingBoy = new ParkingBoy();
        ParkingTicket ticket =  new ParkingTicket(ticketNumber);
        Car firstFetchCar = parkingBoy.fetchCar(ticket);

        //when
        Car secondFetchCar = parkingBoy.fetchCar(ticket);

        //then
        Assertions.assertNull(secondFetchCar);
    }

    @Test
    void should_return_null_when_parking_boy_parking_car_given_car_and_no_position_parking_lot() {
        //given
        ParkingBoy parkingBoy = new ParkingBoy();
        int parkingCarIndex = 0;
        String[] carNumber = {"A001","A002","A003"};
        for ( ; parkingCarIndex < 3; parkingCarIndex++) {
            parkingBoy.parking(new Car(carNumber[parkingCarIndex]));
        }
        //when
        ParkingTicket ticket = parkingBoy.parking(new Car("A004"));
        //then
        Assertions.assertNull(ticket);
    }





}
