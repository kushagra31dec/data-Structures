import java.util.*;
import java.io.*;

public class searchSortedMatrix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of rows of the matrix");
        int m = scn.nextInt();
        System.out.println("Enter the number of columns of the matrix");
        int n = scn.nextInt();
        int matrix[][] = new int[m][n];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scn.nextInt();
                }
        }
        System.out.println("Enter the value of the key");
        int key = scn.nextInt();
        if(!printSearchSortedMatrix(matrix,key)) {
            System.out.println("key not found");
        }
    }

    public static boolean printSearchSortedMatrix(int matrix [][],int key) {
        int row = 0;
        int column = matrix[0].length-1;
        while(row<matrix.length && column>=0) {
            if(matrix[row][column]==key) {
                System.out.println("found key at ("+row+","+column+")");
                return true;
            }
            else if(matrix[row][column]<key) {
                row+=1;
            }
            else {
                column-=1;
            }
        }
        return false;
    }
}