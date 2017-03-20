package leetcode;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Created by kanunso on 3/11/17.
 */
public class TrappingRainWater {

    public void trappingRainWater2D(ArrayList<Integer> input){

        PriorityQueue<RainWater1> levelwiseInput = new PriorityQueue<RainWater1>();
        for(int i=0; i<=input.size()-1; i++){
            RainWater1 rainWater1 = new RainWater1(input.get(i), i);
        }

        while(!levelwiseInput.isEmpty()){
            //levelwiseInput.
        }


    }
}
