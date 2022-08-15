package com.assignment;

import java.util.Scanner;

public class AssignmentQ5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the FIRST NUMBER:");
        int num1 = in.nextInt();
        System.out.println("Enter the SECOND NUMBER:");
        int num2 = in.nextInt();
        if (num1>num2){
            System.out.println("The FIRST NUMBER is LARGEST" + " " + num1);
        }else {
            System.out.println("The SECOND NUMBER is LARGEST:" + " "+ num2 );
        }
    }
}
