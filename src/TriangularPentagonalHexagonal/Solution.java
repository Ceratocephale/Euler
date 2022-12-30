package TriangularPentagonalHexagonal;

public class Solution {

    public static void main(String[] args) {
        long number = 0;
        long result;
        boolean answer = true;
        for (long i = 286; answer; i++) {
            result = (i * (i + 1)) / 2;
            if (isPentagonal(result) && isHexagonal(result)) {
                number = result;
                answer = false;
            }
        }
        System.out.println(number);
    }

    public static boolean isPentagonal(long num) {
        double result = (Math.sqrt(24 * num + 1) + 1) / 6;
        return result % 1 == 0;
    }

    public static boolean isHexagonal(long num) {
        double result = (Math.sqrt(8 * num + 1) + 1) / 4;
        return result % 1 == 0;
    }
}
