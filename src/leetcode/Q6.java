package leetcode;

import java.util.ArrayList;

/**
 * Created by kanunso on 4/9/17.
 */
public class Q6 {


    public static void main(String[] args) {
        Q6 q6 = new Q6();
        String in = "PAYPALISHIRING";
        String o = q6.zigzagConvertion(in, 6);
        System.out.println("o = " + o);
    }

    public String zigzagConvertion(String input, int n) {
        String[] sArray = input.split("");
        //String[] sout = new String[input.length()];
        boolean goingDown = true;
        ArrayList<StringBuffer> sbA = new ArrayList<>();
        for(int j=0; j<=n-1; j++){
            sbA.add(new StringBuffer());
        }
        int i=0;
        while(i<=input.length()-1){
            for(int idx =0; idx<=n-1 && i<=input.length()-1; idx++){
                sbA.add(sbA.get(idx).append(sArray[i]));
                i++;
            }
            for(int idx=n-2; idx>=1 && i<=input.length()-1; idx--){
                sbA.add(sbA.get(idx).append(sArray[i]));
                i++;
            }
        }
        StringBuffer sout = new StringBuffer();
        for(int j=0; j<=n-1; j++){
            sout.append(sbA.get(j));
        }
        return sout.toString();




    }
}
