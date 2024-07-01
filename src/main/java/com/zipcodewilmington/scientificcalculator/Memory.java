package com.zipcodewilmington.scientificcalculator;

public class Memory {
    private static double memory =0;

    public double getMemory() {
        return memory;
    }

    public double setMemory(double memory) {
        this.memory = memory;
        return memory;

    }

    public static double clearMemory(double memory){
        memory = memory*0;
        return memory;
    }

}
