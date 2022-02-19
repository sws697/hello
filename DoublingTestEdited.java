/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.Color;

public class DoublingTestEdited {
    public static double timeTrial(int N)
    {
        int MAX = 1000000;
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
           a[i] = StdRandom.uniform(-MAX, MAX);
        }
        Stopwatch timer = new Stopwatch();
        int cnt =  ThreeSum.count(a);
        return timer.elapsedTime();
    }
    public static void main(String[] args) {
        int w = 1;
        int h = 1;
        StdDraw.setCanvasSize(w,h);
        StdDraw.setPenRadius(10);
        StdDraw.setPenColor(Color.blue);
for (int N = 250; true; N *= 2) {
    double  time = timeTrial(N);
    while ((N/100.0) > w ) {
        w *= 2;
    }
    while (time*10 > h) {
        h *= 2;
    }
    StdDraw.setCanvasSize(w,h);
    StdDraw.point(N/100.0,time*10);
}
    }
}
