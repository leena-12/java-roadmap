public class Employee {
    String name;
    double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    double annualSalary() {
        return monthlySalary * 12;
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Annual Salary: " + annualSalary());
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("leena", 90000);
        e1.showDetails();
    }
}