package PangiditalProducts;

import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {

    public static void main(String[] args) {
        long result = 0;
        SortedSet<Long> set = new TreeSet<>();
        for (int i = 1; i < 10000; i++) {
            for (int j = 1; j < 100; j++) {
                long temp = i * j;
                String str = "" + i + j + temp;
                if (str.length() == 9) {
                    long check = Long.parseLong(str);
                    if (isPandigital(check)) set.add(temp);
                }
            }
        }

        for (long l : set) {
            result += l;
        }
        System.out.println(result);
    }

    public static boolean isPandigital(long num) {
        int[] tab = new int[10];
        boolean answer = true;

        while (num > 0) {
            tab[(int) (num % 10)]++;
            num /= 10;
        }
        for (int i : tab) {
        }
        for (int i = 1; i < tab.length; i++) {
            if (tab[0] != 0 || tab[i] != 1) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
