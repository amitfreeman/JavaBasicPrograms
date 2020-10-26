package com.base;

import java.util.Scanner;

public class CountLineNumber {

	public static void main(String[] args) {
		 int sum=0;
		 Scanner in = new Scanner(System.in);
	        int N = in.nextInt();
	        if (in.hasNextLine()) {
	            in.nextLine();
	        }
	        for (int i = 0; i < N; i++) {
	            String row = in.nextLine();
	            String[] tokens=row.split(" ");
	            for(String token: tokens) {
	            	System.out.println("num="+token);
	            	int num = Integer.parseInt(token);
	            	if(num==i) {
	            		sum+=1;
	            	}
	            }
	        }

	        // Write an answer using System.out.println()
	        // To debug: System.err.println("Debug messages...");

	        System.out.println(sum);

	}

}
