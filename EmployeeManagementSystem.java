interface Payable {
    double getPaymentAmount();
}

abstract class Employee implements Payable {
    protected String name;
    protected int id;
    protected double baseSalary;

    public Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayEmployeeInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Base Salary: $" + baseSalary);
        System.out.println("Total Salary: $" + calculateSalary());
        System.out.println("--------------------------------");
    }
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary * 1.2;
    }

    @Override
    public double getPaymentAmount() {
        return calculateSalary();
    }
}

class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public ContractEmployee(int id, String name, double hourlyRate, int hoursWorked) {
        super(id, name, 0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public double getPaymentAmount() {
        return calculateSalary();
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        employees[0] = new FullTimeEmployee(228, "Emil", 10000.0);
        employees[1] = new ContractEmployee(229, "Kutman", 15.0, 100);

        for (Employee e : employees) {
            e.displayEmployeeInfo();
        }
    }
}

