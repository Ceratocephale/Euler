package NonAbundantSums;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        boolean nonAbSum = false;
        int nonAb = 0;
        long result = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 28123; i++) {
            if (isAbundant(i)) list.add(i);
        }
        for (int i = 28123; i >= 0; i--) {
            for (Integer l : list) {
                if ((i - l) > 0 && isAbundant(i - l)) {
                    nonAbSum = true;
                    break;
                }
            }
            if (!nonAbSum) {
                result += i;
            }
            nonAbSum = false;

        }
            System.out.println(result);
        }
    public static boolean isAbundant(int n){
        int sum = 0;
        for(int i = 1; i<=n/2; i++){
            if(n%i == 0) sum+= i;
        }
        return n<sum;
    }
}
