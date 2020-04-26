package com.stormnet.homework.homework3.Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList();
        studentList.add(new Student("Ivan", "Ivanov", "01.01.2001", 1));
        studentList.add(new Student("Petya", "Petrov", "03.05.2001", 2));
        studentList.add(new Student("Vasya", "Sidorov", "12.10.2000", 1));
        studentList.add(new Student("Alexandra", "Kozlova", "20.03.2000", 3));

        Student.printStudents(studentList, 1);
    }

}