package com.DataStructure;

import java.util.*;
import java.io.*;

class SolutionMap{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		Map<String, Integer> phoneBook=new HashMap<String, Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
			phoneBook.put(name, phone);
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			String out=null;
			if( phoneBook.containsKey(s) ) {
				out=s+"="+phoneBook.get(s); 
			}
			else {
				out="Not found";
			}
			System.out.println(out);
		}
		in.close();
	}
}



