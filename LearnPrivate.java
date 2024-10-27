class Vehicle {
   private int wheels; 
   public Vehicle() {
    wheels = 3;
   }
}
class AutoV extends Vehicle {
    public AutoV() {
        super();
    }
    public void display() {
        System.out.println("No of wheels : " + super.wheels);
    }
}
public class LearnPrivate {
    public static void main(String[] args) {
        AutoV obj = new AutoV();
        obj.display();
    }
}
