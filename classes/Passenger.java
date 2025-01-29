package classes;



public class Passenger extends Person{
    private static Passenger instance;
    private String idPassport;
    private String passengerUsername;
    private String passengerPassword;
    private String ssn;

    // Default constructor
    public Passenger() {
       
    }
    public Passenger(String idPassport,String ssn) {
       this.idPassport= idPassport; this.ssn = ssn;
    }
    public Passenger(String idPassport,String ssn, String firstName, String middleName, String familyName, 
                  String dateOfBirth, String gender, String phone, String email, String address) {
       super(ssn,  firstName,  middleName,  familyName, 
                  dateOfBirth, gender, phone,  email, address);
       this.idPassport = idPassport;
       this.ssn = super.getSsn();
    }

    //
    public static void createIstance(String idPassport,String ssn, String firstName, String middleName, String familyName, 
                  String dateOfBirth, String gender, String phone, String email, String address){
        Person.createInstance(ssn,  firstName,  middleName,  familyName, 
                  dateOfBirth, gender, phone,  email, address);
        instance = new Passenger(idPassport,ssn);
    }
    public static Passenger getInstance(){
        return instance;
    }
    // Getters and setters

    public String getIdPassport() {
        return idPassport;
    }

    public void setIdPassport(String idPassport) {
        this.idPassport = idPassport;
    }

    public String getPassengerUsername() {
        return passengerUsername;
    }

    public void setPassengerUsername(String passengerUsername) {
        this.passengerUsername = passengerUsername;
    }

    public String getPassengerPassword() {
        return passengerPassword;
    }

    public void setPassengerPassword(String passengerPassword) {
        this.passengerPassword = passengerPassword;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    // Override toString() method for debugging purposes
    @Override
    public String toString() {
        return "Passenger{" +
                "idPassport='" + idPassport + '\'' +
                ", passengerUsername='" + passengerUsername + '\'' +
                ", passengerPassword='" + passengerPassword + '\'' +
                ", ssn='" + ssn + '\'' +
                '}'+super.toString();
    }

    public void createInstance(String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}