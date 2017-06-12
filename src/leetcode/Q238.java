package leetcode;

/**
 * Created by kanunso on 4/5/17.
 */
public class Q238 {

    public static void main(String[] args) {
        Q238 q238 = new Q238();

        int [] in = {2,3,5,7};
        int [] out = q238.productofArrayExceptSelf(in);
        for(int o:out){
            System.out.print(o+", ");
        }
     }


    public int [] productofArrayExceptSelf(int [] in){
        int [] out = new int[in.length];
        out[0] = 1;
        for(int i=1; i<=in.length-1; i++){
            out[i] = out[i-1] * in[i-1];
        }
        int p=1;
        for(int i=in.length-1; i>=0; i--){
            out[i] = p*out[i];
            p = p*in[i];
        }
        return out;
    }
}
