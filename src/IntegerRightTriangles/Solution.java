package IntegerRightTriangles;


public class Solution {
    public static void main(String[] args) {
        int biggest = 0;
        int result = 0;
        for(int i = 2; i <= 1000; i+=2){
            if(numberSolutions(i) > biggest) {
                biggest = numberSolutions(i);
                result = i;
            }
        }
        System.out.println(result);
    }

    public static int numberSolutions(int num) {
        int counter = 0;
        for (int a = 1; a < num/2; a++) {
            for (int b = 1; b < num/2; b++) {
                double c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
                if (c % 1 == 0 && (a + b + c) == num) {
                    counter++;
                }
            }
        }
        return counter/2;
    }
}
