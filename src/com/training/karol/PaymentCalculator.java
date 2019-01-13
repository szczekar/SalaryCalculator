package com.training.karol;

public class PaymentCalculator {

    private final static double MONTLY_TAX = 1000;

    public static double nettoYearPayment(Employee employee){
        double yearNetSalary = employee.getMontlyNetSalary()*12;
        return  yearNetSalary;
    }

    public static double bruttoYearPayment(Employee employee){
       double montlyGrossSalary = (employee.getMontlyNetSalary()*5)/4;
       double yearlyGrossSalary = 12*montlyGrossSalary + 12*MONTLY_TAX;

       return  yearlyGrossSalary;
    }
}
