package com.projecteuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class projecteulerproblem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = 0;
        long b = 0;
        long c = scanner.nextLong();
        long d = 0;

        String reverse = "";
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Long> arrayList1 = new ArrayList<>();
        for (int i = 1; i <= c; i++){
            for(int j = 1; j <= c; j++){
                a= i*j;
                d = a;
                while (a != 0) {
                    b = a % 10;
                    a = a / 10;
                    arrayList.add(String.valueOf(b));
                    b = 0;
                    if (a == 0) {
                        for (String x : arrayList) {
                            reverse += x;
                        }
                        if (reverse.equals(String.valueOf(d)) && d > 9){
                            arrayList1.add(d);
                        }
                        arrayList.clear();
                        reverse = "";
                    }
                }
            }
        }

        Collections.sort(arrayList1);
        System.out.println(arrayList1);
        System.out.println(arrayList1.get(arrayList1.size()-1));
    }
}
