package classes;

public class Plane {
    private String idPlane;
    private int planeCapacity;
    private String model;

    // Default constructor
    public Plane() {
    }

    // Getters and setters

    public String getIdPlane() {
        return idPlane;
    }

    public void setIdPlane(String idPlane) {
        this.idPlane = idPlane;
    }

    public int getPlaneCapacity() {
        return planeCapacity;
    }

    public void setPlaneCapacity(int planeCapacity) {
        this.planeCapacity = planeCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Override toString() method for debugging purposes
    @Override
    public String toString() {
        return "Plane{" +
                "idPlane='" + idPlane + '\'' +
                ", planeCapacity=" + planeCapacity +
                ", model='" + model + '\'' +
                '}';
    }
}