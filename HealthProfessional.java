// Base class representing a generic health professional
public class HealthProfessional {

    private int id;
    private String name;
    private String information;

    // Default constructor
    public HealthProfessional() {
    }

    // Parameterized constructor to initialize all fields
    public HealthProfessional(int id, String name, String information) {
        this.id = id;
        this.name = name;
        this.information = information;
    }

    // Method to print all basic details of the health professional
    public void printAllDetailsOfHealthProfessional() {
        System.out.println("Doctor Id: " + id);
        System.out.println("Doctor Name: " + name);
        System.out.println("Doctor Info: " + information);
    }
}
