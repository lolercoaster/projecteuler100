package com.projecteuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class projecteulerproblem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = 3;
        int c = 5;
        int d = a/b;
        int e = a/c;

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= d; ++i){
            arrayList.add(i*b);
        }
        for (int j= 1; j <= e; ++j){if(a > (j*c) && !arrayList.contains(j*c))
            arrayList.add(j*c);
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);

        int sum = 0;

        for (int k : arrayList) { sum += k;
            System.out.println(k);}

        System.out.println(sum);
    }
}
