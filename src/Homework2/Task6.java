package Homework2;

import java.util.Random;

public class Task6 {

    public static void main(String[] args) {

        Random random = new Random();

        int[][] gearArray = new int[8][];
        int num;

        for (int i = 0; i < gearArray.length; i++) {

            int size = 1 + (int) (Math.random() * 8);
            gearArray[i] = new int[size];
        }

        for (int i = 0; i < gearArray.length; i++) {
            for (int j = 0; j < gearArray[i].length; j++) {
                int bound = 0;
                num = random.nextInt();
                gearArray[i][j] = num;
            }

        }

        for (int i = 0; i < gearArray.length; i++) ;
        {
            int i = 0;
            for (int j = 0; j < gearArray[i].length; j++) System.out.print(gearArray[i][j] + " ");
            System.out.println();

        }

    }

}
