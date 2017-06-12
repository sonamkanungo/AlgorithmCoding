package leetcode;

/**
 * Created by kanunso on 3/23/17.
 */
public class Q91 {

    public static void main(String[] args) {

        Q91 q91 = new Q91();

        int [] input = {1,0,1};

        int out = q91.decode(input, 0);

        System.out.println("out = " + out);


    }

    public int decode(int [] input, int i){
        int out =0;
        if(i==input.length-1){
            if(input[i]!=0){
                out = 1;
            }else{
                out = 0;
            }
            return out;
        }
        if(i==input.length-2){
            if(input[i]!=0){
                if((input[i]*10 + input[i+1])<=26){
                    if(input[i+1]!=0){
                        out = 2;
                    }else{
                        out =1;
                    }
                }else{
                    if(input[i+1]!=0) {
                        out = 1;
                    } else{
                        out =0;
                    }
                }
            }
            return out;
        }
        int t1=0,t2=0;
        if(input[i]!=0){
            t1= decode(input,i+1);
        }
        if(input[i]!=0 && (input[i]*10+input[i+1])<=26){
            t2= decode(input, i+2);
        }
        out = t1+t2;
        return out;
    }

}
