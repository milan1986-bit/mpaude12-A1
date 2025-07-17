
public class HealthProfessional {

    private int id;
    private String name;
    private String information;

    public HealthProfessional() {

    }

    public HealthProfessional(int id, String name, String information) {
        this.id = id;
        this.name = name;
        this.information = information;
    }

    public void printAllDetailsOfHealthProfessional() {
        System.out.println("Doctor Id: " + id);
        System.out.println("Doctor Name: " + name);
        System.out.println("Doctor Info: " + information);
    }
}
