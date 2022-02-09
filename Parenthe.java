/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;


public class Parenthe {
    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<Character>();
        for(int i= 0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }
            if(s.charAt(i)=='['){
                stack.push('[');
            }
            if(s.charAt(i)=='{') stack.push('{');
            if(s.charAt(i)==')'){
                if (stack.isEmpty()) return false;
                if (stack.pop()!='(') return false;
            }
            else if(s.charAt(i)==']'){
                if (stack.isEmpty()) return false;
                if (stack.pop()!='[') return false;
            }
            else if(s.charAt(i)=='}'){
                if (stack.isEmpty()) return false;
                if (stack.pop()!='{') return false;
            }
        }
        return  stack.isEmpty();

    }
    public static void main(String[] args) {
        String s = new String();
    if(!StdIn.isEmpty()) s = StdIn.readLine().trim();
       StdOut.println(isBalanced(s));
    }
}
