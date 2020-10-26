package com.base;

import java.math.*;
import java.util.*;


public class SolutionBigInteger {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger bn=new BigInteger(n);
        System.out.println(bn);

        if(bn.isProbablePrime(1)) {
        	System.out.println("prime");
        }
        else {
        	System.out.println("not prime");
        }
        scanner.close();
    }
}
