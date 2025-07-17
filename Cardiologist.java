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

    }
}
