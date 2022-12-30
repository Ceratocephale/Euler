package CodedTriangleNumbers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        File file = new File("words.txt");
        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                String[] str = scan.nextLine().split("\",?\"?");
                for (String s : str) {
                    set.add(s);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        int triangleWords = 0;
        for (String s : set) {
            if (isTriangle(wordValue(s))) triangleWords++;
        }

        System.out.println(triangleWords-1);

    }

    public static int wordValue(String word) {
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            result += word.charAt(i) - 64;
        }
        return result;
    }

    public static boolean isTriangle(int num) {
        double answer = (Math.sqrt((8 * num) + 1) - 1) / 2;
        return answer % 1 == 0;
    }
}
