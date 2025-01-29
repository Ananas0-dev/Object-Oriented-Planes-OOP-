package classes;

public class SeatClass {
    private static SeatClass instance; 
    private String classId;
    private float classPrice;
    private String className;

    // Constructor
    public SeatClass(String classId, float classPrice, String className) {
        this.classId = classId;
        this.classPrice = classPrice;
        this.className = className;
    }
    
    public static void createInstance(String classId, float classPrice, String className){
        instance= new SeatClass(classId, classPrice , className);
    }
    public static SeatClass getInstance(){
        return instance;
    }

    public SeatClass() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    // Getters and setters
    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public float getClassPrice() {
        return classPrice;
    }

    public void setClassPrice(float classPrice) {
        this.classPrice = classPrice;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    // toString method to display seat class details
    @Override
    public String toString() {
        return "SeatClass{" +
                "classId='" + classId + '\'' +
                ", classPrice=" + classPrice +
                ", className='" + className + '\'' +
                '}';
    }
}