package leetcode;

/**
 * Created by kanunso on 4/6/17.
 */
public class Q70 {

    public static void main(String[] args) {
        Q70 q70 = new Q70();
        int out = q70.climbStairs(70);
        System.out.println("out = " + out);
    }

    public int climbStairs(int n){
        if(n==0){
            return 1;
        }
        if(n==-1){
            return 0;
        }
        int numberofWays = 0;
        numberofWays = climbStairs(n-1);
        numberofWays += climbStairs(n-2);
        return numberofWays;

    }
}
