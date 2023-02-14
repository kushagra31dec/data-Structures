import java.util.*;
import java.io.*;
public class searchSortedMatrix {
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
    public static void main(String[] args) {
        int matrix[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}};
            Scanner scn = new Scanner(System.in);
            int key = scn.nextInt();
            printSearchSortedMatrix(matrix,key);
    }
}
