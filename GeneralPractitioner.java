// The GeneralPractitioner class extends HealthProfessional and represents a general doctor
public class GeneralPractitioner extends HealthProfessional {
    private String specialization;

    // Default constructor
    public GeneralPractitioner() {
    }

    // Parameterized constructor to initialize all fields, including inherited ones
    public GeneralPractitioner(int id, String name, String basicInformation, String specialization) {
        super(id, name, basicInformation); 
        this.specialization = specialization; 
    }

    // Method to print details of the general practitioner
    public void printGeneralPractitionerDetails() {
        System.out.println("The doctor details are:");
        super.printAllDetailsOfHealthProfessional(); 
        System.out.println("HealthProfessional's Specialization: " + specialization);
        System.out.println("HealthProfessional Type: General Practitioner"); 
    }
}