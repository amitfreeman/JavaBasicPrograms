package com.DataStructure;
import java.util.*;

public class SolutionList {
	
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	int N = scan.nextInt();

    	List<Integer> aList=new ArrayList<Integer>();
    	for (; N-- > 0; ) {
    		aList.add(scan.nextInt());
    	}
    	//System.out.println("List= "+aList);
    	
    	scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    	int Q=scan.nextInt();
    	for(; Q-- > 0; ) {
    		//System.out.println("j="+j);
    		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    		String opr=scan.nextLine();		
    		if(opr.equals("Insert")) {
    			int x=scan.nextInt();
    			int y=scan.nextInt();
    			aList.add(x, y);
    		}
    		else if(opr.equals("Delete")) {
    			int x=scan.nextInt();
    			aList.remove(x);
    		}
    	}
    	
    	System.out.println(aList);
    	Collections.sort(aList);
    	
    	for(Integer i: aList) {
    		System.out.print(i+" ");
    	}

        scan.close();
    }
}