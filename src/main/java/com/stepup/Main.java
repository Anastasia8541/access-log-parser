package com.stepup;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int number = new Scanner(System.in).nextInt();
        System.out.println("Введите число: ");
        int number2 = new Scanner(System.in).nextInt();
        System.out.println(number+number2);
        System.out.println(number-number2);
        System.out.println(number*number2);
        System.out.println((double)number/(double)number2);
    }
}