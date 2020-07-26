package com.oocl.cultivation.test;

public class ParkingTicket {
    private String ticketNumber;
    private boolean used;

    public ParkingTicket(String ticketNumber) {
        this.ticketNumber = ticketNumber;
        this.used = false;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }
}
