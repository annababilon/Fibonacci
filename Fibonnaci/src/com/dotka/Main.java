package com.dotka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe wyrazow ciagu");
        int length = scanner.nextInt();
        printFibonacci(length);

    }

public static void printFibonacci(int length){
        int n1 = 0;
        int n2 = 1;
        int n3;
        System.out.println(n1);
        System.out.println(n2);
        for (int i = 2; i < length; i++){
            n3 = n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }
}}
