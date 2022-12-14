package LargeSum;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        BigInteger[] big = new BigInteger[100];
        String[] str  = new String[100];
        BigInteger bigg = BigInteger.ZERO;
        File myFile = new File("numbers.txt");
        try(Scanner scan = new Scanner(myFile)) {
            int i = 0;
            while(scan.hasNextLine()){
                str[i] = scan.nextLine();
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        for(int i = 0; i < str.length; i++) {
            big[i] = new BigInteger(str[i]);
        }
        for(int i = 0; i < big.length; i++) {

            bigg = bigg.add(big[i]);

        }

        System.out.println(bigg);
    }



    }
