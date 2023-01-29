package ModelClasses;

public class Technician extends User{

    public Technician() {
    }

    public Technician(String firstName, String lastName, String email, String password, String nicNumber, boolean gender) {
        super(firstName, lastName, email, password, nicNumber, gender);
    }
}
