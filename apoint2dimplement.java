/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class apoint2dimplement {
    public static void main(String[] args) {
    int N = StdIn.readInt();
    double x[]=new double[N];
    double y[]=new double[N];
    StdRandom.setSeed(343434);
        Point2D point[]= new Point2D[N];
        for(int i=0;i<N;i++){
            x[i]= StdRandom.uniform(-1.0,1.0);
            y[i]=StdRandom.uniform(-1.0,1.0);
            point[i]=new Point2D(x[i],y[i]);
        }
        double min=point[0].distanceTo(point[1]);
        for(int i=0;i<N-1;i++){
            for(int j=i+1;j<N;j++){
                double m;
                m=point[i].distanceTo(point[j]);
                if(m<min){
                    min=m;
                }
            }
        }
        System.out.println(min);


    }
}
