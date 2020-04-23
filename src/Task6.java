package Homework2;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] gearArray = new int[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                gearArray[i][j] = random.nextInt();
            }
        }

        for (int i = 0; i < gearArray.length; i++) {
            for (int j = 0; j < gearArray[i].length; j++) {
                System.out.print(gearArray[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
