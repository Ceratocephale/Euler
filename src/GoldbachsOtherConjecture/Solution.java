package GoldbachsOtherConjecture;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;

public class Solution {


    public static void main(String[] args) {
        boolean answer = true;
        long result = 0;
        for(int i = 9; answer; i+=2){
            if(!isPrime(i)) {
                if(!inConjecture(i)){
                    result = i;
                    answer = false;
                }
            }
        }
        System.out.println(result);
    }

    public static boolean inConjecture(long num){
        boolean answer = false;
        List<Long> primes = new ArrayList<>();
        for(long i = 7; i<=num; i++){
            if(isPrime(i)) primes.add(i);
        }
        for(Long l: primes){
            long temp = num - l;
            if(temp%2 == 0){
                temp /= 2;
                if(Math.sqrt(temp)%1 == 0){
                    answer = true;
                    break;
                }
            }
        }
        return answer;
    }
    public static boolean isPrime(long number){
        boolean answer = true;
        for(int i = 2; i<=Math.sqrt(number);i++){
            if(number%i == 0) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
