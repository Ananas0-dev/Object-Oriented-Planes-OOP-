package classes;

public class PassengerBoarding {
    private String passportId;
    private String ticketId;

    // Constructor
    public PassengerBoarding(String passportId, String ticketId) {
        this.passportId = passportId;
        this.ticketId = ticketId;
    }

    // Getters and Setters
    public String getPassportId() {
        return passportId;
    }

    public void setPassportId(String passportId) {
        this.passportId = passportId;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "PassengerBoarding{" +
                "passportId='" + passportId + '\'' +
                ", ticketId='" + ticketId + '\'' +
                '}';
    }
}