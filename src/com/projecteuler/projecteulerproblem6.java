package com.projecteuler;

import java.util.Scanner;

public class projecteulerproblem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int sumsqrsum = 0;
        int sum = 0;
        int sqrsum = 0;
        int dif = 0;

        for ( int i = 1;i <= a; i++) {
            sumsqrsum += i*i;
            sum += i;
            sqrsum = sum*sum;
            dif = sqrsum - sumsqrsum;
        }
        System.out.println(sumsqrsum);
        System.out.println(sum);
        System.out.println(sqrsum);
        System.out.println(dif);
    }
}
