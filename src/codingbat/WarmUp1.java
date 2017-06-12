package codingbat;

/**
 * Created by kanunso on 3/30/17.
 */
public class WarmUp1 {

    public static void main(String[] args) {

        WarmUp1 warmUp1 = new WarmUp1();

        String s1 = warmUp1.missingChar("Kitten",1);
        System.out.println("s1 = " + s1);
    }

    public String missingChar(String str, int n) {
        char [] cStr = str.toCharArray();
        char [] out = new char[cStr.length-1];
        int j=0;
        for(int i=0; i<=cStr.length-1; i++){
            if(i==n){
                continue;
            }
            out[j] = cStr[i];
            j++;
        }
        return new String(out);
    }
}
