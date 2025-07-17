public class Cardiologist extends HealthProfessional {
    private String expertise;

    public Cardiologist() {

        super();

    }

    public Cardiologist(int id, String name, String basicInformation, String expertise) {
        super(id, name, basicInformation);
        this.expertise = expertise;
    }

    public void printCardiologistDetails() {
        System.out.println("The doctor details are:");
        super.printAllDetailsOfHealthProfessional();
        System.out.println("HealthProfessional's Expertise: " + expertise);
        System.out.println("HealthProfessional Type: Cardiologist");
    }
}
