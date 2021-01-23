package com.projecteuler;

import java.util.Scanner;

public class projecteulerproblem1a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int sumj = 0;

        for (int j = 1; j < x; ++j){
            if (j%3 == 0 || j%5 ==0) { sumj += j;
                System.out.println(j);
            }
        }
        System.out.println(sumj);
    }
}