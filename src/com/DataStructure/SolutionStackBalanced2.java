package com.DataStructure;

import java.util.*;
class SolutionStackBalanced2{
	   
	private static Map<Character,Character> myMap = createMap();
	
	private static Map<Character,Character> createMap() {
	       HashMap<Character,Character> result = new HashMap<Character,Character>();
	       result.put(')','(');
	       result.put(']','[');
	       result.put('}','{');
	       result.put('>','<');
	       return Collections.unmodifiableMap(result);
	}
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			Stack<Character> stack=new Stack<Character>();
			String input=sc.next();
            //Complete the code
			//System.out.println(input);
			for(int i=0; i<input.length(); i++) {
				if(stack.isEmpty()) {
					stack.push(input.charAt(i));
					//System.out.println("Empty char="+input.charAt(i));
				}
				else {
					//System.out.println("Not Empty char="+input.charAt(i));
					if(myMap.containsKey(input.charAt(i))) {
						if(stack.peek()==myMap.get(input.charAt(i))) {
							stack.pop();
						}
						else {
							stack.push(input.charAt(i));
						}
					}
					else {
						stack.push(input.charAt(i));
					}
				}
				//System.out.println("loop end with stack= "+stack);
			}
			
			System.out.println(stack.empty());
			stack.clear();
		}
		
		sc.close();
	}
}
