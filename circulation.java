/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class circulation {
    public static void main(String[] args) {
        if (args[0].length() == args[1].length()){
       String s = args[0]+args[0];
       if (s.contains(args[1])){
           StdOut.println("true");
       }
       else StdOut.println("false");
        }
        else StdOut.println("false");
    }
}
