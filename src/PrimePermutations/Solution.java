package PrimePermutations;

import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        boolean answer = false;
        String result = "";
        SortedSet<Integer> primes = new TreeSet<>();
        for (int i = 1001; i < 10000; i++) {
            if (isPrime(i)) primes.add(i);
        }

        int[] arrayPrimes = new int[primes.size()];
        int i = 0;
        for (int x : primes) {
            arrayPrimes[i++] = x;
        }


        for (int j = 0; j < arrayPrimes.length - 1; j++) {
            SortedSet<Integer> permutedInts = new TreeSet<>();
            permutedInts.add(arrayPrimes[j]);
            for (int k = j + 1; k < arrayPrimes.length; k++) {
                if (isPermutation(arrayPrimes[j], arrayPrimes[k])) permutedInts.add(arrayPrimes[k]);
            }
            if (permutedInts.size() >= 3) {
                int[] arr = new int[permutedInts.size()];
                int p = 0;
                for (int x : permutedInts) {
                    arr[p++] = x;
                }
                for (int a = 0; a < arr.length - 2; a++) {
                    for (int b = a + 1; b < arr.length - 1; b++) {
                        for (int c = b + 1; c < arr.length; c++) {
                            if (isSequence(arr[a], arr[b], arr[c]) && arr[a] != 1487) {
                                answer = true;
                                result = String.format("%d + %d + %d is a sequence", arr[a], arr[b], arr[c]);
                                break;
                            }
                            if (answer) break;
                        }
                        if (answer) break;
                    }
                    if (answer) break;
                }
                if (answer) break;
            }
            if (answer) break;
        }
        System.out.println(result);
    }

    public static boolean isPrime(int num) {
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static boolean isPermutation(int num1, int num2) {
        boolean isPermutation = true;
        int[] digits = new int[10];
        while (num1 != 0) {
            digits[num1 % 10]++;
            num1 /= 10;
        }
        while (num2 != 0) {
            digits[num2 % 10]--;
            num2 /= 10;
        }
        for (int i : digits) {
            if (i != 0) {
                isPermutation = false;
                break;
            }
        }
        return isPermutation;
    }

    public static boolean isSequence(int a, int b, int c) {
        return b - a == c - b;
    }
}
