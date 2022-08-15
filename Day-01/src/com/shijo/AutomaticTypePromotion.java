package com.shijo;

public class AutomaticTypePromotion {
    public static void main(String[] args) {
        //automatic type promotion
        byte a = 50;
        byte b = 60;
        byte c = 100;
        int d = a * b /c;
        System.out.println(d);


        int num = 'A';
        System.out.println(num);

    }
}
