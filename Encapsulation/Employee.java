public class Employee {
    private String name;
    private String empId;
    private double salary;

    public Employee(String name, String empId, double salary) {
        this.name = name;
        this.empId = empId;
        setSalary(salary); 
    }

    public String getName() {
        return name;
    }

    public String getEmpId() {
        return empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
    }

    public void setEmpId(String empId) {
        if (empId != null && !empId.trim().isEmpty()) {
            this.empId = empId;
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
        }
    }

    public void display() {
        System.out.println("Name   : " + name);
        System.out.println("Emp ID : " + empId);
        System.out.println("Salary : " + salary);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Rahul", "E101", 60000);
        e1.display();

        e1.setSalary(-1000);
        e1.setSalary(75000); 
        e1.display();
    }
}