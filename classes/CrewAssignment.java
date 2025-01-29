
package classes;

public class CrewAssignment {
    private String idEmployee;
    private String idFlights;

    // Default constructor
    public CrewAssignment() {
    }

    // Getters and setters

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getIdFlights() {
        return idFlights;
    }

    public void setIdFlights(String idFlights) {
        this.idFlights = idFlights;
    }

    // Override toString() method for debugging purposes
    @Override
    public String toString() {
        return "CrewAssignment{" +
                "idEmployee='" + idEmployee + '\'' +
                ", idFlights='" + idFlights + '\'' +
                '}';
    }
}