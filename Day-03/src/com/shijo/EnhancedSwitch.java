package com.shijo;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {



                Scanner in = new Scanner(System.in);
                String fruit = in.next();

            switch (fruit) {
            case "mango" -> System.out.println("King of the fruits");
            case "apple" -> System.out.println("The red Fruit ");
            case "orange" -> System.out.println("Round fruit");
            default -> System.out.println("Please enter the valid fruit");
            }

          }
    }


