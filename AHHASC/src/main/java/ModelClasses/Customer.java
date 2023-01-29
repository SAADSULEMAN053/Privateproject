package ModelClasses;

public class Customer extends User{


    public Customer() {
    }

    public Customer(String firstName, String lastName, String email, String password, String nicNumber, boolean gender) {
        super(firstName, lastName, email, password, nicNumber, gender);
    }


}
