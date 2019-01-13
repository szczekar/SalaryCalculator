package com.training.karol;

public class Employee {
    private String name;
    private String surname;
    private double montlyNetSalary;

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

    public double getMontlyNetSalary() {
        return montlyNetSalary;
    }

    public void setMontlyNetSalary(double montlyNetSalary) {
        this.montlyNetSalary = montlyNetSalary;
    }

    public Employee(String name, String surname, double montlyNetSalary) {
        this.name = name;
        this.surname = surname;
        this.montlyNetSalary = montlyNetSalary;
    }
}
