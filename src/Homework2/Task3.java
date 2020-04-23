package Homework2;

import java.util.Arrays;

public class Task3 {

    public static void main(String[] args) {

        double[] array = {-1, - 8, -4, -7, -5, 1, 8, 9, 6};
        double sum = 0;
        double res = 1;
        double min = 0;
        double max = 0;;

        Arrays.sort(array);
        max = array[array.length - 1];
        min = array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {
                sum += array[i];
            }
            if (array[i] > min && array[i] < max) {

                res *= array[i];
            }
        }
        System.out.println(sum);
        System.out.println(res);
    }
}
