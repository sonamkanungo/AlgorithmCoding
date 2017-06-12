package round2;

import java.util.PriorityQueue;

/**
 * Created by kanunso on 5/17/17.
 */
public class Q215 {


    public static void main(String[] args) {
        int [] in = {1,2,3,4,5};
        Q215 q215 = new Q215();
        System.out.println(q215.kLargest(in, 5));

    }

    public int kLargest(int [] in, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(k);

        for(int i: in){
            if(pq.size()<k){
                pq.add(i);
            }else{
                if(i>pq.peek()){
                    pq.poll();
                    pq.add(i);
                }
            }
        }
        return pq.peek();
    }
}
