package com.shijo;

import java.util.Scanner;

public class WeekdaysWeekends {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
//        switch (day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekdays");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekends");
//                break;
//        }

        switch(day){
            case 1, 2, 3,4,5 -> System.out.println("weekdays");
            case 6,7 -> System.out.println("weekends");
        }
    }
}
