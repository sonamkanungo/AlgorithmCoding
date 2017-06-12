package leetcode;

/**
 * Created by kanunso on 4/9/17.
 */
public class Q7 {

    public static void main(String[] args) {

        Q7 q7 = new Q7();
        int o = q7.reverseInteger(-10000);
        System.out.println("o = " + o);

    }

    public int reverseInteger(int n){
        char [] sin = Integer.toString(n).toCharArray();
        int i=0;
        if(sin[0]=='-'){
            i++;
        }
        int j=sin.length-1;
        while(i<j){
            char t = sin[i];
            sin[i] = sin[j];
            sin[j] = t;
            i++;
            j--;
        }
        String out = new String();
        out = out.concat(new String(sin));
        int o = Integer.parseInt(out);
        return o;
    }
}
