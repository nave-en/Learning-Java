public class TwoVariable {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        System.out.println("Before swapping a and b");
        System.out.println("A : " + a);
        System.out.println("b : " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping a and b");
        System.out.println("A : " + a);
        System.out.println("b : " + b);
    }
}
