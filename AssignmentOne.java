import java.util.ArrayList;

public class AssignmentOne {
    public static void main(String[] args) {

        // Part 3 – Using classes and objects

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


        generalPractitioner1.printGeneralPractitionerDetails();
        generalPractitioner2.printGeneralPractitionerDetails();
        generalPractitioner3.printGeneralPractitionerDetails();
        cardiologist1.printCardiologistDetails();
        cardiologist2.printCardiologistDetails();
        cardiologist3.printCardiologistDetails();

        System.out.println("------------------------------");



        // Part 5 – Collection of appointments

        ArrayList<Appointment> appointments = new ArrayList<>();

        // General Practitioner Appointments
        createAppointment(appointments, "Liam Johnson", "0412 345 678", "08:00", generalPractitioner1);
        createAppointment(appointments, "Charlotte Davis", "0421 556 789", "09:30", generalPractitioner2);
        createAppointment(appointments, "Ethan Wilson", "0433 987 123", "11:00", generalPractitioner1);

        // Cardio Specialist Appointments
        createAppointment(appointments, "Isla Brown", "0404 678 912", "13:00", cardiologist1);
        createAppointment(appointments, "Mason Taylor", "0455 321 654", "14:30", cardiologist2);
        createAppointment(appointments, "Ava Martin", "0466 112 334", "16:00", cardiologist3);


    }

    public static void createAppointment(ArrayList<Appointment> appointments, String patientName, String mobile, String timeSlot, HealthProfessional doctor) {
        Appointment appointment = new Appointment(patientName, mobile, timeSlot, doctor);
        appointments.add(appointment);
    }
}
