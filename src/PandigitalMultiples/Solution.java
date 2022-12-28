package PandigitalMultiples;

public class Solution {

    public static void main(String[] args) {
        long biggest = 0;
        String result = "";

        for (int i = 1; i < 100000; i++) {
            for (int j = 1; result.length() < 9; j++) {
                result += i * j;
            }
            long num = Long.parseLong(result);
            if (result.length() == 9 && isPandigital(num) && num > biggest) {
                biggest = num;
            }
            result = "";
        }
        System.out.println(biggest);
    }


    public static boolean isPandigital(long num) {
        int[] tab = new int[10];
        boolean answer = true;

        while (num > 0) {
            tab[(int) num % 10]++;
            num /= 10;
        }
        for (int i : tab) {
        }
        for (int i = 1; i < tab.length; i++) {
            if (tab[0] != 0 || tab[i] != 1) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
