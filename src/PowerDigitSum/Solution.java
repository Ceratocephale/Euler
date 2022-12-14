package PowerDigitSum;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        long res = 0;
        BigInteger big = new BigInteger("2");
        for(int i = 1; i<1000; i++){
          big = big.multiply(BigInteger.valueOf(2));
        }
        String str = big.toString(10);
        for (int i = 0; i<str.length(); i++){
            res = res+str.charAt(i)-'0';
        }
        System.out.println(res);

    }
}
