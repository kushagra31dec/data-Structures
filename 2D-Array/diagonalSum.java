import java.util.*;
import java.io.*;
public class diagonalSum {
    public static void printDiagonalSum(int matrix [][]) {
        int sum=0;
        for (int i=0;i<matrix.length;i++) {
            sum+=matrix[i][i];
            if(i!=matrix.length-1-i)
            sum+=matrix[i][matrix.length-1-i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns of the matrix");
        int m = scn.nextInt();

        int matrix[][] = new int[m][m];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < m; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = scn.nextInt();
                }
        }
        printDiagonalSum(matrix);
    }
}