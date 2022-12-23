package ReciprocalCycles;


import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        int cyclelength;
        int biggest = 0;
        int result = 0;

        for(int i = 999; i>10; i--) {
            cyclelength = length(i);
            if(cyclelength > biggest) {
                biggest = cyclelength;
                result = i;
            }
        }
        System.out.println(result);
    }

    public static int length(int num){

        SortedSet<Integer> set = new TreeSet<>();
        for(int j = 0, value = 1; j<=num; j++, value*=10){
            value %= num;
            set.add(value);
        }
        return set.size();

    }

}
