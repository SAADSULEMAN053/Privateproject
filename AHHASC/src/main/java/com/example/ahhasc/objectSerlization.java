package com.example.ahhasc;

import ModelClasses.Customer;

import java.io.*;

public class objectSerlization {
    public static Customer customer= null;


    static ObjectOutputStream os1 ;


    public static void serialize() throws IOException {
        File file = new File("src/main/java/Files/Customer1.ser");
        os1 = new ObjectOutputStream(new FileOutputStream(file));
        os1.writeObject(customer);
        os1.close();
    }
    public objectSerlization() throws IOException {
    }
}
