package leetcode;

import java.util.PriorityQueue;

/**
 * Created by kanunso on 5/8/17.
 */
public class Q215 {


    public static void main(String[] args) {
        int [] in = {3,2,1,5,6,4};
        Q215 q215 = new Q215();
        int o = q215.kLargestInArray(in,2);
        System.out.println("o = " + o);

    }

    public int kLargestInArray(int [] in, int k){
        PriorityQueue<Integer> kheap = new PriorityQueue<>(k);
        for(Integer i: in){
            if(kheap.size()<k){
                kheap.add(i);
            }else{
                if(i>kheap.peek()){
                    kheap.remove();
                    kheap.add(i);
                }
            }
        }

        return kheap.peek();
    }



}
