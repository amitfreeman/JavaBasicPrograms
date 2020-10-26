package com.exception;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc=new Scanner(System.in);
    	try {
        	int x=sc.nextInt();   
        	int y=sc.nextInt(); 
        	System.out.println(x/y);
    	}
    	catch(Exception e) {
    		System.out.println(e);
    	}
        finally {
        	sc.close();
        }
    }
}