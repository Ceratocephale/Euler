package DistinctPowers;

import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) {
        SortedSet<Double> set = new TreeSet<>();
        for (int i = 2; i < 101; i++) {
            for(int j = 2; j<101; j++){
                 set.add(Math.pow(i,j));
            }
        }
        System.out.println(set.size());
    }
}
