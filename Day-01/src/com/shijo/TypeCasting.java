package com.shijo;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Automatic Type COnversion - Here the inteeer value is converted to float automatically.
        float num = input.nextFloat();
        System.out.println(num);

        //typecasting
        int num1 = (int)(input.nextFloat());
        System.out.println(num1);

        //Automatic Type Promotion in Expressions
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);

    }
}
