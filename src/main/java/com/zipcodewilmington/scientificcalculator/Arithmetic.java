package com.zipcodewilmington.scientificcalculator;

public class Arithmetic {

    public static double addition(double x, double y) {
        x = x + y;
        return x;
    }

    public static double subtraction(double x, double y) {
        x = x - y;
        return x;
    }

    public static double multiplication(double x, double y) {
        x = x * y;
        return x;
    }

    public static double division(double x, double y) {
        x = x / y;
        return x;

    }

    public static double power(double x, double y) {
        x = Math.pow(x, y);
        return x;
    }

    public static double squareRoot(double x) {
        x = Math.sqrt(x);
        return x;
    }

    public static double inverse(double x) {
        x = 1/x;
        return x;
    }

    public static double posAndNeg(double x) {
        x = -1 * x;
        return x;


    }

    public static double sin(double x) {
        x = Math.sin(x);
        return x;


    }

    public static double cosine(double x) {
        x = Math.cos(x);
        return x;


    }

    public static double tangent(double x) {
        x = Math.tan(x);
        return x;


    }

    public static double inverseSin(double x) {
        x = 1/Math.sin(x);
        return x;


    }

    public static double inverseCosine(double x) {
        x = 1/Math.cos(x);
        return x;


    }

    public static double inverseTangent(double x) {
        x = 1/Math.tan(x);
        return x;


    }

    public static double square(double x) {
        x = x * x;
        return x;


    }

}


