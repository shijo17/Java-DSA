package com.shijo;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the Second number:");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of two numbers is:" + sum);


    }
}
