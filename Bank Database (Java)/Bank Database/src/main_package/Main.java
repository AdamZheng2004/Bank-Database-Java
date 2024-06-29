package main_package;

// Imports
import bank_package.Bank;
import employee_package.*;
import client_package.*;

public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank(1, "Victoria");
        b1.displayInfo(b1.getBranchNumber());
    }// main()
}// Class Main