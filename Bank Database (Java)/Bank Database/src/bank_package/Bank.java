package bank_package;

public class Bank {
    String location = "";
    int branchNumber = 0;
    int numEmployee = 0;
    int numClient = 0;

    public void displayInfo() {
        System.out.println("Location: " + location);
        System.out.println("Branch Number: " + branchNumber);
        System.out.println("Number of Employees: " + numEmployee);
        System.out.println("Number of Clients: " + numClient);
    }// method displayInfo
}// class Bank