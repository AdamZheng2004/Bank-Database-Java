package bank_package;
import java.util.HashMap;
import java.util.Map;

public class Bank {
    private static Map<Integer, String> branches = new HashMap<>();
    private Integer branchNumber;
    private String location;

    public Bank(Integer branchNumber, String location) {
        if (branches.containsKey(branchNumber)) {
            throw new IllegalArgumentException("Branch Already Exists.\n");
        }// if

        this.branchNumber = branchNumber;
        this.location = location;
        branches.put(branchNumber, location);
        System.out.println("Branch: " + branchNumber + " Located at: " + location + " Successfully Added.\n");
    }// Bank 

    public Integer getBranchNumber() {
        return branchNumber;
    }// getBranchNumber()

    public String getLocation() {
        return location;
    }// getLocation()

    public void setLocation(String location) {
        this.location = location;
    }// setLocation()

    public void displayInfo(Integer branchNumber) {
        String location = branches.get(branchNumber);
        System.out.println("Branch: " + branchNumber + " Located at: " + location + ".\n");
    }// displayInfo()
}// class Bank