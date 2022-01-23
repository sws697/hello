/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;

public class Rational {
private final int numerator;
private final int denominator;
public Rational(int n,int d){
    numerator = n;
    denominator = d;
}
public Rational plus(Rational b){

}
public static int[] readInts(String name){
    In in = new In(name);
    Queue<Integer> input = new Queue<Integer>();
    while(!in.isEmpty()){
        input.enqueue(in.readInt());
    }
    int[] ints = new int[input.size()];
    int N = input.size();
    for(int i=0;i<N;i++){
        ints[i] = input.dequeue();
    }
    return ints;
}
    public static void main(String[] args) {
Stack<String> op = new Stack<String>();
Stack<Double> vals = new Stack<Double>();
while(!StdIn.isEmpty()) {
    String s = StdIn.readString();
    if (s.equals("(")) ;
    else if (s.equals("+")){
        op.push(s);
    }
    else if (s.equals("-")){
        op.push(s);
    }
    else if (s.equals("*")){
        op.push(s);
    }
    else if(s.equals("/")){
        op.push(s);
    }
    else if(s.equals(")")){
        double val
    }
}

    }
}
