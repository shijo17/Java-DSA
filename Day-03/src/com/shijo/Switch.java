package com.shijo;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "mango":
                System.out.println("King of the fruits");
                break;
            case "apple":
                System.out.println("The red Fruit ");
                break;
            case "orange":
                System.out.println("Round fruit");
                break;
            default:
                System.out.println("Please enter the valid fruit");
        }
    }
}