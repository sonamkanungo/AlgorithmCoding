package leetcode;

/**
 * Created by kanunso on 4/3/17.
 */
public class Q69 {

    public static void main(String[] args) {
        Q69 q69 = new Q69();
        int out = q69.sqrt(81,1,81);
        System.out.println("out = " + out);
    }


    public int sqrt(int x, int s, int e){
        if(x==1){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int mid = (s+e)/2;
        if(mid*mid==x){
            return mid;
        }

        if(mid*mid>x){
            e = mid;
        }else{
            s=mid;
        }

        return sqrt(x,s,e);
    }
}

