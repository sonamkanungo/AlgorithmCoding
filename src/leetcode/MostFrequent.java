package leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Created by kanunso on 3/13/17.
 */
public class MostFrequent {

    public static void main(String[] args) {
        MostFrequent mostFrequent = new MostFrequent();

        int [] input1 = {3,2,1,5,6,4};
        int [] input2 = {1,1,1,2,2,3};


        int [] out = mostFrequent.kmostFrequent(input2,2);
        
        for(int s: out){
            System.out.println("s = " + s);
        }

        System.out.println();
        int o = mostFrequent.kthLargest(input1,2);
        System.out.println("o = " + o);
    }



    public int [] kmostFrequent ( int [] input, int k){
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for(int in: input){
            if(hmap.containsKey(in)){
                int c = hmap.get(in);
                c++;
                hmap.put(in, c);
            } else{
                hmap.put(in,1);
            }
        }

        Comparator<MostFrequentNode> comparator = new Comparator<MostFrequentNode>() {
            @Override
            public int compare(MostFrequentNode o1, MostFrequentNode o2) {
                return o1.count.compareTo(o2.count);
            }
        };

        PriorityQueue<MostFrequentNode> mQueue = new PriorityQueue<MostFrequentNode>(k,comparator);
        for(Integer h: hmap.keySet()){
            MostFrequentNode mn = new MostFrequentNode(h, hmap.get(h));
            if(mQueue.size()<k) {
                mQueue.add(mn);
            }else if(hmap.get(h)>=mQueue.peek().count) {
                mQueue.poll();
                mQueue.add(mn);
            }
        }
        /*
        while(!mQueue.isEmpty()){
            System.out.println("mQueue.poll() = " + mQueue.poll().number);
        }

*/
        int [] out = new int[k];
        for(int i=k-1; i>=0; i--){
            out[i] = mQueue.poll().number;
            System.out.print("out["+i+"] = " + out[i]);
        }

        return out;
    }


    public int kthLargest( int [] input, int k){

        PriorityQueue<Integer> mQueue = new PriorityQueue<Integer>(k);

        for(Integer h: input){
            if(mQueue.size()<k || h>=mQueue.peek()) {
                if(mQueue.size()==k){
                    mQueue.poll();
                }
                mQueue.add(h);
            }
        }
        return mQueue.poll();
    }





}
