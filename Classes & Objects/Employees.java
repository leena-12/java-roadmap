public class Employees {
    String name;
    double monthlySalary;

    public Employees(String name, double monthlySalary) {
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
        Employees e1 = new Employees("leenaa", 90000);
        e1.showDetails();
    }
}