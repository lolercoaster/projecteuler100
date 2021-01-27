package com.projecteuler;

import java.util.Scanner;

public class projecteulerproblem3a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();

        long i = 2;

        while (a != 1) {if (a % i == 0){
            a = a/i;
            System.out.println(i);
        } else {
            ++i;
        }}
    }
}
