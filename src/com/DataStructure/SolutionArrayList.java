package com.DataStructure;


import java.util.*;


public class SolutionArrayList {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int N=scanner.nextInt();
        ArrayList[] arrList=new  ArrayList[N];
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i < N; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int d=Integer.parseInt(arrRowItems[0]);
            arrList[i]=new ArrayList();
            for(int j=1; j<=d; j++) {
            	arrList[i].add(Integer.parseInt(arrRowItems[j]));
            	//arrList[i].add("AMIT");
            }
        }
        System.out.println("arrList="+arrList[0]);
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int q=scanner.nextInt();
        for(int i=0; i<q; i++) {
        	int x=scanner.nextInt();
        	int y=scanner.nextInt();
        	System.out.println("x,y"+x+","+y);
        	/*if(x>0 && x<=N) {
        		if(y <= arrList[x-1].size()) {
        			System.out.println("arrList="+arrList[x-1].get(y-1));
        		}
        		else {
        			System.out.println("ERROR!");
        		}
        	}  
        	else {
        		System.out.println("ERROR");
        	}*/
        	
        	try {
        		System.out.println("arrList="+arrList[x-1].get(y-1));
        	}
        	catch(Exception e) {
        		System.out.println("ERROR!");
        	}
        }

        scanner.close();

    }
}
