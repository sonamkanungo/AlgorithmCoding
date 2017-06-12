package round2;

/**
 * Created by kanunso on 5/17/17.
 */
public class Q191 {

    public static void main(String[] args) {

        Q191 q191 = new Q191();

        System.out.println(q191.hammingWeight(7));

    }
    public int hammingWeight(int n){
        int count=0;
        int mask=1;
        while(n!=0){
            if((n & mask) ==1){
                count++;
            }
            n= n>>1;
        }
        return count;
    }
}
