package com.assignment;

import java.util.Scanner;

public class AssignmentQ1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the NUMBER:");
        int num = in.nextInt();

        if (num%2 == 0){
            System.out.println("The entered number is EVEN");
        }else {
            System.out.println("The entered number is ODD");
        }
    }
}
