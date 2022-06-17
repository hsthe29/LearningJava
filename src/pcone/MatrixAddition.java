package pcone;

import java.util.Scanner;

public class MatrixAddition {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter rows and columns of two array: ");
        int m = keyboard.nextInt();
        int n = keyboard.nextInt();

        int[][] A = new int[m][n];
        int[][] B = new int[m][n];
        int[][] C = new int[m][n];

        System.out.println("Enter 1-Matrix:");
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                A[i][j] = keyboard.nextInt();

        System.out.println("Enter 2-Matrix:");
        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                B[i][j] = keyboard.nextInt();

        for(int i = 0; i < m; i++)
            for(int j = 0; j < n; j++)
                C[i][j] = A[i][j] + B[i][j];

        System.out.println("Result:");

        for(int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(C[i][j] + " ");
            System.out.println();
        }

    }
}
