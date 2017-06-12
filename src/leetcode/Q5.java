package leetcode;

/**
 * Created by kanunso on 4/9/17.
 */
public class Q5 {
    int maxL = Integer.MIN_VALUE;
    int max=0, min=0;

    public static void main(String[] args) {
        Q5 q5 = new Q5();
        String s = "edcbabcde";
        String o = q5.longestPalindrom(s);
        System.out.println("o = " + o);
    }

    public String longestPalindrom(String s){
        char [] sArray = s.toCharArray();

        String out = new String();
        for(int i=0; i<=s.length()-1; i++){
            matchPalindrom(sArray, i, i);
            matchPalindrom(sArray,i,i+1);
        }
        if(max!=min){
            out =  s.substring(min, max+1);
        }
        return out;
    }

    public void matchPalindrom(char [] sArray, int i, int j){
        int lo=0,hi=0;
        while(i>=0 && j<=sArray.length-1 && sArray[i]==sArray[j]){
            lo = i;
            hi = j;
            i--;
            j++;
        }

        if(lo>=0 && hi<=sArray.length-1 && maxL<=(hi-lo)){
            if(maxL < (hi-lo)) {
                maxL = hi - lo;
                max=hi;
                min=lo;
            }
        }
    }
}
