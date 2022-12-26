package SubstringDivisibility;

import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public static SortedSet<String> set = new TreeSet<>();


    public static void main(String[] args) {
        long result = 0;
        permuts("0123456789", "");
        for(String s: set){
            if(substringDivisibility(s)) result += Long.parseLong(s);
        }
        System.out.println(result);

    }

    public static void permuts(String str, String ans) {
        if (str.length() == 0) {
            set.add(ans);
        } else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String ros = str.substring(0, i) + str.substring(i + 1);
                permuts(ros, ans + ch);

            }
        }
    }

    public static boolean substringDivisibility(String str) {
        int one = Integer.parseInt(str.substring(1, 4));
        int two = Integer.parseInt(str.substring(2, 5));
        int three = Integer.parseInt(str.substring(3, 6));
        int four = Integer.parseInt(str.substring(4, 7));
        int five = Integer.parseInt(str.substring(5, 8));
        int six = Integer.parseInt(str.substring(6, 9));
        int seven = Integer.parseInt(str.substring(7, 10));

        return one % 2 == 0
                && two % 3 == 0
                && three % 5 == 0
                && four % 7 == 0
                && five % 11 == 0
                && six % 13 == 0
                && seven % 17 == 0;

        // System.out.printf("%d %d %d %d %d %d %d ",one, two, three, four, five, six, seven);
    }
}



