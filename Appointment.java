// Class representing an appointment between a patient and a health professional
public class Appointment {
    private String patientName;
    private String patientMobile;
    private String preferredTimeSlot;
    private HealthProfessional healthProfessional;

    // Default constructor
    public Appointment() {}

    // Parameterized constructor to initialize all fields
    public Appointment(String patientName, String patientMobile, String preferredTimeSlot, HealthProfessional healthProfessional) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.preferredTimeSlot = preferredTimeSlot;
        this.healthProfessional = healthProfessional;
    }

    // Method to print all details of the appointment
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Patient Time Slot: " + preferredTimeSlot);
        healthProfessional.printAllDetailsOfHealthProfessional();
    }

    // Getter method to retrieve the patient's mobile number
    public String getMobile() {
        return patientMobile;
    }
    
}
