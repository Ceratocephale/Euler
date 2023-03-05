package CircularPrimes;

public class Solution {

    public static void main(String[] args) {
        int circularPrimes = 0;
        for(int i = 2; i<1000000; i++){
            if(isCircularPrime(i)){
                circularPrimes++;
            }
        }
        System.out.println(circularPrimes);
    }
    public static boolean isCircularPrime(int num){
        boolean answer = true;
        String str = Integer.toString(num);
        for(int i = 0; i < str.length(); i++){
            str = str.substring(1) + str.charAt(0);
            if(!(isPrime(Integer.parseInt(str)))){
                answer = false;
                break;
            }
        }
        return answer;
    }
    public static boolean isPrime(int num){
        boolean answer = true;
        for(int i = 2; i<=Math.sqrt(num); i++){
            if(num%i == 0){
                answer = false;
                break;
            }
        }
        return answer;
    }
}
