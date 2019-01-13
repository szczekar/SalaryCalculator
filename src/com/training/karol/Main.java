package com.training.karol;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Employee no 1:");
        Employee employee1 = new Employee("Anna","Jurzak",3000);
        System.out.println("Yearly net salary: " + PaymentCalculator.nettoYearPayment(employee1));
        System.out.println("Yearly gross salary " + PaymentCalculator.bruttoYearPayment(employee1));
        System.out.println("----------------------------------------------");
        System.out.println("Employee no 2:");
        Employee employee2 = new Employee("Daniel","Szczepaniak",3500);
        System.out.println("Yearly net salary: " + PaymentCalculator.nettoYearPayment(employee2));
        System.out.println("Yearly gross salary " + PaymentCalculator.bruttoYearPayment(employee2));
    }
}
