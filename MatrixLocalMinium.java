/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.In;

public class MatrixLocalMinium {
    public static void FindLocalMin (int[][] a) {
        int rowlo = 1;
        int rowhi = a.length-2;
        int columnlo = 1;
        int columnhi = a[0].length-2;
        int rowmid = (rowhi + rowlo)/2;
        int columnmid = (columnlo + columnhi) /2;
        while (rowlo < rowhi && columnlo < columnhi) {
            if ((rowmid-1) >= 0 && (a[rowmid][columnmid] > a[rowmid-1][columnmid])) {
                rowhi = rowmid -1;
            }
            else if ((rowmid+1)<a.length&&(a[rowmid][columnmid] > a[rowmid+1][columnmid])) {
                rowlo = rowmid + 1;
            }
            else if ((columnmid-1) >= 0 && (a[rowmid][columnmid] > a[rowmid][columnmid-1])) {
                columnhi = columnmid - 1;
            }
            else if ((columnmid+1) < a.length && (a[rowmid][columnmid] > a[rowmid][columnmid+1])) {
                columnlo = columnmid + 1;
            }
            else {
                System.out.println(rowmid+","+rowhi);
                return;
            }
            rowmid = (rowhi+rowlo)/2;
            columnmid = (columnhi+columnlo)/2;
        }
        System.out.println("Can't Find");
    }
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        In in = new In(args[1]);
    int[][] a = new int[N][N];
    for (int i = 0; i < N; i++) {
        for (int j = 0;j < N; j++) {
            a[i][j] = in.readInt();
        }
    }
    FindLocalMin(a);
    }
}
