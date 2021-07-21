package com.company;

import java.util.Scanner;

public class Main {

    public static boolean checkAge(int age) {
        if (14 < age && age <19) {
            return true;
        }
        return false;
    }

    public static void Q1() {
        Scanner input = new Scanner(System.in);
        int age, hours, count = 0;
        for (int i=0; i<492; i++) {
            System.out.println("Enter age of listener:");
            age = input.nextInt();
            System.out.println("Enter hours of listening:");
            hours = input.nextInt();
            if (checkAge(age) && hours > 3) {
                count++;
            }
        }
        System.out.println("Total listeners age 15-18 more the 3 hours: "+count);
    }

    public static int chkCouponNum(int years, int shopping) {
        int sum = 0;
        if (years > 3 && shopping > 1200) {
            if (years < 8) {
                sum = 50*years;
            } else {
                sum = 100*years;
            }
        }
        return sum;
    }

    public static void Q2() {
        Scanner input = new Scanner(System.in);
        int years, shopping, sum, count = 0, totalSum = 0;
        for (int i=0; i<5000; i++) {
            System.out.println("Enter years of membership:");
            years = input.nextInt();
            System.out.println("Enter amount of monthly shopping:");
            shopping = input.nextInt();
            sum = chkCouponNum(years, shopping);
            if (sum != 0) {
                count++;
                totalSum += sum;
            }
        }
        System.out.println("Total members entitled to get coupons: "+count);
        System.out.println("Total amount of coupons: "+totalSum);
    }

    public static boolean chkMonthYear(int month, int year) {
        if (year == 2009) {
            if (0 > month && month <7) {
                return true;
            }
        }
        return false;
    }

    public static void Q3() {
        Scanner input = new Scanner(System.in);
        int month, year, countBoy = 0, countGirl = 0;
        String gender;
        for (int i=0; i<1000; i++) {
            System.out.println("Enter month of birth:");
            month = input.nextInt();
            System.out.println("Enter year of birth:");
            year = input.nextInt();
            System.out.println("Enter gender of baby(boy/girl):");
            gender = input.next();
            if (chkMonthYear(month, year)) {
                if (gender.equals("boy")) {
                    countBoy++;
                } else {
                    countGirl++;
                }
            }
        }
        System.out.println("Total boys born in the time frame: "+countBoy);
        System.out.println("Total girls born in the time frame: "+countGirl);
    }

    public static int chkSpeed(int age, int years, int speed) {
        if (age < 24 && years < 2) {
            speed -= 10;
        }
        return speed;
    }

    public static void Q4() {
        Scanner input = new Scanner(System.in);
        int age, years, maxSpeed, realSpeed, speed, count = 0;
        for (int i=0; i<500; i++) {
            System.out.println("Enter age of driver:");
            age = input.nextInt();
            System.out.println("Enter years of license:");
            years = input.nextInt();
            System.out.println("Enter max speed of road:");
            maxSpeed = input.nextInt();
            System.out.println("Enter drive speed in the road:");
            realSpeed = input.nextInt();
            speed = chkSpeed(age, years, maxSpeed);
            System.out.println("Maximom speed allowed: "+speed);
            if (realSpeed <= speed) {
                count++;
            }
        }
        System.out.println("Total drivers under speed limit: "+count);
    }

    public static void main(String[] args) {
        Q1();
        Q2();
        Q3();
        Q4();
    }
}
