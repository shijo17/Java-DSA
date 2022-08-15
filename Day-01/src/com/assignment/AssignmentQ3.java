package com.assignment;

import java.util.Scanner;

public class AssignmentQ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the PRINCIPAL BALANCE:");
        float P = in.nextFloat();
        System.out.println("Enter the ANNUAL INTEREST RATE:");
        float R = in.nextFloat();
        System.out.println("Enter the TIME");
        float T = in.nextFloat();
        float SI = (P*R*T)/100;
        System.out.println("The required SIMPLE INTEREST will be:" + " "+ SI);

    }
}
