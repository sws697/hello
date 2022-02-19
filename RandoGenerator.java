/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandoGenerator {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for (int i =0; i<n;i++) {
            a[i] = StdRandom.uniform(-100000,100000);
            StdOut.println(a[i]);
        }



    }
}
