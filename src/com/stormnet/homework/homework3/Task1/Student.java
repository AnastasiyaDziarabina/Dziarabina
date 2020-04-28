package com.stormnet.homework.homework3.Task1;

import java.util.ArrayList;

public class Student {

    private String name;
    private String surname;
    private String dateOfBirth;
    private int course;

    public Student(String name, String surname, String dateOfBirth, int course) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public static void printStudents(ArrayList<Student> students, int course) {
        for (Student student : students) {
            if (student.course == course) {

                System.out.printf("Student %s %s studying on %d course \n", student.getName(), student.getSurname(), student.getCourse());
            }
        }
    }
}