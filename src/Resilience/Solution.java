package Resilience;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Long> primes = new ArrayList<>();

    public static void main(String[] args) {
        int result = 0;
        double ratio = (double) 15499 / 94744;

        primes.add(2L);
        primes.add(3L);

        long product = primesProduct(primes);

        while (true) {
            if ((double) phiFunction(product) / (product - 1) < ratio) {
                primes.remove(primes.size() - 1);
                break;
            }
            product *= nextPrime(primes.get(primes.size() - 1));
            primes.add(nextPrime(primes.get(primes.size() - 1)));

        }

        System.out.println(primes);


    }


    public static int phiFunction(long phi) {
        int result = 0;
        for (long i = 0; i < phi; i++) {
            if (isCoprime(phi, i)) result++;
        }

        return result;
    }

    public static boolean isCoprime(long u, long v) {
        return gcd(u, v) == 1;
    }


    public static long gcd(long u, long v) {
        if (v == 0) return u;
        return gcd(v, u % v);
    }

    public static boolean isPrime(long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static long nextPrime(long n) {
        long i = n + 1;
        while (!isPrime(i)) {
            i++;
        }
        return i;
    }

    public static long primesProduct(List<Long> primes) {
        long result = 1;
        for (Long p : primes) {
            result *= p;
        }
        return result;
    }
}
