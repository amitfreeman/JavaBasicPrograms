package com.string;
import java.util.Scanner;

public class SolutionAnagram {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    	char cha[], chb[];
         cha=a.toLowerCase().toCharArray();
         chb=b.toLowerCase().toCharArray();
         
         java.util.Arrays.sort(cha);
         java.util.Arrays.sort(chb);
    	
    	return java.util.Arrays.equals(cha, chb);
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}


