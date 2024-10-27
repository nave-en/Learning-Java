import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int row = sc.nextInt();
        System.out.println("Enter the number of cols");
        int col = sc.nextInt();
        int MatA[][] = new int[row][col];
        for (int rowInd = 0; rowInd < row; rowInd++) {
            for (int colInd = 0; colInd < col; colInd++) {
                System.out.println("Enter the array element");
                MatA[rowInd][colInd] = sc.nextInt();
            }
        }

        System.out.println("Second Matrix Element");
        int MatB[][] = new int[row][col];
        for (int rowInd = 0; rowInd < row; rowInd++) {
            for (int colInd = 0; colInd < col; colInd++) {
                System.out.println("Enter the array element");
                MatB[rowInd][colInd] = sc.nextInt();
            }
        }
        int res[][] = new int[row][col];
        for (int rowInd = 0; rowInd < row; rowInd++) {
            for (int colInd = 0; colInd < col; colInd++) {
                res[rowInd][colInd] = MatA[rowInd][colInd] + MatB[rowInd][colInd];
            }
        }

        System.out.println("After Matrix Addition");
        for (int rowInd = 0; rowInd < row; rowInd++) {
            for (int colInd = 0; colInd < col; colInd++) {
                System.out.print(res[rowInd][colInd] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
