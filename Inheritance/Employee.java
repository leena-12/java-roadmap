class Employee {
    protected String name;
    protected String empId;
    protected double salary;

    public Employee(String name, String empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name   : " + name);
        System.out.println("Emp ID : " + empId);
        System.out.println("Salary : " + salary);
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, String empId, double salary, String department) {
        super(name, empId, salary);
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Rahul", "E101", 60000);
        Manager m = new Manager("Neha", "M001", 90000, "IT");

        System.out.println("=== Employee ===");
        e.display();

        System.out.println("\n=== Manager ===");
        m.display();
    }
}
