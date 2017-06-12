package leetcode;

import java.util.HashMap;

/**
 * Created by kanunso on 4/13/17.
 */
public class Q36 {

    public static void main(String[] args) {

        Q36 q36 = new Q36();
        //int [][] matrix = q36.createSudoku(9);



    }

    public void validSudoku(int[][] matrix){






    }




    public int[][] createSudoku(int n){
        int[][] matrix  = new int[n][n];

        //each [row][column]
        matrix[0][0]=5;
        matrix[0][1]=3;
        matrix[0][2]=0;
        matrix[0][3]=0;
        matrix[0][4]=7;
        matrix[0][5]=0;
        matrix[0][6]=0;
        matrix[0][7]=0;
        matrix[0][8]=0;

        matrix[1][0]=6;
        matrix[1][1]=0;
        matrix[1][2]=0;
        matrix[1][3]=1;
        matrix[1][4]=9;
        matrix[1][5]=5;
        matrix[1][6]=0;
        matrix[1][7]=0;
        matrix[1][8]=0;

        matrix[2][0]=0;
        matrix[2][1]=9;
        matrix[2][2]=8;
        matrix[2][3]=0;
        matrix[2][4]=0;
        matrix[2][5]=0;
        matrix[2][6]=0;
        matrix[2][7]=6;
        matrix[2][8]=0;

        matrix[3][0]=8;
        matrix[3][1]=0;
        matrix[3][2]=0;
        matrix[3][3]=0;
        matrix[3][4]=6;
        matrix[3][5]=0;
        matrix[3][6]=0;
        matrix[3][7]=0;
        matrix[3][8]=3;

        matrix[4][0]=4;
        matrix[4][1]=0;
        matrix[4][2]=0;
        matrix[4][3]=8;
        matrix[4][4]=0;
        matrix[4][5]=3;
        matrix[4][6]=0;
        matrix[4][7]=0;
        matrix[4][8]=1;

        matrix[5][0]=7;
        matrix[5][1]=0;
        matrix[5][2]=0;
        matrix[5][3]=0;
        matrix[5][4]=2;
        matrix[5][5]=0;
        matrix[5][6]=0;
        matrix[5][7]=0;
        matrix[5][8]=6;

        matrix[6][0]=0;
        matrix[6][1]=6;
        matrix[6][2]=0;
        matrix[6][3]=0;
        matrix[6][4]=0;
        matrix[6][5]=0;
        matrix[6][6]=2;
        matrix[6][7]=8;
        matrix[6][8]=0;

        matrix[7][0]=0;
        matrix[7][1]=0;
        matrix[7][2]=0;
        matrix[7][3]=4;
        matrix[7][4]=1;
        matrix[7][5]=9;
        matrix[7][6]=0;
        matrix[7][7]=0;
        matrix[7][8]=5;

        matrix[8][0]=0;
        matrix[8][1]=0;
        matrix[8][2]=0;
        matrix[8][3]=0;
        matrix[8][4]=8;
        matrix[8][5]=0;
        matrix[8][6]=0;
        matrix[8][7]=7;
        matrix[8][8]=9;

        return matrix;
    }




}
