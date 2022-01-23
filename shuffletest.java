/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class shuffletest {
    public static void shuffle1(int[] a){
        int N=a.length;
        for(int i=0;i<N;i++){
            int r= StdRandom.uniform(N);
            int temp=a[i];
            a[i]=a[r];
            a[r]=temp;
        }
    }
    public static void main(String[] args) {
        int M= StdIn.readInt();
        int N=StdIn.readInt();
        int []a=new int [M];
        int [][] b = new int[M][M];
        for(int j=0;j<N;j++){
            shuffle1(a);
            for (int i = 0; i < M; i++) {
                b[i][a[i]]++;//统计某数落在i位置上的次数
                a[i] = i;
            }
        }
        for(int i=0;i<M;i++){
            for(int j=0;j<M-1;j++){
                StdOut.printf("%d ",b[i][j]);
            }
            StdOut.println(b[i][M-1]);
        }

    }
}
