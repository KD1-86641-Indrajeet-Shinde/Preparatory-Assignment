class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public void empInit(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public void setSalary(double salary) {
        this.monthlySalary = salary;
    }

    public void empDisplay() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Monthly Salary: $" + monthlySalary);
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }
}

public class Q11 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();

        emp1.empInit("John", "Doe", 3000);
        emp2.empInit("Jane", "Smith", 4000);

        System.out.println("Initial Yearly Salaries:");
        System.out.println("Employee 1:");
        emp1.empDisplay();
        System.out.println("Yearly Salary: $" + emp1.getYearlySalary());

        System.out.println("\nEmployee 2:");
        emp2.empDisplay();
        System.out.println("Yearly Salary: $" + emp2.getYearlySalary());

        emp1.setSalary(emp1.getYearlySalary() / 12 * 1.10);
        emp2.setSalary(emp2.getYearlySalary() / 12 * 1.10);

        System.out.println("\nYearly Salaries After 10% Raise:");
        System.out.println("Employee 1:");
        emp1.empDisplay();
        System.out.println("Yearly Salary: $" + emp1.getYearlySalary());

        System.out.println("\nEmployee 2:");
        emp2.empDisplay();
        System.out.println("Yearly Salary: $" + emp2.getYearlySalary());
    }
}