package CollatzSequence;

public class Solution {

    public static void main(String[] args) {
        int cpt = 1;
        int biggest = 0;
        int result = 0;
        for(int i = 0; i <=1000000; i++){
            for(long j = i; j>1;cpt++){
                if(j%2 == 0) j = j/2;
                else if(j%2 != 0) j = 3*j+1;

            }

            if(cpt >= biggest) {result = i; biggest = cpt;}
            cpt = 1;
        }
        System.out.println(result);
    }
}
