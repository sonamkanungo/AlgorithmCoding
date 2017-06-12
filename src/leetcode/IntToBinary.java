package leetcode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by kanunso on 5/2/17.
 */
public class IntToBinary {

    public static void main(String[] args) {
        IntToBinary intToBinary = new IntToBinary();
        Stack<Integer> o = new Stack<>();
        intToBinary.intToBin(1023, o);
        while(!o.isEmpty()){
            System.out.print(o.pop()+"");
        }

    }

    public void intToBin(int i, Stack<Integer> out ){
        if(i==1){
            out.add(1);
            return;
        }
        int rem = i%2;
        if(rem==1){
            out.add(1);
        }else{
            out.add(0);
        }
        intToBin(i/2,out);
    }
}
