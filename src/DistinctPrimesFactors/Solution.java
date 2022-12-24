package DistinctPrimesFactors;

import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        long result = 0;
        boolean answer = true;
        for (int i = 10; answer; i++) {
            if (factors(i).size() == 4) {
                if (factors(i + 1).size() == 4 && factors(i + 2).size() == 4 && factors(i + 3).size() == 4) {
                    result = i;
                    answer = false;
                }
            }
        }
        System.out.println(result);
    }

    public static SortedSet<Long> factors(long number) {
        SortedSet<Long> set = new TreeSet<>();
        long num = number;
        for (long i = 2; i <= number / 2; i++) {
            if (num % i == 0 && isPrime(i)) {
                set.add(i);
                num /= i;
                i--;
            }
        }
        return set;
    }

    public static boolean isPrime(long number) {
        boolean answer = true;
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
