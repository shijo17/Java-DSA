package com.shijo;

import java.util.Scanner;

public class NestedSwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();
        switch (empID){
            case 1 -> System.out.println("Shijo Stephen");
            case 2 -> System.out.println("Stephen Daniel");
            case 3 -> {
                System.out.println("Employee 3");
                switch(department){
                    case "IT" -> System.out.println("IT DEpartment");
                    case "Management" -> System.out.println("Management");
                }
            }
            default -> System.out.println("Enter valid Info");
        }
    }
}
