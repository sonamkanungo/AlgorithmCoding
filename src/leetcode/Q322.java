package leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * Created by kanunso on 3/26/17.
 */
public class Q322 {

    public static void main(String[] args) {

        Q322 q322 = new Q322();
        int balance = 26;
        int [] coins = {2,5};
        HashMap<Integer, Integer> memo = new HashMap<Integer, Integer>();
        int out = q322.minCoin(coins,balance,memo);
        System.out.println("out = " + out);
    }

    public int minCoin(int [] coins, int balance, HashMap<Integer, Integer> memo){
        if(balance==0){
            memo.put(0,0);
            return 0;
        }
        PriorityQueue<Integer> numCoins = new PriorityQueue<Integer>();
        int out =0;
        for(int i=0; i<=balance-1; i++){
            if(memo.containsKey(i)){
                out = memo.get(i);
            }else {
                out = minCoin(coins, i, memo);
            }
            for(int j=0; j<=coins.length-1; j++){
                    if (i + coins[j] == balance){
                        numCoins.add(out + 1);
                    } else{
                        numCoins.add(10000);
                    }
                }
            }
        int res = numCoins.peek();
        memo.put(balance, res);
        return res;
    }


}
