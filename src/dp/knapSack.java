package dp;

/**
 * Created by kanunso on 3/26/17.
 */
public class KnapSack {

    public static void main(String[] args) {

        int [] capacity = {4,2,1};

        int [] value = {4,6,2};

        int balance = 4;

        KnapSack knapSack = new KnapSack();

        int out = knapSack.knapsack(capacity, value, balance, 0);

        System.out.println("out = " + out);

    }


    public int knapsack(int [] capacity, int [] value, int balance, int index){
        if(balance < capacity[index]){
            return 0;
        }
        if(index==capacity.length-1 && balance>=capacity[index]){
            return value[index];
        }
        int v1 = knapsack(capacity, value, balance, index+1);
        int v2 = knapsack(capacity,value, balance-capacity[index],index+1) + value[index];
        return Math.max(v1, v2);
    }
}
