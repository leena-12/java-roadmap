class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        dog.sleep();

        cat.sound();
        cat.sleep();
    }
}