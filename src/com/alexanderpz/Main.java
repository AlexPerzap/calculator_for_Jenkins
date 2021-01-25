package com.alexanderpz;

public class Main {

    public static void main(String[] args) {

        System.out.println(sum(3,6));
        System.out.println(subtract(30,6));
        System.out.println(multiply(3,6));
        System.out.println(divide(30,6));
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }
    public static double divide(double num1, double num2) {
        return num1 / num2;

    }
}
