package classes;

import java.util.Date;

public class Boarding {
    private String ticketId;
    private String flightId;
    private Date travelDate;
    private double cost;
    private String destination;
    private String luggageId;
    private String seatIdentifier;

    // Default constructor
    public Boarding() {
    }

    // Getters and setters

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public Date getTravelDate() {
        return travelDate;
    }

    public void setTravelDate(Date travelDate) {
        this.travelDate = travelDate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getLuggageId() {
        return luggageId;
    }

    public void setLuggageId(String luggageId) {
        this.luggageId = luggageId;
    }

    public String getSeatIdentifier() {
        return seatIdentifier;
    }

    public void setSeatIdentifier(String seatIdentifier) {
        this.seatIdentifier = seatIdentifier;
    }

    // Override toString() method for debugging purposes
    @Override
    public String toString() {
        return "Boarding{" +
                "ticketId='" + ticketId + '\'' +
                ", flightId='" + flightId + '\'' +
                ", travelDate=" + travelDate +
                ", cost=" + cost +
                ", destination='" + destination + '\'' +
                ", luggageId='" + luggageId + '\'' +
                ", seatIdentifier='" + seatIdentifier + '\'' +
                '}';
    }
}