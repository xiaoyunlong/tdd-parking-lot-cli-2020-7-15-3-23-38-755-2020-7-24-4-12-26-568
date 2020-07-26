package com.oocl.cultivation.test;

public class Car {
    private String carNumber;
    private boolean parked;

    public Car(String carNumber) {
        this.carNumber = carNumber;
        parked = false;
    }

    public boolean isParked() {
        return parked;
    }

    public void setParked(boolean parked) {
        this.parked = parked;
    }

    public String getCarNumber() {
        return carNumber;
    }
}
