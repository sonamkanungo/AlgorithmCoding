package round2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by kanunso on 5/17/17.
 */
public class Q1 {

    public static void main(String[] args) {
        int [] in = {2,7,11,23};
        Q1 q1 = new Q1();
        for(Integer i : q1.twoSum(in,9)){
            System.out.println("i = " + i);
        }
        

    }

    public int[] twoSum(int [] in, int t){
        int [] out = new int [2];
        HashSet<Integer> set = new HashSet<>();
        int k=0;
        for(int i=0; i<=in.length-1; i++){
            set.add(t-in[i]);
            if(set.contains(in[i])){
                out[k]= i;
                k++;
            }
        }
        return out;
    }
}
