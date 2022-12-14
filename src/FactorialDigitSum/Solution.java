package FactorialDigitSum;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        int result = 0;
        BigInteger big1 = new BigInteger("1");
        for(int i = 1; i<=100;i++){
            big1 = big1.multiply(BigInteger.valueOf(i));
        }
        String str = big1.toString();
        for(int i = 0; i<str.length();i++){
            result = result+(str.charAt(i)-'0');
        }
        System.out.println(result);
    }
}
