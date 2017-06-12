package dp;

/**
 * Created by kanunso on 4/28/17.
 */
public class Theif {


    public static void main(String[] args) {

        Theif theif = new Theif();
        int[][] home = new int[5][5];
        home[1][1]=2;
        home[3][4]=5;


        System.out.println("home[2][2] = " + home[2][2]);
        int o = theif.maxSteal(home,0, 0, 5);
        System.out.println("o = " + o);
    }

    public int maxSteal(int [][] home, int i, int j, int n){
        if(i==n-1 && j==n-1){
            return home[n-1][n-1];
        }
        int right = 0;
        int down =0;
        if(isValid(i, j+1, n)){
            right = maxSteal(home, i, j+1, n)+home[i][j];
        }
        if(isValid(i+1, j, n)){
            down = maxSteal(home, i+1, j, n)+home[i][j];
        }
        return Math.max(right, down);
    }

    public boolean isValid(int i, int j, int n){

        if(i<0 || i>n-1){
            return false;
        }
        if(j<0 || j>n-1){
            return false;
        }
        return true;
    }








}
