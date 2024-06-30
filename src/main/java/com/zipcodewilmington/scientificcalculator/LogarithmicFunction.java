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

    public static double baseLog(double value, double base){
        return Math.log(value) / Math.log(base);
    }

    public static double naturaLog(double value){
        return Math.log(value);
    }

    public static double negNaturalLog(double value){
        return Math.pow(10,value);
    }

    public static double negBaseLog(double base, double value){
        return Math.pow(base, value);
    }



}
