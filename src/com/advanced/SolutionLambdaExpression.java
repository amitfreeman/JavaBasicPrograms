package com.advanced;

import java.io.*;
import java.util.*;

interface PerformOperation {
	boolean check(int a);
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	// Write your code here
	public PerformOperation isOdd() { 
		return (int num) -> num%2!=0; 
	}

	public PerformOperation isPrime() {
		return (int num) -> java.math.BigInteger.valueOf(num).isProbablePrime(1);
	}
	
	/* traditional approach */
	/*public PerformOperation isPrime() {
		return (int num) -> {
			boolean flag=true;
			for(int i=2; i<= (num/2); i++) {
				if(num%i==0) {flag=false; break;}
			}
			return flag;
		};
	}*/

	public PerformOperation isPalindrome() {
		return (int num) -> Integer.toString(num).equals(
				                      new StringBuilder(Integer.toString(num)).reverse().toString() );
	};

	
}

public  class SolutionLambdaExpression {

	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T--> 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}
