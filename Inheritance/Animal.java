class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Animal is making a sound.");
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Dog barks: Woof!");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Cat meows: Meow!");
    }


    public static void main(String[] args) {
        Animal a = new Animal("Generic");
        Dog d = new Dog("Tommy");
        Cat c = new Cat("Luna");

        System.out.println("=== Animal ===");
        a.display();
        a.speak();

        System.out.println("\n=== Dog ===");
        d.display();
        d.speak();

        System.out.println("\n=== Cat ===");
        c.display();
        c.speak();

        System.out.println("\n=== Polymorphism ===");
        Animal[] creatures = {a, d, c};
        for (Animal creature : creatures) {
            creature.speak();
        }
    }
}