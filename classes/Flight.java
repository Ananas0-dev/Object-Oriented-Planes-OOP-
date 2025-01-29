package classes;



public class Flight {
    private static Flight instance = new Flight();
    private String idFlights;
    private String arrivalTime;
    private String departureTime;
    private String destination;
    private String origin;
    private String idPlane;

    // Constructor
    public Flight(String idFlights, String arrivalTime, String departureTime, String destination, String origin, String idPlane) {
        this.idFlights = idFlights;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.destination = destination;
        this.origin = origin;
        this.idPlane = idPlane;
    }

    public Flight() {
       
    }
    public static void createInstance(String idFlights, String arrivalTime, String departureTime, String destination, String origin, String idPlane){
        instance.setIdFlights(idFlights); 
        instance.setArrivalTime(arrivalTime);
        instance.setDepartureTime(departureTime);
        instance.setDestination(destination);
        instance.setOrigin(origin);
        instance.setIdPlane(idPlane);
    }
    public static Flight getInstance(){
        return instance;
    }
    

    // Getters and Setters
    public String getIdFlights() {
        return idFlights;
    }

    public void setIdFlights(String idFlights) {
        this.idFlights = idFlights;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getIdPlane() {
        return idPlane;
    }

    public void setIdPlane(String idPlane) {
        this.idPlane = idPlane;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Flight{" +
                "idFlights='" + idFlights + '\'' +
                ", arrivalTime=" + arrivalTime +
                ", departureTime=" + departureTime +
                ", destination='" + destination + '\'' +
                ", origin='" + origin + '\'' +
                ", idPlane='" + idPlane + '\'' +
                '}';
    }
}