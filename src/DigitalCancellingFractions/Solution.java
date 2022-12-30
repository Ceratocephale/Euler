package DigitalCancellingFractions;

import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        SortedSet<Integer> p = new TreeSet<>();
        SortedSet<Integer> q = new TreeSet<>();
        for (int i = 11; i < 100; i++) {
            for (int j = 11; j <= 100; j++) {
                if (digitsCancel(i, j) && i / j < 1) {
                    p.add(i);
                    q.add(j);
                }
            }
        }
        double resultP = 1;
        double resultQ = 1;

        for (int i : p) {
            resultP *= i;
        }

        for (int i : q) {
            resultQ *= i;
        }

        System.out.println(resultP / resultQ);
    }

    public static boolean digitsCancel(int p, int q) {
        boolean answer = false;
        int p1 = p / 10;
        int p2 = p % 10;
        int q1 = q / 10;
        int q2 = q % 10;
        double result = (double) p / q;

        if (p != q && (q2 != 0) && ((p1 == q2) || (p2 == q1))) {


            answer =
                    (double) p1 / q2 == result
                            || (double) p2 / q1 == result;
        }
        return answer;
    }
}
