package DigitFactorials;

public class Solution {
    public static void main(String[] args) {
        long result = 0;
        for(long i = 0; i<3000000; i++){
            if(i == sumFactorials(i)) result+= i;
        }
        System.out.println(result-3);
    }
    public static long sumFactorials(long num){
        long result = 0;
        for(int i = 0; num>0;i++){
            result += factorial(num%10);
            num /= 10;
        }
        return result;
    }

    public static long factorial(long num){
        long result = 1;
        for(long i = num; i>1; i--){
            result*=i;
        }
        return result;
    }
}
