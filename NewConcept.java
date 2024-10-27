class Friends {
    String name, college;
    static int objectCount = 0;
    public Friends(String name, String college) {
        this.name = name;
        this.college = college;
        objectCount += 1;
    }

    public void display() {
        System.out.println("Friend name : " + name + " college : " + college);
        // System.out.println(objectCount);
        display2(this);
    }
    static void display2(Friends obj) {
        System.out.println("name : " + obj.name);
        System.out.println("Friends object count : " + objectCount);
    }
    public void display3() {
        System.out.println(this);
    }
}
public class NewConcept {
    public static void main(String[] args) {
        Friends friend1 = new Friends("SJV", "CEG");
        Friends friend2 = new Friends("Keerthi", "CEG");
        friend1.display();
        friend2.display();
        System.out.println("Accessing the static variable outside class : " + Friends.objectCount);
        Friends.display2(friend2);
        friend2.display3();
        System.out.println("Current reference Id : " + friend2);
    }
}
