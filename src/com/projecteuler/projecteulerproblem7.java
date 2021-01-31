package com.projecteuler;

import java.util.Scanner;

public class projecteulerproblem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int counter = 0;

        for (int i = 2; counter != a; i++) {
            for (int j = 2; j > 0; ) {
                if (i % j == 0) {
                    if (i == j) {
                        System.out.println(i);
                        ++counter;
                    }
                    break;
                } else {
                    j++;
                }
            }
        }
    }
}
