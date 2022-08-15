package com.shijo;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Temperature in Celsius");
        float TempC = input.nextFloat();
        float TempF = (TempC * 9/5 + 32);
        System.out.println("The Result in Fahrenheit is :"+ " " +TempF);
    }
}
