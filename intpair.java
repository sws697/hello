/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class intpair {
    public static int count(int[] a) {
        int n = a.length;
        int cnt = 0;
        Arrays.sort(a);
        for (int i =0;i <n;i++)
        {
           if (BinarySearch.indexOf(a,a[i]) > i) cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {

int[] a = In.readInts(args[0]);
        StdOut.println(count(a));
    }
}
