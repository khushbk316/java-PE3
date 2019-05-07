package com.stackroute.pe3;

import java.util.Scanner;

public class matrixAddition {
    public static void main(String ar[]) {
        int row, column, i, k, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no of rows");
        row = scanner.nextInt();
        System.out.println("enter no of columns");
        column = scanner.nextInt();
        int[][] matrix1 = new int[column][row];
        int[][] matrix2 = new int[column][row];
        int[][] matrix3 = new int[column][row];
        System.out.println("enter the values of matrix1");
        for (i = 0; i < column; i++) {
            for (j = 0; j < row; j++)
                matrix1[i][j] = scanner.nextInt();
        }
        System.out.println("enter the values of matrix2");
        for (i = 0; i < column; i++) {
            for (j = 0; j < row; j++)
                matrix2[i][j] = scanner.nextInt();
        }
        System.out.println("sum of the matrix1 and matrix2 is");
        for (i = 0; i < column; i++) {
            System.out.print("\n");
            for (j = 0; j < row; j++) {
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print("   "+matrix3[i][j]);
            }
        }
    }
}



