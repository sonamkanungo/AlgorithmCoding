package leetcode;

/**
 * Created by kanunso on 3/13/17.
 */
public class IPONode{

    public Integer profit;

    public Integer capital;


    public IPONode(Integer p, Integer c){
        this.profit = p;
        this.capital = c;
    }


    public Integer getProfit() {
        return profit;
    }

    public void setProfit(Integer profit) {
        this.profit = profit;
    }

    public Integer getCapital() {
        return capital;
    }

    public void setCapital(Integer capital) {
        this.capital = capital;
    }

}
