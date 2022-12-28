package ConsecutivePrimeSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int biggest = 0;
        int answer = 0;
        int result = 0;
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < 1000000; i++) {
            if (isPrime(i)) primes.add(i);
        }

        for (int i = 0; i < primes.size() - 2; i++) {
            for (int j = i, cpt = 0; result < 1000000; j++, cpt++) {
                result += primes.get(j);
                if (isPrime(result) && result < 1000000 && cpt >= biggest) {
                    biggest = cpt + 1;
                    answer = result;
                }
            }
            result = 0;
        }
        System.out.println(answer);
    }

    public static boolean isPrime(int num) {
        boolean answer = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
