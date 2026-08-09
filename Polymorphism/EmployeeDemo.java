class Employee {
    void work() {
        System.out.println("Employee is working");
    }

    void calculateSalary() {
        System.out.println("Calculating employee salary");
    }
}

class Developer extends Employee {
    @Override
    void work() {
        System.out.println("Developer writes code");
    }

    @Override
    void calculateSalary() {
        System.out.println("Developer salary is Rs.60000");
    }
}

class Manager extends Employee {
    @Override
    void work() {
        System.out.println("Manager manages the team");
    }

    @Override
    void calculateSalary() {
        System.out.println("Manager salary is Rs.90000");
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = {
            new Developer(),
            new Manager()
        };

        for (Employee employee : employees) {
            employee.work();
            employee.calculateSalary();
            System.out.println();
        }
    }
}