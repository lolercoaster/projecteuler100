package com.projecteuler;

import java.util.ArrayList;
import java.util.Scanner;

public class projecteulerproblem2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> arrayList = new ArrayList<>();

        long a = scanner.nextLong();
        long sum = 0;
        for (int i = 1; i <= a; i++) {
            if (arrayList.size() > 2) {long x = arrayList.get(i-3); long y = arrayList.get(i-2);
                arrayList.add(x+y);
            }else {long z= i; arrayList.add(z);}}
        System.out.println(arrayList);
        for (long z : arrayList) {if (z%2 == 0) sum += z;}
        System.out.println(sum);


    }
}
