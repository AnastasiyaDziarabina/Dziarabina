package Homework2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input N1: ");
        int rows = scanner.nextInt();

        System.out.println("Input N2: ");
        int columns = scanner.nextInt();

        int k = 0;
        int[][] twoDim = new int[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                twoDim[i][j] = k;
                k++;

                if (twoDim[i][j] % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}

