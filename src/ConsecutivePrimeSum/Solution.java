package ConsecutivePrimeSum;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int biggest = 0;
        int answer = 0;
        List<Integer> primes = new ArrayList<>();
        for (int i = 1000; i < 1000000; i++) {
            if (isPrime(i)) primes.add(i);
        }

        for (Integer i : primes) {
            List<Integer> subprimes = new ArrayList<>();
            for (int j = 2; j < i; j++) {
                if (isPrime(j)) subprimes.add(j);
            }
            int result = 0;
            for (int j = 0; j<subprimes.size(); j++){
                for(int k = j; result < i && k < subprimes.size()-1; k++){
                    result += subprimes.get(k);
                }
                if(result == i && result > biggest){
                    biggest = result;
                    answer = i;
                }
                result = 0;
            }
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
