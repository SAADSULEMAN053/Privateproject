package Database;

import ModelClasses.Appointment;
import ModelClasses.Customer;
import ModelClasses.Technician;

import java.sql.*;

public class DatabaseFunctions {


   private static Connection DbConnection=null;
   private static final String URL="jdbc:mysql://localhost:3306/homeappliances";
   private static final String Username = "root";
   private static final String Password = "P@ssWord123";



   public static boolean makeConnection() {
      try {
         DbConnection = DriverManager.getConnection(URL,Username,Password);

      } catch (SQLException e) {
         System.out.println("Error! Could not connect to Db: " + e);
      }
      return true;
   }

   public static boolean saveToDb(Customer customer) {

      PreparedStatement queryStatement = null;

      try {
         queryStatement = DbConnection.prepareStatement("""
                    insert into customer (LastName, FirstName, Email, Pass,Phone,Gender,nic)
                    values (?,?,?,?,?,?,?);""");

         queryStatement.setString(1, customer.getLastName());
         queryStatement.setString(2, customer.getFirstName());
         queryStatement.setString(3, customer.getEmail());
         queryStatement.setString(4, customer.getPassword());
         queryStatement.setString(5, customer.getPhoneNo());
         queryStatement.setString(6, customer.isGender());
         queryStatement.setString(7,customer.getNicNumber() );
         queryStatement.executeUpdate();
         return true;

      } catch (SQLException e) {
         System.out.println("Error! Could not run query: " + e);
         return false;
      }

   }

   public static boolean saveToDb(Technician technician) {

      PreparedStatement queryStatement = null;

      try {
         queryStatement = DbConnection.prepareStatement("""
                    insert into customer (LastName, FirstName, Email, Pass,Phone,Gender,Designation,nic)
                    values (?,?,?,?,?,?,?,?);""");

         queryStatement.setString(1, technician.getLastName());
         queryStatement.setString(2, technician.getFirstName());
         queryStatement.setString(3, technician.getEmail());
         queryStatement.setString(4, technician.getPassword());
         queryStatement.setString(5, technician.getPhoneNo());
         queryStatement.setString(6, technician.isGender());
         queryStatement.setString(7, technician.getDesignation());
         queryStatement.setString(8, technician.getNicNumber());
         queryStatement.executeUpdate();
         return true;

      } catch (SQLException e) {
         System.out.println("Error! Could not run query: " + e);
         return false;
      }

   }
   public static boolean saveToDb(Appointment appointment) {

      PreparedStatement queryStatement = null;

      try {
         queryStatement = DbConnection.prepareStatement("""
                    insert into customer (technician,customer, PaymentStatus)
                    values (?,?,?,?,?,?,?,?);""");

         queryStatement.setString(1, appointment.getTechnician().getNicNumber());
         queryStatement.setString(2, appointment.getCustomer().getNicNumber());
         queryStatement.setString(3, appointment.isCompleted());
         queryStatement.executeUpdate();
         return true;

      } catch (SQLException e) {
         System.out.println("Error! Could not run query: " + e);
         return false;
      }

   }

   public static ResultSet getAllCustomers() {

      ResultSet allDataRs = null;
      PreparedStatement queryStatement = null;

      try {
         queryStatement = DbConnection.prepareStatement("Select * from customer;");
         allDataRs = queryStatement.executeQuery();

      } catch (SQLException e) {
         System.out.println("Error in getting ids: " + e);
      }

      return allDataRs;
   }
}
