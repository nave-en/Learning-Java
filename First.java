public class First {
    public static void main(String[] args) {
        // System.out.println("I will get the job in Natwest");
        String fruit = "Apple";
        int unicodeValue = 0;
        for (int index = 0; index < fruit.length(); index++) {
            char chr = fruit.charAt(index);
            unicodeValue = (int) chr;
            System.out.println("Unicode value for the char : " + chr + " : " + unicodeValue);
        }
    }
}
