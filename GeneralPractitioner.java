
public class GeneralPractitioner extends HealthProfessional {
    private String specialization;

    public GeneralPractitioner() {
    }

    public GeneralPractitioner(int id, String name, String basicInformation, String specialization) {
        super(id, name, basicInformation);
        this.specialization = specialization;
    }

    public void printGeneralPractitionerDetails() {

    }
}