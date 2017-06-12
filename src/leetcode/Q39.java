package leetcode;

/**
 * Created by kanunso on 3/22/17.
 */
public class Q39 {

    public static void main(String[] args) {

        char input[][]={{'a','b','e','e'},{'g','h','e','c'},{'a','b','s','d'}};

        String s1 = "abc";
        String s2 = "bees";
        String s3 = "see";

        Q39 q39 = new Q39();
        q39.searchStringinMetrix(input, s3);

    }

    public void searchStringinMetrix(char [][] input, String s){
        char[] ss = s.toCharArray();
        for(int i=0; i<=input.length-1; i++){
            for(int j=0; j<=input[0].length-1; j++){
                if(input[i][j]==ss[0]) {
                    if (searchString(input, i, j, ss, 0)) {
                        System.out.println("true");
                        return;
                    }
                }
            }
        }
    }


    public boolean searchString(char[][] input, int r, int c, char[]ss, int i){

        if(r>=0 && c>=0 && r<=input.length-1 && c<=input[0].length-1 && i<=ss.length-1 && input[r][c]==ss[i] && input[r][c]!='*'){
            input[r][c]='*';
            if(i==ss.length-1){
                return true;
            }
            i++;
            boolean prev = searchString(input,r,c-1,ss,i);
            boolean next = searchString(input,r,c+1,ss,i);
            boolean up = searchString(input,r-1,c,ss,i);
            boolean bottom = searchString(input,r+1,c,ss,i);

            return prev || next || up || bottom;
        }
        else return false;

    }


}
