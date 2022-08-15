package com.assignment;

import java.util.Scanner;

public class AssignmentQ6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the currency in RUPEES:");
        float inr = in.nextFloat();
        double usd = inr * 0.0125562291;
        System.out.println("The amount of RUPEES in USD is:" + " "+usd);
    }
}
