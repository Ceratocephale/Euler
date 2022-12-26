package PentagonNumbers;

import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        boolean answer = false;
        long result = 0;
        SortedSet<Long> set = new TreeSet<>();
        for (int i = 1; !answer; i++) {
            long pent = (i * (3 * i - 1)) / 2;

            for (long l : set) {
                if (isPentagonal(l + pent) && isPentagonal(Math.abs(pent - l))) {
                    answer = true;
                    result = Math.abs(pent - l);
                    break;
                }
            }
            set.add(pent);
        }
        System.out.println(result);
    }

    public static boolean isPentagonal(long num) {
        double result = (Math.sqrt(24 * num + 1) + 1) / 6;
        return result % 1 == 0;
    }
}
