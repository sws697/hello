/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class interval1dimplement {
    @SuppressWarnings("checkstyle:WhitespaceAround")
    public static void main(String[] args) {
    int N = StdIn.readInt();
    double min = StdIn.readDouble();
    double max = StdIn.readDouble();
        Interval1D[] x = new Interval1D[N];
        Interval1D[] y = new Interval1D[N];
        Interval2D[] c = new Interval2D[N];
        for(int i=0;i<N;i++){
            double lo = StdRandom.uniform(min,max);
            double hi = lo+StdRandom.uniform(0.0,max-lo);
            double lo2 = StdRandom.uniform(min,max);
            double hi2 = lo2+StdRandom.uniform(0.0,max-lo2);
            x[i] = new Interval1D(lo,hi);
            y[i] = new Interval1D(lo2,hi2);
            c[i] = new Interval2D(x[i],y[i]);
            c[i].draw();

        }
        int countintersect = 0;
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                if (c[i].intersects(c[j])){
                    countintersect++;
                }
            }
        }
        System.out.println(countintersect);
    }
}
