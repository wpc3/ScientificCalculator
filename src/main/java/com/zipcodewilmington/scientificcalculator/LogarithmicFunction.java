package com.zipcodewilmington.scientificcalculator;

public class LogarithmicFunction {
    private double value;
    private double base;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public static double naturalLog(double value){
        return Math.log(value);
    }

    public static double negNaturalLog(double value){
        return Math.log( - + value);
    }




}
