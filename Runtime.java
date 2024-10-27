class Vehicle {
    public void display() {
        System.out.println("Used for locomotive purpose");
    }
}
class Bike extends Vehicle {
    public void display() {
        System.out.println("Run with two wheelers");
    }
}
class Car extends Vehicle {
    public void display() {
        System.out.println("Run with four wheelers");
    }
}
public class Runtime {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.display();
        v = new Bike();
        v.display();
        v = new Car();
        v.display();
    }
}
