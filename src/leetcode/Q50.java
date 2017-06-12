package leetcode;

/**
 * Created by kanunso on 4/2/17.
 */
public class Q50 {

    public static void main(String[] args) {
        Q50 q50 = new Q50();

        int out = q50.power(3,10);
        System.out.println("out = " + out);
    }



    public int power(int x, int n){
        if(n==1){
            return x;
        }
        int rem=1;
        if(n%2==1){
            rem = x;
        }
        int m = n/2;
        int res = power(x,m);
        return res * res * rem;
    }
}
