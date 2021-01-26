package com.projecteuler;

public class projecteulerproblem2a {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int vcs = 0;
        int suma = 0;

        do {
            if (b % 2 == 0) {
                suma = suma + b;
            }
            vcs = a + b;
            a = b;
            b = vcs;
        } while (b <= 4000000);

        System.out.println(suma);
    }
}
