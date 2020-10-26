package com.DataStructure;

import java.util.*;
public class SolutionDeque {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int max=0;
        Set<Integer> set=new HashSet<Integer>(); 

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addFirst(num);
            set.add(num);
            
            if(deque.size()==m) {
            	if(set.size() > max) { max=set.size(); }
            	
            	int first=deque.removeFirst();
            	
            	if(!deque.contains(first)) { set.remove(first); }
            }
            
        }
                   
        in.close();
        System.out.println(max);
    }
}



