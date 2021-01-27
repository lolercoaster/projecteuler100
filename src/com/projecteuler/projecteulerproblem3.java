package com.projecteuler;

import java.util.ArrayList;
import java.util.Scanner;

public class projecteulerproblem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> arrayList = new ArrayList<>();
        ArrayList<Long> arrayList1 = new ArrayList<>();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        long a = scanner.nextLong();

        for (long i = 1;i <= a; i++) {if( i != 1 ){
            arrayList.add(i);}}


        for (long x: arrayList) {
            if (x < a && a % x == 0) {
                arrayList1.add(x);
            }
        }

        long resultado = a;

        for (long y: arrayList1) {
            while (resultado%y == 0) { resultado = resultado/y;
                arrayList2.add(y);
            }
            if (resultado != 1)System.out.println(resultado);
        }

        System.out.println(arrayList);
        System.out.println(arrayList1);
        System.out.println(arrayList2);
    }
}
