package leetcode;

import java.util.Queue;

/**
 * Created by kanunso on 3/14/17.
 */
public class Q287 {

    public static void main(String[] args) {

        Q287 q287 = new Q287();
        int [] input = {1,2,3,4,5,6,7,2};
        int o = q287.findDuplicateinArray(input,7);
        System.out.println("o = " + o);

    }

    public int findDuplicateinArray(int [] input,int n){
        int i=1,j=n,mid=0;

        while (i<=j){
            mid = (input[i]+input[j])/2;
            int smaller =0;
            for(int in : input){
                if(in<mid) {
                    System.out.print("Here");
                    smaller++;
                }
            }
            System.out.println("Came out after each run Here");
            if(smaller<mid){
                i=mid;
            }else{
                j=mid;
            }
        }
        return mid;
    }

}
