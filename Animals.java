class Animals {
    void eat() {
        System.out.println("Animals eats");
    }
}

class Dog extends Animals {
    void bark() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}