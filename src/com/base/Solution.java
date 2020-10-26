package com.base;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	 Scanner in = new Scanner(System.in);
    	 String s1=in.next();
    	 String s2=in.next();
    	 in.close();
    	 
    	 BigInteger b1=new BigInteger(s1);
    	 BigInteger b2=new BigInteger(s2);
    	 System.out.println(b1.add(b2)+"\n"+b1.multiply(b2));
    }
}