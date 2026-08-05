class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year : " + year);
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    private String fuelType;

    public Car(String brand, String model, int year, String fuelType) {
        super(brand, model, year);
        this.fuelType = fuelType;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Fuel Type: " + fuelType);
    }

    @Override
    public void start() {
        System.out.println("Car is starting with key...");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Generic", "Basic", 2000);
        Car c = new Car("Toyota", "Corolla", 2022, "Petrol");

        System.out.println("=== Vehicle ===");
        v.display();
        v.start();

        System.out.println("\n=== Car ===");
        c.display();
        c.start();
    }
}