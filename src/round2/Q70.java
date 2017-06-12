package round2;

import leetcode.Q7;

/**
 * Created by kanunso on 5/17/17.
 */
public class Q70 {

    public static void main(String[] args) {
        Q70 q70 = new Q70();
        System.out.println(q70.climbingStairs(70));

    }

    public int climbingStairs(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int numberofWay =0;
        numberofWay =+  climbingStairs(n-1);
        numberofWay =+ climbingStairs(n-2);
        return numberofWay;
    }
}
