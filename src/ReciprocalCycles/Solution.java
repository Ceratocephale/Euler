package ReciprocalCycles;

import java.math.BigDecimal;
import java.math.MathContext;

public class Solution {
    public static void main(String[] args) {
        MathContext m = new MathContext(1000);
        BigDecimal one = new BigDecimal("1");
        int answer = 0;
        for(int i = 2; i<1000;i++){
            BigDecimal two = new BigDecimal(Integer.toString(i));
            String str = one.divide(two, m).toString();
            System.out.println(str);
            if(cycleLength(str) > answer) answer = cycleLength(str);
        }

    }
    public static int cycleLength(String str) {
        String sub = str.substring(2,str.length()-1);



        return 1;
    }
}
