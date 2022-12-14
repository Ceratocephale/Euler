package MaximumPathSumII;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution {
    static int[][] tab = new int[100][100];

    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        File myFile = new File("MaximumPathSumII.txt");
        try(Scanner scan = new Scanner(myFile)) {
            while(scan.hasNextLine()) {

                String[] str = scan.nextLine().split(" ");
                for(String s: str){
                    tab[i][j] = Integer.parseInt(s);
                    j++;
                }
                i++;
                j = 0;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(largestSum(tab));
    }

    public static int largestSum(int[][] tab){
        for(int i = 98; i>=0; i--){
            for(int j = 0; j<99;j++){
                tab[i][j] = tab[i][j] + Math.max(tab[i+1][j], tab[i+1][j+1]);
            }
        }


        return tab[0][0];
    }

}