package com.DataStructure;


import java.util.*;
class SolutionStackBalanced{
    
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            Stack<Character> stack=new Stack<Character>();
            String input=sc.next();
            //Complete the code
            //System.out.println(input);
            for(int i=0; i<input.length(); i++) {
                if(!stack.isEmpty()) {
                    switch(input.charAt(i)) {
                    case '}':
                        if(stack.peek()=='{') {
                            stack.pop();
                        }
                        break;
                    case ']':
                        if(stack.peek()=='[') {
                            stack.pop();
                        }
                        break;
                    case ')':
                        if(stack.peek()=='(') {
                            stack.pop();
                        }
                        break;
                    default:
                        stack.push(input.charAt(i));
                    }
                }else {
                    stack.push(input.charAt(i));
                }
            }
            
            System.out.println(stack.empty());
        }
        
        sc.close();
    }
}

