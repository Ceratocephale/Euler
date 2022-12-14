package ThousandDigitsFibonacciNumber;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        boolean answer = false;
        BigInteger num = new BigInteger("1");
        BigInteger num2 = new BigInteger("1");
        BigInteger num3 = new BigInteger("1");

        int result = 0;
        int i = 0;

        while(!answer) {
            num = num2.add(num3);
            num3 = num2;
            num2 = num;


            if (num.toString().length() >= 1000) {
                answer = true;
                result = i;}


            i++;
        }
        System.out.println(result+3);



    }
}
