package leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by kanunso on 3/25/17.
 */
public class Q312 {

    public static void main(String[] args) {
        Q312 q312 = new Q312();
        int [] input = {3,1,5,8};

        int out = q312.maxCoins(input);
        System.out.println("out = " + out);
    }



    public int maxCoins(int [] nums){
        if(nums.length==1){
            return nums[0];
        }
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        int out = 0;
        for(int i=0; i<=nums.length-1; i++){
            int b=1, a=1;
            if(i!=0)
                b = nums[i-1];
            if(i!=nums.length-1)
                a = nums[i+1];
            int mul = b * nums[i] * a;
            int [] im = arrayExcept(nums,i);
            out = maxCoins(im);
            maxQ.offer(out+mul);

        }
        return maxQ.remove();

    }


    public int [] arrayExcept(int [] input, int i){
        int [] output = new int[input.length-1];
        int k=0;
        for(int j=0; j<=input.length-1; j++){
            if(j!=i){
                output[k] = input[j];
                k++;
            }
        }
        return output;
    }

}
