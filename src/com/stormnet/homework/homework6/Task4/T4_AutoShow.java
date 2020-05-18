package com.stormnet.homework.homework6.Task4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class T4_AutoShow {
    public static void main(String[] args) {
        List<T4_Car> carList = new ArrayList<>();

        carList.add(new T4_Car("BMW", "P 55", 10000));
        carList.add(new T4_Car("Toyota", "L 6G", 20000));
        carList.add(new T4_Car("Audi", "X-S31", 30000));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Вас интерусует:\n" +
                "1. Информация о всех доступных машинах\n" +
                "2. Добавить машину в список покупок\n" +
                "3. Информация о выбранной машине\n" +
                "4. Купить машину\n" +
                "5. Выход\n");

        int option = 0;
        try {
            option = scanner.nextInt();
        } catch (Exception e) {
            System.err.println("Опция отсутствует.");
            return;
        }
        switch (option) {
            case (1):
                for (T4_Car c : carList) {
                    System.out.println(c.toString() + "\n");
                }
                break;
            case (2):
                System.out.println("Введите бренд автомобиля: ");
                String brand = scanner.next();
                System.out.println("Введите модель автомобиля: ");
                String model = scanner.next();
                System.out.println("Введите цену автомобиля: ");
                int price = scanner.nextInt();

                T4_Car newCar = new T4_Car(brand, model, price);
                carList.add(newCar);

                System.out.printf("Автомобиль бренда %s модели %s стимстью %d добавлен!\n\n",
                        newCar.getBrand(), newCar.getModel(), newCar.getPrice());

                break;
            case (3):
                System.out.println("Введите бренд автомобиля: ");
                String maker = scanner.next();

                boolean itsDream = false;

                for (T4_Car c : carList) {
                    if (c.getBrand().equalsIgnoreCase(maker)) {
                        System.out.println(c.toString() + "\n");
                        itsDream = true;
                    }
                }

                if (!itsDream) {
                    System.out.println("Данный бренд отсутствует на данный момент\n");
                }

                break;

            case (4):
                System.out.print("Введите бренд автомобиля, который вы желаете приобрести: ");
                String make = scanner.next();

                boolean itsMine = false;
                ListIterator<T4_Car> iter = carList.listIterator();

                while (iter.hasNext()) {
                    T4_Car c = iter.next();

                    if (c.getBrand().equalsIgnoreCase(make)) {
                        System.out.printf("Вы приобрели автомобиль \n\n",
                                c.getBrand(), c.getModel(), c.getPrice());
                        itsMine = true;

                        iter.remove();
                    }
                }

                if (!itsMine) {
                    System.out.println("Данная марка отсутствуетна данный момент\n");
                }

                break;
            case (5):
                System.out.println("Всего доброго!\n");
                return;
            default:
                System.out.println("Попробуйте еще раз");
        }
    }
}