package com.DataStructure;

import java.util.*;

public class SolutionSubArray {
/* SubArray is taken as Arrays.copyOfRange(Arr, from, to)
 * [from, to) , to is exclusive */
    public static void main(String[] args) {
	   
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=scan.nextInt();
        }
        scan.close();
        int negSub=0;
        // find possible subArrays
        for (int i = 0; i < a.length; i++) {  	
        	//System.out.println("Loop i "+i);
            for(int j=0; ; j++) {    	
            	   if(j+i>=a.length) {
            		   //System.out.println("break");
            		   break; 
            		}
            	   //System.out.println("subArray of "+j+" to "+(j+i));
            	   int[] subArr=Arrays.copyOfRange(a, j, j+i+1);
            	  // System.out.print("\nSubArray= ");
            	   int sum=0;
                   for(int idx=0; idx<subArr.length; idx++){
                	  // System.out.print(" "+subArr[idx]);
                	   sum+=subArr[idx];
                   }
                // System.out.println("\nsum="+sum);
                 if(sum<0) {
                 	negSub++;
                 }
            }
        }
        
        System.out.println(negSub++);
    }
}