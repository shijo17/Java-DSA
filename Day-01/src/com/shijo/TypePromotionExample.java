package com.shijo;

public class TypePromotionExample {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'd';
        short s = 1024;
        int i = 4454;
        float f = 23.24f;
        double d = 0.123343;
        double result = (f * b) + (i / c) - (d * s);
        // float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d * s));
        System.out.println(result);

    }
}
