package leetcode;

import java.util.PriorityQueue;

/**
 * Created by kanunso on 3/13/17.
 */
public class IPO {

    public static void main(String[] args) {
        
        IPO ipo = new IPO();
        
        int [] profit = {1,2,3};
        int [] capital = {0,1,1};

        
        int r = ipo.findMaximumCapital(profit, capital, 2, 0);
        System.out.println("r = " + r);

    }

    public int findMaximumCapital(int [] profit, int [] capital, Integer k, Integer w){

        int total = w;
        SortByCapital smc = new SortByCapital();
        SortByMaxProfit smp = new SortByMaxProfit();

        PriorityQueue<IPONode> sortedbyMinCapital = new PriorityQueue<IPONode>(profit.length, smc);
        PriorityQueue<IPONode> sortedbyMaxProfit = new PriorityQueue<IPONode>(profit.length, smp);

        for(int i=0; i <=profit.length-1; i++){
            IPONode ipn = new IPONode(profit[i], capital[i]);
            sortedbyMinCapital.add(ipn);
        }

        while(k>0){
            while(!sortedbyMinCapital.isEmpty() && w >= sortedbyMinCapital.peek().capital){
                sortedbyMaxProfit.add(sortedbyMinCapital.poll());
            }

            IPONode ip = sortedbyMaxProfit.poll();
            w = w-ip.capital+ip.profit;
            total = total + ip.profit;
            k--;
        }

        return total;

    }

}
