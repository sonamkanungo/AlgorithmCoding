package round2;

import java.util.ArrayList;

/**
 * Created by kanunso on 5/18/17.
 */
public class Q93 {

    public static void main(String[] args) {

        Q93 q93 = new Q93();
        String ip = "25525511135";
        ArrayList<String> out = new ArrayList<>();
        out = q93.restoreIP(ip,3,-1);
        for(String o: out){
            System.out.println("o = " + o);
        }
    }

    public ArrayList<String> restoreIP(String s, int n, int dIndex){
        ArrayList<String> out = new ArrayList<>();
        if(n==0){
            if(validIP(s)){
                out.add(s);
            }
            return out;
        }
        for(int i=1; i<=3; i++){
            int d = dIndex+i+1;
            String pre = s.substring(0,d);
            String post = s.substring(d, s.length());
            String ip = pre.concat(".").concat(post);
            out.addAll(restoreIP(ip, n-1, d));
        }
        return out;
    }

    public boolean validIP(String ip){
        boolean flag=false;
        String [] ipA = ip.split("\\.");
        for(String i : ipA){
            Integer ii = Integer.valueOf(i);
            if(ii>=0 && ii <=255){
                flag=true;
            }else{
                flag=false;
                break;
            }
        }
        return flag;
    }
}
