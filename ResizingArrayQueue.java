/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ResizingArrayQueue<Item> implements Iterable<Item> {
    private final int INIT_CAPACITY = 8;
    private Item[] a;
    private int head;
    private int tail;
    private int N;
    public ResizingArrayQueue(){
        a = (Item[]) new Object[INIT_CAPACITY];
        head = 0;
        tail = 0;
        N = 0;
    }
    public boolean isempty(){
        return N==0;
    }
    public int size(){
        return N;
    }
    public  void enqueue(Item item){
        if (N==a.length) resize(2*a.length);
        a[tail++] = item;
        if (tail == a.length) tail = 0;
        N++;
    }
    public Item dequeue(){
        if (this.isempty()) throw new NoSuchElementException("Queue underflow");
        int t = head;
        Item temp = a[head++];
        a[t] = null;
        if(N>0&&N==a.length/4) resize(a.length/2);
        if (head==a.length) head = 0;
        N--;
        return temp;
    }
    public void resize(int max){
        assert max>=N;
        Item[] temp = (Item[]) new Object[max];
        for(int i=0;i<N;i++){
            temp[i] = a[(head+i)%a.length];//这里巧妙地使第head个变成了第一个被添加进temp数组的元素
        }
        a = temp;
    }
    public Iterator<Item> iterator(){
        return new ReverseArrayIterator();
    }
    private class ReverseArrayIterator implements Iterator<Item>{
    private int i = 0;
    public boolean hasNext(){
        return i<N;
    }
        public void remove()      { throw new UnsupportedOperationException();  }
    public Item next(){
        if(!hasNext()) throw new NoSuchElementException();
        Item t = a[(head+i)%a.length];
        i++;
        return t;
    }
    }//一个嵌套类
    public void main(String args[]){
    ResizingArrayQueue<String> jack = new ResizingArrayQueue<String>();
    while(!StdIn.isEmpty()){
        String jean = StdIn.readString();
        if(jean!="-") jack.enqueue(jean);
        else if (jack.isempty()) StdOut.print(jack.dequeue()+" ");

    }
    StdOut.println("("+jack.size()+"left on queue)");
    }
}
