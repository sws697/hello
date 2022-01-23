/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class shufflestandard {
    public static void main(String[] args) {
    int SIDES=6;
    double[] dist = new double[2*SIDES+1];
    for(int i=1;i<=SIDES;i++){
        for(int j=1;j<=SIDES;j++){
            dist[i+j]+=1.0;
        }

    }
    for(int k = 2;k<=2*SIDES;k++){
        dist[k]/=36.0;
        StdOut.println(dist[k]);
    }
    }
}
