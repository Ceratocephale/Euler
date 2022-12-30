package TruncatablePrimes;

public class Solution {

    public static void main(String[] args) {
        long sum = 0;
        int primes = 0;

        for(int i = 11; primes < 11; i++){
            if(isPrime(i) && truncatable(i)){
                sum += i;
                primes++;
            }
        }
        System.out.println(sum);
    }

    public static boolean truncatable(int num) {
        boolean answer = true;

        for (int i = 0, div = 10; i < Integer.toString(num).length() - 1; i++, div *= 10) {
            if (!(isPrime(num / div) && isPrime(num % div))) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static boolean isPrime(int num) {
        boolean answer = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                answer = false;
                break;
            }
        }
        return answer && num != 1;
    }

}
