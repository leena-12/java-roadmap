class Shape {
    public double area() {
        return 0;
    }

    public void display() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }

    @Override
    public void display() {
        System.out.println("Shape: Rectangle");
        System.out.println("Length: " + length);
        System.out.println("Breadth: " + breadth);
        System.out.println("Area: " + area());
    }

    public static void main(String[] args) {
        Shape s = new Shape();
        Rectangle r = new Rectangle(5, 3);

        System.out.println("=== Shape ===");
        s.display();
        System.out.println("Area: " + s.area());

        System.out.println("\n=== Rectangle ===");
        r.display();
    }
}