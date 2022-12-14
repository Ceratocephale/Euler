package NamesScores;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {

        SortedSet<String>  set = new TreeSet();
        File myFile = new File("names.txt");
        try (Scanner scan = new Scanner(myFile)) {
            while(scan.hasNextLine()) {
                String[] str = scan.nextLine().split("\",?\"?");

                for(String s: str) {
                    set.add(s);
                    set.remove("");
                }
            }
            long result = 0;
            int i = 1;
            for(String s: set) {
                result += worth(s)*i;
                i++;
            }
            System.out.println(result);



        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }



    }
    public static int worth(String s) {
        int worth = 0;

        for(int i = 0; i<s.length();i++){
            worth += s.charAt(i)-64;
        }

        return worth;
    }


}
