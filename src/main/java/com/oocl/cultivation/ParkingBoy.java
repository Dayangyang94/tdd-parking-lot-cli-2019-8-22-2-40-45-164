package com.oocl.cultivation;

public class ParkingBoy {

    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        // TODO: Please implement the method
    	if(this.parkingLot.getAvailableParkingPosition()<1) {
    		lastErrorMessage = "The parking lot is full.";
    		return null;
    	}
    	ParkingTicket ticket = parkingLot.park(car);
    	
    	if(ticket!=null) {
    		lastErrorMessage = null;
    	}
    	return ticket;
    }

    public Car fetch(ParkingTicket ticket) {
        // TODO: Please implement the method
    	if(ticket==null) {
    		lastErrorMessage = "Please provide your parking ticket.";
    		return null;
    	}
    	Car car =  parkingLot.fetch(ticket);
    	if(car == null) {
    		lastErrorMessage = "Unrecognized parking ticket.";
    	}
    	return car;
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}
