class Animal {
    void eat() {
        System.out.println("Eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
class Cat extends Dog {
    void sound() {
        System.out.println("Meow");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
        c.bark();
        c.eat();
    }
}
