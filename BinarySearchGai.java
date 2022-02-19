/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearchGai {
    public static  int indexof(int[] a, int key) {
        Arrays.sort(a);
        int n = a.length;
        int lo = 0;
        int hi = n-1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a[mid] < key) lo = mid+1;
            else if (a[mid] > key) hi = mid-1;
            else if (a[mid] == key) {
                int i = mid;
                while (a[i] == key) {
                    i--;
                }
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
    int[] a = In.readInts(args[0]);
        StdOut.println(indexof(a, Integer.parseInt(args[1])));
    }
}
