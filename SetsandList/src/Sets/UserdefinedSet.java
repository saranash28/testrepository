package Sets;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class UserdefinedSet{	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Set<Employee> employeeSet = new HashSet<>();

        System.out.println("Enter details of 10 employees:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Employee " + i + " details:");
            System.out.print("Emp ID: ");
            int empId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Phone: ");
            String phone = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Date of Birth (DOB): ");
            String dob = scanner.nextLine();

            System.out.print("Date of Joining (DOJ): ");
            String doj = scanner.nextLine();

            System.out.print("Email: ");
            String eMail = scanner.nextLine();

            System.out.print("Gender: ");
            String gender = scanner.nextLine();

            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character left by nextDouble()

            // Create an employee object and add it to the set
            Employee employee = new Employee(empId, name, phone, address, dob, doj, eMail, gender, salary);
            employeeSet.add(employee);
            break;
        }

        // Print the employee details stored in the set
        System.out.println("Employee details in the set:");
        for (Employee employee : employeeSet) {
            System.out.println(employee);
        }
	}

}
class Employee {
    private int empId;
    private String name;
    private String phone;
    private String address;
    private String dob;
    private String doj;
    private String eMail;
    private String gender;
    private double salary;

    // Constructor to initialize the employee details
    public Employee(int empId, String name, String phone, String address, String dob, String doj, String eMail, String gender, double salary) {
        this.empId = empId;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.dob = dob;
        this.doj = doj;
        this.eMail = eMail;
        this.gender = gender;
        this.salary = salary;
    }

    // Getters and setters (omitted for brevity)

    // Override the hashCode() and equals() methods to ensure uniqueness in the Set
    @Override
    public int hashCode() {
        return empId;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return empId == other.empId;
    }

    // Override toString() to display employee details (optional, for printing the set)
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + ", phone=" + phone + ", address=" + address + ", dob=" + dob
                + ", doj=" + doj + ", eMail=" + eMail + ", gender=" + gender + ", salary=" + salary + "]";
    }
}
