package ModelClasses;

public class User {

    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;
    private String NicNumber;
    private boolean Gender;

    public User() {
    }

    public User(String firstName, String lastName, String email, String password, String nicNumber, boolean gender) {
        FirstName = firstName;
        LastName = lastName;
        Email = email;
        Password = password;
        NicNumber = nicNumber;
        Gender = gender;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getNicNumber() {
        return NicNumber;
    }

    public void setNicNumber(String nicNumber) {
        NicNumber = nicNumber;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Email='" + Email + '\'' +
                ", Password='" + Password + '\'' +
                ", NicNumber='" + NicNumber + '\'' +
                ", Gender=" + Gender +
                '}';
    }
}
