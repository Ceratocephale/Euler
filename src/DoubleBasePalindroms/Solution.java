package DoubleBasePalindroms;

public class Solution {

    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i < 1000000; i++) {
            if (isPalindrome(i)) result += i;
        }
        System.out.println(result);
    }

    public static boolean isPalindrome(int num) {
        boolean answer = true;
        String number = Integer.toString(num);
        String binary = Integer.toBinaryString(num);

        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
                answer = false;
                break;
            }
        }

        for (int i = 0; i < binary.length() / 2; i++) {
            if (binary.charAt(i) != binary.charAt(binary.length() - i - 1)) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}

