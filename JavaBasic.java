public class JavaBasic {
    public static int fibo(int number) {
        if (number == 2 || number == 1) {
            return 1;
        }
        if (number == 0) {
            return 0;
        }

        return fibo(number - 1) + fibo(number - 2);
    }
    public static boolean prime(int no) {
        if (no == 1) {
            return false;
        }
        if (no == 2 || no == 3) {
            return true;
        }
        for (int div = 2; div <= Math.ceil(Math.sqrt(no)); div++) {
            if (no % div == 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        // 0, 1, 1, 2, 3, 5,
        // int n = 10, first = 0, second = 1, nextNo = 0;
        // if (n <= 2) {}
        // for (int ind = 3; ind <= n; ind++) {
        //     nextNo = first + second;
        //     first = second;
        //     second = nextNo;
        // }

        // System.out.println(second);
        System.out.println(fibo(10));
        if (prime(23)) {
            System.out.println("Number 23 is a prime");
        } else {
            System.out.println("Number 23 is not a prime");
        }
    }
}
