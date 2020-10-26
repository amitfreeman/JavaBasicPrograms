package com.string;
import java.util.Scanner;

public class SolutionSubStr {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        java.util.SortedSet<String> sub=new java.util.TreeSet<String>();

        int len = s.length();
        for(int idx=0; idx<=len-k; idx++) {
        	sub.add(s.substring(idx, idx+k));
        }
        
        smallest=sub.first();
        largest=sub.last();
        
        return smallest + "\n" + largest;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
