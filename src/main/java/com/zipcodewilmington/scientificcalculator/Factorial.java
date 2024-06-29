package com.zipcodewilmington.scientificcalculator;

public class Factorial {

    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public static double getFactorialofNumbers(double value){
        double sum = 0;
        if (value <=0){
            System.out.println("Need a positive value");
        } else {
            for (double i=value; value >=1; value--){
                sum = sum * value;
            }
        }
        return sum;
    }
}
