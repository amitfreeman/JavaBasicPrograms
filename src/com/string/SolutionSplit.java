package com.string;
import java.util.*;

public class SolutionSplit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
       // String regex = " |(!)|(,)|(?)|(.)|(_)|(')|(@)";
        String regex="[!,?._'@\\s]+";
        String result[];
        
        result=s.split(regex);    
        System.out.println(result.length);
        for(String str:result) {
        	System.out.println(str);
        }
        
        scan.close();
    }
}

