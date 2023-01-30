package ModelClasses;

public class Technician extends User{

    public Technician() {
    }
    private String Designation;

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public Technician(String firstName, String lastName, String email, String password, String nicNumber, String gender) {
        super(firstName, lastName, email, password, nicNumber, gender);
    }
}
