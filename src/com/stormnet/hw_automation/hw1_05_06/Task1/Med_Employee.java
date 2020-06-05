package com.stormnet.hw_automation.hw1_05_06.Task1;

public class Med_Employee {
    private String name, surname, position, department, experience;

    public Med_Employee(String name, String surname, String position, String department, String experience) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.department = department;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public String getExperience() {
        return experience;
    }
}