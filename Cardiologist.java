// The Cardiologist class extends HealthProfessional and represents a doctor specializing in heart-related treatments
public class Cardiologist extends HealthProfessional {
    private String expertise;

    // Default constructor that calls the parent (HealthProfessional) default constructor
    public Cardiologist() {
        super(); // Initializes inherited properties (id, name, basicInformation) with default values
    }

    // Parameterized constructor to initialize all fields, including inherited and new ones
    public Cardiologist(int id, String name, String basicInformation, String expertise) {
        super(id, name, basicInformation); 
        this.expertise = expertise;       
    }

    // Method to print detailed information about the cardiologist
    public void printCardiologistDetails() {
        System.out.println("The doctor details are:");
        super.printAllDetailsOfHealthProfessional(); // Calls parent method to print id, name, and basic info
        System.out.println("HealthProfessional's Expertise: " + expertise); 
        System.out.println("HealthProfessional Type: Cardiologist");      
    }
}
