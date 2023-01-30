package ModelClasses;

public class Appointment {


    private String isCompleted;
    private Customer customer= null;
    private Technician technician= null;
    private double payment = 0;

    public Appointment() {
    }

    public Appointment(String isCompleted, Customer customer, Technician technician, double payment) {
        this.isCompleted = isCompleted;
        this.customer = customer;
        this.technician = technician;
        this.payment = payment;
    }

    public String isCompleted() {
        return isCompleted;
    }

    public void setCompleted(String completed) {
        isCompleted = completed;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }
}
