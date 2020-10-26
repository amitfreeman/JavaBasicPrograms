package com.bigInteger;


import java.math.*;
import java.util.*;

public class SolutionPrime {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    	System.out.println("Enter number:");
        String n = scanner.nextLine();
        BigInteger bn=new BigInteger(n);
        //System.out.println(bn);
        if(bn.isProbablePrime(1)) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
        
        //math operation
        String s1=scanner.next();
        String s2=scanner.next();
        
        BigInteger b1=new BigInteger(s1);
        BigInteger b2=new BigInteger(s2);
        System.out.println(b1.add(b2)+"\n"+b1.multiply(b2));
        scanner.close();
    }
}
