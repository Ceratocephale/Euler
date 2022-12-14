package LargestPrimeFactor;

public class Solution {
    public static void main(String[] args) {
//        long number = 600851475143l;
//        long prime = 0l;
//        boolean isPrime = false;
//        for(long i = number-1; i > 0; i--){
//            for(int j = 2; j < Math.sqrt(i); j++) {
//                if(i%j == 0) {isPrime = false; break;}
//                else isPrime = true;
//            }
//            if(isPrime && number%i == 0) {prime = i; break;}
//        }
//        System.out.println(prime);

        boolean prime = false;
        for(int i = 3, counter = 0; counter<=10000-3; i++) {
            for(int j = 2; j<=Math.sqrt(i); j++) {
                if(i%j == 0) {prime = false;break;}
                prime = true;
            }

            if(prime) {System.out.println(i); counter++;}
        }
//
   }
}
