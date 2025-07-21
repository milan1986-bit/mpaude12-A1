import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {

        // Part 3 – Using classes and objects
        // Creating instances of GeneralPractitioner with different specializations
        GeneralPractitioner generalPractitioner1 = new GeneralPractitioner(
            1, "Dr. Oliver Thompson", 
            "Provides comprehensive healthcare to patients of all ages, with a focus on preventive care", 
            "Preventive Medicine"
        );

        GeneralPractitioner generalPractitioner2 = new GeneralPractitioner(
            2, "Dr. Amelia Johnson", 
            "Offers general practice services with a focus on mental health support and treatment", 
            "Mental Health Care"
        );

        GeneralPractitioner generalPractitioner3 = new GeneralPractitioner(
            3, "Dr. Ethan Smith", 
            "Experienced in managing chronic illnesses such as diabetes and hypertension", 
            "Chronic Disease Management"
        );

        // Creating instances of Cardiologist with specific expertise
        Cardiologist cardiologist1 = new Cardiologist(
            4, "Dr. Charlotte White", 
            "Specialises in diagnosing and treating heart rhythm disorders", 
            "Electrophysiology"
        );

        Cardiologist cardiologist2 = new Cardiologist(
            5, "Dr. Jack Wilson", 
            "Focuses on heart health and prevention of cardiovascular diseases", 
            "Preventive Cardiology"
        );

        Cardiologist cardiologist3 = new Cardiologist(
            6, "Dr. Sophie Harris", 
            "Experienced in treating patients with heart failure and complex cardiac conditions", 
            "Heart Failure Specialist"
        );

        // Printing details of all doctors created above
        generalPractitioner1.printGeneralPractitionerDetails();
        generalPractitioner2.printGeneralPractitionerDetails();
        generalPractitioner3.printGeneralPractitionerDetails();
        cardiologist1.printCardiologistDetails();
        cardiologist2.printCardiologistDetails();
        cardiologist3.printCardiologistDetails();

        System.out.println("------------------------------");



        // Part 5 – Collection of appointments

        ArrayList<Appointment> appointments = new ArrayList<>();

        // Creating appointments for general practitioners
        createAppointment(appointments, "Liam Johnson", "0412 345 678", "08:00", generalPractitioner1);
        createAppointment(appointments, "Charlotte Davis", "0421 556 789", "09:30", generalPractitioner2);
        createAppointment(appointments, "Ethan Wilson", "0433 987 123", "11:00", generalPractitioner1);

        // Creating appointments for cardiologists
        createAppointment(appointments, "Isla Brown", "0404 678 912", "13:00", cardiologist1);
        createAppointment(appointments, "Mason Taylor", "0455 321 654", "14:30", cardiologist2);
        createAppointment(appointments, "Ava Martin", "0466 112 334", "16:00", cardiologist3);

        printExistingAppointments(appointments);

        cancelBooking(appointments, "0455 321 654");

        printExistingAppointments(appointments);

        System.out.println("------------------------------");
    }

    // Helper method to create and add an appointment to the list
    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String mobile, String timeSlot, HealthProfessional doctor) {
        Appointment appointment = new Appointment(patientName, mobile, timeSlot, doctor);
        appointments.add(appointment);
    }

    // Prints all existing appointments or a message if none are found
    public static void printExistingAppointments(ArrayList<Appointment> appointments) {
        if (appointments.isEmpty()) {
            System.out.println("No existing appointments.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
            }
        }
    }

    // Cancels an appointment by searching for the patient’s mobile number
    public static void cancelBooking(ArrayList<Appointment> appointments, String mobile) {
        for (int i = 0; i < appointments.size(); i++) {
            if (appointments.get(i).getMobile().equals(mobile)) {
                appointments.remove(i); // Removes the first match found
                System.out.println("Appointment with mobile " + mobile + " cancelled.");
                return;
            }
        }
        System.out.println("No appointment found with mobile " + mobile + ".");
    }
}
