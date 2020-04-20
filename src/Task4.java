package Homework2;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int [] mas = {21, 5, 16, 9, 7};
        boolean isSorted = false;
        int abc;

        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
                    abc = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = abc;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
