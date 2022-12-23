package DigitFifthPowers;

import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        SortedSet<Long> set = new TreeSet<>();
        long result = 0;
        for(long i = 2; i<354294; i++) {
            if (isGood(i)) {
                set.add(i);
            }
        }
        for(long l : set) {
            result += l;
        }
        System.out.println(result);
    }

    public static boolean isGood(long num) {
        boolean good = false;
        long inter = num;
        long result = 0;
        while (inter > 0) {
            result += Math.pow(inter % 10, 5);
            inter /= 10;
        }
        return result == num;
    }
}


