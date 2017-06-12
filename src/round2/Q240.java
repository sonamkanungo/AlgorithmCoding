package round2;

/**
 * Created by kanunso on 5/18/17.
 */
public class Q240 {

    public static void main(String[] args) {
        int [][] mt = { {1,   4,  7, 11, 15},
                        {2,   5,  8, 12, 19},
                        {3,   6,  9, 16, 22},
                        {10, 13, 14, 17, 24},
                        {19, 21, 23, 26, 30}};

        Q240 q240 = new Q240();
        System.out.println(q240.search2DMatrix(mt,0,mt.length-1,8));
    }

    public boolean search2DMatrix(int [][] matrix, int i, int j, int n){
        if(i>4 || j<0){
            return false;
        }
        if(matrix[i][j]==n){
            return true;
        }
        if(n > matrix[i][j]){
            return search2DMatrix(matrix,i+1, j,n);
        }else{
            return search2DMatrix(matrix, i, j-1,n);
        }
    }
}
