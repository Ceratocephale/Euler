package EvenFibonacciNumbers;

public class Solution {
    public static void main(String[] args) {
        int result = 0;
        for(int i = 1, j = 1, mid = 0; i < 4000000;) {
            mid = i;
            i += j;
            j = mid;
            if(i%2 == 0) result = result + i;
        }
        System.out.println(result);
    }
}
