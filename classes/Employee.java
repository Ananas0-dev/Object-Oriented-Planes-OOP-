package classes;

public class Employee extends Person {
    private String idEmployee;
    private String salary;
    private String empUsername;
    private String empPassword;
    private String ssn;

    // Constructor
    public Employee(String idEmployee, String salary, String empUsername, String empPassword, String ssn) {
        this.idEmployee = idEmployee;
        this.salary = salary;
        this.empUsername = empUsername;
        this.empPassword = empPassword;
        this.ssn = ssn;
    }

    // Getters and setters
    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getEmpUsername() {
        return empUsername;
    }

    public void setEmpUsername(String empUsername) {
        this.empUsername = empUsername;
    }

    public String getEmpPassword() {
        return empPassword;
    }

    public void setEmpPassword(String empPassword) {
        this.empPassword = empPassword;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    // toString method to display employee details
    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee='" + idEmployee + '\'' +
                ", salary='" + salary + '\'' +
                ", empUsername='" + empUsername + '\'' +
                ", empPassword='" + empPassword + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}