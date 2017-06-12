package round2;

/**
 * Created by kanunso on 5/16/17.
 */
public class Q238 {

    public static void main(String[] args) {
        Q238 q238 = new Q238();
        int[] in = {1,2,3,4,5};
        q238.productArray(in);
    }



    public int[] productArray(int [] in){
        int[] out = new int[in.length];
        out[0] = 1;
        int p=1;
        for(int i=1; i<=in.length-1; i++){
            p=p*in[i-1];
            out[i]=p;
        }

        p=in[in.length-1];
        for(int i=in.length-2; i>=0;i--){
            out[i] = p*out[i];
            p=p*in[i];
        }
        return out;
    }
}
