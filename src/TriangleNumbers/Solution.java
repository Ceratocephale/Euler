package TriangleNumbers;

public class Solution {
    public static void main(String[] args) {
        long i = 0;
        long result;
        long sum;
        int factors = 0;

        while(true){
            sum = (i*(i+1))/2;

            for(int j = 1; j <= Math.sqrt(sum); j++){
                if(sum%j==0)//{

            //        if (sum / i == i)
                        factors++;
                 //   else
                //       factors = factors + 2;
        //        }
            }
            if(factors > 250) {result = sum;break;}

            factors = 0;
            i++;
        }
        System.out.println(result);

    }
}
