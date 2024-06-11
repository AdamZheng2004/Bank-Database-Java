package main_package;

// Imports
import bank_package.Bank;
import employee_package.*;
import client_package.*;

public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.displayInfo();

        System.out.println("\n");

        Employee e1 = new Employee();
        e1.displayInfo();
        
        System.out.println("\n");
    
        Position p1 = new Position();
        p1.displayInfo();

        System.out.println("\n");
    
        Client c1 = new Client();
        c1.displayInfo();
    }// method main
}// Class Main
