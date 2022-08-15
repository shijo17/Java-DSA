package com.assignment;

import java.util.Scanner;

public class AssignmentQ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the FIRST NUMBER:");
        int num1 = in.nextInt();
        System.out.println("Enter the SECOND NUMBER:");
        int num2 = in.nextInt();
        System.out.println("Enter the OPERATOR:");
        char op = in.next().trim().charAt(0);
        int ans = 0;
        if (op == '+'){
             ans = num1 + num2;
        }
        if (op == '-'){
             ans = num1 - num2;
        }
        if (op == '*'){
             ans = num1 * num2;
        }
        if (op == '/'){
             ans = num1/num2;
        }
        System.out.println(ans);
    }
}
