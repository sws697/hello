/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class HelloWorld {

    public static void main(String[] args)
    {
        int N = StdIn.readInt();
        StdRandom.setSeed(3002030);
        double [] a= new double[13];
        for(int i=0;i<N;i++){
            int b=StdRandom.uniform(1,7);
            int d=StdRandom.uniform(1,7);
            a[b+d]+=1.0;
        }
        for(int i=2;i<=12;i++)
        {
            a[i]/=N;
            StdOut.printf("%f\n",a[i]);
        }

    }
}
