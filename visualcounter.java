import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */
public class visualcounter {
    private final String name ;
    private int count;
    private  int cishu;
    private int a;
    private int b;
    public visualcounter(int N,int max,String id){
        a=N;
        b=max;
        name = id;
    }
    public void increment(){
        if(cishu<=a&&Math.abs(count)<=b){
            count++;
            StdOut.println(count);
        }
        else System.out.println("error");
    }
    public void decrement(){
        if(cishu<=a&&Math.abs(count)<=){
            count--;
            StdOut.println(count);
        }
        else System.out.println("error");
    }
    public static void main(String[] args) {

    }
}
