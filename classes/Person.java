package classes;


public class Person {
    private static Person instance;
    private String ssn;
    private String firstName;
    private String middleName;
    private String familyName;
    private String dateOfBirth;
    private String gender;
    private String phone;
    private String email;
    private String address;

    
     public Person(){
     }
    // Constructor
    public Person(String ssn, String firstName, String middleName, String familyName, 
                  String dateOfBirth, String gender, String phone, String email, String address) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }
    
    public static void createInstance(String ssn, String firstName, String middleName, String familyName, 
                  String dateOfBirth, String gender, String phone, String email, String address){
        instance = new Person(ssn,  firstName,  middleName,  familyName, 
                  dateOfBirth, gender, phone,  email, address);
//        instance.setAddress(address);
//        instance.setDateOfBirth(dateOfBirth);
//        instance.setEmail(email);
//        instance.setFamilyName(familyName);
//        instance.setFirstName(firstName);
//        instance.setGender(gender);
//        instance.setMiddleName(middleName);
//        instance.setPhone(phone);
//        instance.setSsn(ssn);
    }
    
    public static Person getInstance(){
        return instance;
    }
    // Getters and Setters
    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Person{" +
                "ssn='" + ssn + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}