import java.util.*;
import java.io.*;

public class spiralMatrix {
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
        printSpiralMatrix(matrix);
    }

    public static void printSpiralMatrix(int matrix [][]) {
        int startRow=0;
        int endRow=matrix.length-1;
        int startColumn=0;
        int endColumn=matrix[0].length-1;
        while(startRow<=endRow && startColumn<=endColumn) {
            //top
            for (int j=startColumn;j<=endColumn;j++) {
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for (int i=startRow+1;i<=endRow;i++) {
                System.out.print(matrix[i][endColumn]+" ");
            }
            //bottom
            for (int j=endColumn-1;j>=startColumn;j--) {
                if(startRow==endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for (int i=endRow-1;i>=startRow+1;i--) {
                if(startColumn==endColumn) {
                    break;
                }
                System.out.print(matrix[i][startColumn]+" ");
            }
            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }
    }
}
