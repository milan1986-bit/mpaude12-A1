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


    }
}
