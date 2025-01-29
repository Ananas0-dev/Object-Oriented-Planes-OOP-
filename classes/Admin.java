package classes;

public class Admin extends Person {
    private String adminUsername;
    private String password;
    private String ssn;

    // Default constructor
    public Admin() {
    }

    // Parameterized constructor
    public Admin(String adminUsername, String password, String ssn) {
        this.adminUsername = adminUsername;
        this.password = password;
        this.ssn = ssn;
    }

    // Getters and setters

    public String getAdminUsername() {
        return adminUsername;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return "Admin{" +
                "adminUsername='" + adminUsername + '\'' +
                ", password='" + password + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}