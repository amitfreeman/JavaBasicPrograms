package com.numberFormat;

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        Locale loc=new Locale.Builder()
        		.setLanguage("en")
        		.setRegion("IN")
        		.build();
        scanner.close();
        
        // Write your code here.
        NumberFormat usN=NumberFormat.getCurrencyInstance(Locale.US);
        String us=usN.format(payment);
        NumberFormat indiaN=NumberFormat.getCurrencyInstance(loc);
        String india=indiaN.format(payment);
        NumberFormat chinaN=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=chinaN.format(payment);
        NumberFormat franceN=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=franceN.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
