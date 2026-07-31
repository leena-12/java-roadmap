public class Car {
    String color;
    String model;
    int year;

    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println(color + " " + model + " (" + year + ")");
    }

    void drive() {
        System.out.println("Car is driving...");
    }

    public static void main(String[] args) {
        Car c1 = new Car("black", "BMW", 2020);
        c1.display();
        c1.drive();
    }
}