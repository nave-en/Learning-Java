class Employee {
    String name;
    String company;
    Address address;
    public Employee(String name, String company, Address address) {
        this.name = name;
        this.company = company;
        this.address = address;
    }
    public void display() {
        System.out.println("Employee details : ");
        System.out.println("name  : " + this.name);
        System.out.println("company : " + this.company);
        address.displayAddressDetails();
    }
}
class Address {
    int doorNo;
    String streetName, City;
    public Address(int doorNo, String streetName, String City) {
        this.doorNo = doorNo;
        this.streetName = streetName;
        this.City = City;
    }
    public void displayAddressDetails() {
        System.out.println("Door No : " + this.doorNo);
        System.out.println("Street Name : " + this.streetName);
        System.out.println("City : " + this.City);
    }
}
public class Aggregation {
    public static void main(String[] args) {
        Address address1 = new Address(007, "Boyas Garden", "Chennai");
        Address address2 = new Address(117, "Boyas Garden", "Chennai");
        Employee emp1 = new Employee("Super Star", "NatWest", address1);
        Employee emp2 = new Employee("Super Star 2", "Google", address2);
        emp1.display();
        emp2.display();
    }    
}
