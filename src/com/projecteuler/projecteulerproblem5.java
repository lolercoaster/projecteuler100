package com.projecteuler;

import java.util.Scanner;

public class projecteulerproblem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (long i = 2; i > 1; ++i) {
            for (int j = 2; j <= a;) {
                if (i % j == 0) { j++;
                    if (j == a && i % j == 0) {
                        System.out.println("this is the lowest divisible " + i);
                        return;}
                } else {
                    break;}
            }
        }
    }
}
