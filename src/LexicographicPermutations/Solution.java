package LexicographicPermutations;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        List<Integer> tab = new ArrayList<>();
        for(int i = 0; i<10;i++){
            tab.add(i);
        }

        long mainresult = 0;
        long result = 0;
        int cpt = 0;
        String str = "";

        for(int i = 1; i<=10; i++){
            for(int j = 10-i; result < 1000000;cpt++){
                mainresult = result;
                result += fact(j);
            }
            str = str + tab.get(cpt-1);
            tab.remove(cpt-1);
            cpt = 0;
            result = mainresult;
        }
        System.out.println(str);
    }

    public static long fact(int n){
        long result = 1;
        for(int i = n; i>=2; i--){
            result *= i;
        }
        return result;
    }
}