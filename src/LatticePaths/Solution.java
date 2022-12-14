package LatticePaths;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {

        BigInteger big1 = new BigInteger("1");
        BigInteger big2 = new BigInteger("1");
        BigInteger big3;
        for(int i = 21; i<=40;i++){
            big1 = big1.multiply(BigInteger.valueOf(i));
        }
        for(int i = 2; i<=20;i++){
            big2 = big2.multiply(BigInteger.valueOf(i));
        }
        big3 = big1.divide(big2);

        System.out.println(big3);

    }
}
