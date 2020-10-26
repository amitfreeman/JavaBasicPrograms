package com.DataStructure;
import java.util.*;

public class Solution {
	
	   public static int bitsSet(BitSet b) {
		   int count=0;
		   for(int i=0; i<b.length(); i++) {
			      if(b.get(i)) {
				     count++;
			      }
			   }
		   return count;
	   }
	 
        public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int n=in.nextInt();
          int m=in.nextInt();
          BitSet b1=new BitSet(n);
          BitSet b2=new BitSet(n);
          int set=0, index=0;
          in.nextLine();
          for(;m>0; m--) {
        	  String[] opr=in.nextLine().split(" ");
        	  switch(opr[0]) {
        	  	case "AND":
        	  		   set=Integer.parseInt(opr[1]);
        	  		   if(set==1) { b1.and(b2); }
        	  		   else {b2.and(b1);}
        	  		break;
        	  	case "OR":
     	  		      set=Integer.parseInt(opr[1]);
     	  		      if(set==1) { b1.or(b2); }
     	  		      else {b2.or(b1);}
        	  		break;
        	  	case "XOR":
   	  		          set=Integer.parseInt(opr[1]);
   	  		          if(set==1) { b1.xor(b2); }
   	  		          else {b2.xor(b1);}
        	  		break;
        	  	case "FLIP":
        	  		  set=Integer.parseInt(opr[1]);
        	  		  index=Integer.parseInt(opr[2]);
        	  		  if(set==1) { b1.flip(index); }
        	  		  else { b2.flip(index); }
        	  		break;
        	  	case "SET":
      	  		      set=Integer.parseInt(opr[1]);
      	  		      index=Integer.parseInt(opr[2]);
      	  		      if(set==1) { b1.set(index); }
      	  		      else { b2.set(index); }
        	  		break;
        	  	default: 
        	  		System.out.println("wrong input");
        	  }//end switch
        	  System.out.println(bitsSet(b1)+" "+bitsSet(b2));;
          }//end for
          
          /*BitSet b3=new BitSet(5);
          b3.set(3);
          b3.set(4);
          System.out.println("b3="+b3+", length="+b3.size());*/
          
          in.close();
        }
}



