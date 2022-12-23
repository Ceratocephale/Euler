package NumberSpiralDiagonal;

public class Solution {
    public static void main(String[] args) {
        int inter = 1;
        long result = 1;
        for(int i  = 2; i<1001; i+=2){
            inter += i;
            result = result + inter;
            System.out.printf("inter is %d and result is %d\n", inter, result);
            inter += i;
            result = result + inter;
            System.out.printf("inter is %d and result is %d\n", inter, result);
            inter += i;
            result = result + inter;
            System.out.printf("inter is %d and result is %d\n", inter, result);
            inter += i;
            result = result + inter;
            System.out.printf("inter is %d and result is %d\n", inter, result);
        }
        System.out.println(result);
    }
}

