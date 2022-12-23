package SelfPowers;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        BigInteger result = BigInteger.ZERO;
        BigInteger[] bigIntegers = new BigInteger[1001];
        for (int i = 0; i < 1001; i++) {
            bigIntegers[i] = new BigInteger(String.format("%d", i));
            result = result.add(bigIntegers[i].pow(i));
        }
        System.out.println(result);

    }
}
