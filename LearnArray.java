import java.util.Scanner;

class ArrayUtils {
    public int binarySearchIterative(int[] arr, int elementToFind) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == elementToFind) {
                return mid;
            } else if (arr[mid] > elementToFind) {
                high = low - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public int binarySearchRecur(int[] arr, int elementToFind, int low, int high) {
        if (low > high) {
            return -1;
        }
        
        int mid = (low + high) / 2;
        if (arr[mid] == elementToFind) {
            return mid;
        } else if (arr[mid] > elementToFind) {
            return binarySearchRecur(arr, elementToFind, low, mid - 1);
        } else {
            return binarySearchRecur(arr, elementToFind, mid + 1, high);
        }
    }
}
public class LearnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array length");
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        int x = 0;
        int brr[] = arr;
        for (int i = 0; i < arrLen; i++) {
            System.out.println("Enter array element");
            x = sc.nextInt();
            arr[i] = x;
        }
        System.out.println("Element to Find");
        int elementToFind = sc.nextInt();
        ArrayUtils arrUtil = new ArrayUtils();
        int result = arrUtil.binarySearchIterative(arr, elementToFind);
        if (result == -1) {
            System.out.println("Number not exist in the Array");
        } else {
            System.out.println("Element present in the Array position : " + result);
        }
        int recurResult = arrUtil.binarySearchRecur(arr, elementToFind, 0 , arrLen - 1);
        System.out.println("Recursion Result");
        if (recurResult == -1) {
            System.out.println("Number not exist in the Array");
        } else {
            System.out.println("Element present in the Array position : " + result);
        }
    }
}
