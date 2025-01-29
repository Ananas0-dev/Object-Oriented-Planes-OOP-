package classes;

public class Seats {
    private static Seats instance;
    private String seatIdentifier;
    private Integer seatNum;
    private String seatClassId;
    private String idFlights;
    private String empty;

    // Constructor
    public Seats(String seatIdentifier, Integer seatNum, String seatClassId, String idFlights, String empty) {
        this.seatIdentifier = seatIdentifier;
        this.seatNum = seatNum;
        this.seatClassId = seatClassId;
        this.idFlights = idFlights;
        this.empty = empty;
    }
    
    public static void createInstance(String seatIdentifier, Integer seatNum, String seatClassId, String idFlights, String empty){
        instance = new Seats( seatIdentifier,  seatNum,  seatClassId,  idFlights,empty);
    }
    public static Seats getInstance(){
        return instance;
    }

    // Getters and Setters
    public String getSeatIdentifier() {
        return seatIdentifier;
    }

    public void setSeatIdentifier(String seatIdentifier) {
        this.seatIdentifier = seatIdentifier;
    }

    public Integer getSeatNum() {
        return seatNum;
    }

    public void setSeatNum(Integer seatNum) {
        this.seatNum = seatNum;
    }

    public String getSeatClassId() {
        return seatClassId;
    }

    public void setSeatClassId(String seatClassId) {
        this.seatClassId = seatClassId;
    }

    public String getIdFlights() {
        return idFlights;
    }

    public void setIdFlights(String idFlights) {
        this.idFlights = idFlights;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Dash90Seat{" +
                "seatIdentifier='" + seatIdentifier + '\'' +
                ", seatNum=" + seatNum +
                ", seatClassId='" + seatClassId + '\'' +
                ", idFlights='" + idFlights + '\'' +
                ", empty= "+ empty +
                '}';
    }
}