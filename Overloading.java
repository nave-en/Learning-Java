public class Overloading {
    public static int area(int length, int breadth) {
        return length * breadth;
    }
    public static int area(int length) {
        return length*length;
    }
    public static void main(String[] args) {
        System.out.println("Rectangle : " + area(5, 4));
        System.out.println("Square  : " + area(5));
    }
}
