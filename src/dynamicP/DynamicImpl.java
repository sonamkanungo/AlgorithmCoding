package dynamicP;

/**
 * Created by kanunso on 2/23/17.
 */
public class DynamicImpl {

    public static void main(String[] args) {
        DynamicImpl dynamic = new DynamicImpl();
        int [] coins = {25, 50};
        System.out.println(dynamic.coinChange(coins, 100, 0));

    }
/*

    521
    2222
    221111
    2111111
    11111111
*/



    public int coinChange(int [] coins, int balance, int i){
        if(i==coins.length-1 && balance>0){
            return 1;
        }
        if(balance==0){
            return 0;
        }

        int amountSoFar = 0;

        int numofWays = coinChange(coins, balance, i+1);

        while(amountSoFar<balance){
            balance = balance-coins[i];
            amountSoFar = amountSoFar+coins[i];
            numofWays = numofWays + coinChange(coins, balance, i+1);
        }
        return numofWays;
    }











}
