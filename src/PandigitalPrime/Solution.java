package PandigitalPrime;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public static void main(String[] args) {
        long biggest = 0;
        String str = "";
        for (int i = 1; i < 10; i++) {
            List<String> list = new ArrayList<>();
            str += i;
            permutations(str, "", list);
            for (String s : list) {
                long l = Long.parseLong(s);
                if (isPrime(l) && l > biggest) {
                    biggest = l;
                }
            }
        }
        System.out.println(biggest);
    }

    public static void permutations(String str, String ans, List<String> list) {
        if (str.length() == 0) list.add(ans);
        else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String ros = str.substring(0, i) + str.substring(i + 1);
                permutations(ros, ans + ch, list);
            }
        }
    }

    public static boolean isPrime(long num) {
        boolean answer = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
