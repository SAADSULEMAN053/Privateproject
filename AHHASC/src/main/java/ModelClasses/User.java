package ModelClasses;

public class User {

    private String FirstName;
    private String LastName;
    private String Email;
    private String Password;
    private String NicNumber;
    private String Gender;
    private String PhoneNo;
    public User() {
    }

    public User(String firstName, String lastName, String email, String password, String nicNumber, String gender) {
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

    public String isGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
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
