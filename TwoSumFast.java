/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class TwoSumFast {

    public static int count(int[] a) {
        Arrays.sort(a);
        int n = a.length;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (binarysearch(a, -a[i]) > i) {
                cnt++;
            }
        }
        return cnt;

    }
    public static  int binarysearch(int[] a, int key)
    {
        int lo = 0;
        int high = a.length-1;
        while (high >= lo) {
            int mid = (lo+high)/2;
            if (key > a[mid]) lo = mid+1;
            else if (key < a[mid]) high = mid-1;
            else return mid;
        }
        return -1;
    }
    public static void main (String[] args) {
        int[] a = In.readInts(args[0]);
        StdOut.println(count(a));
    }
}
