package ModelClasses;

import java.io.Serializable;

public class Customer extends User implements Serializable {


    public Customer() {
    }

    public Customer(String firstName, String lastName, String email, String password, String nicNumber, String gender) {
        super(firstName, lastName, email, password, nicNumber, gender);
    }


}
