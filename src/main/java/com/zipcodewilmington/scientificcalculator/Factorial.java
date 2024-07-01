package com.zipcodewilmington.scientificcalculator;

public class Factorial {

    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    //WHOLE NUMBERS ONLY PLEAAAASE!
    public static double getFactorialOfNumbers(double value) {
        double sum = 1;

        double floorValue = Math.floor(value);
        for (double i = floorValue; i > 0; i--) {
            sum = sum * i;
        }
        return sum;
    }

//code to attempt to work with decimal numbers
//    public static double getFactorialofNumbers(double value){
//        double sum = 1;
//
//        double absoluteValue = Math.abs(value);
//        double decimal = absoluteValue - Math.floor(value);
//            for (double i=Math.floor(absoluteValue); i >decimal; i--){
//
//                if (value <1){
//                    sum = absoluteValue + decimal;
//                    return sum = sum * (value + i);
//                }
//                sum = sum * (i + decimal);
//            }
//
//        return sum;
//    }


}

