package Homework2;

import java.util.Scanner;

public class Task1a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input A: ");
        double a = scanner.nextDouble();

        System.out.println("Input B: ");
        double b = scanner.nextDouble();

        System.out.println("Input R: ");
        double r = scanner.nextDouble();

        double square1 = a * b;
        double square2 = Math.PI * Math.pow(r, 2);

        if (square1 < square2) {
            System.out.println("OK");

        } else {
            System.out.println("Fail");

        }

    }

}
