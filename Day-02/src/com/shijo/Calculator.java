package com.shijo;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        while (true){
            System.out.println("Enter the operator:");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter two Number:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+'){
                    count = num1 + num2;
                }
                if (op == '-'){
                    count = num1 - num2;
                }
                if (op == '*'){
                    count = num1 * num2;
                }
                if (op == '/'){
                    if (num2!= 0){
                        count = num1/ num2;
                    }
                if (op == '%'){
                    count = num1 % num2;
                }
                }
            }else if (op == 'x' || op == 'X') {
                break;
            }else {
                System.out.println("Invalid Operation !!");
            }
            System.out.println(count);
        }
    }
}
