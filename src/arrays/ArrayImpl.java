package arrays;

import java.util.Arrays;

/**
 * Created by kanunso on 1/23/17.
 */
public class ArrayImpl {
    public static void main(String args[]){

        ArrayImpl arrayImpl = new ArrayImpl();
        System.out.println(arrayImpl.hasUniqueChar("dfesagD"));
        int[][] a = {{1,1,2,3,4},{1,1,1,1,1},{2,2,0,2,2},{3,3,3,3,3},{4,4,4,4,4}};

        //arrayImpl.flipTheMatrix(a);
        //arrayImpl.printMatrix(a);
        int [][] out = arrayImpl.mineSweep(a);
        arrayImpl.printMatrix(out);


    }


    public boolean hasUniqueChar(String input){
        char [] inputArray = input.toLowerCase().toCharArray();
        Arrays.sort(inputArray);
        boolean flag = true;
        for(int i=0; i<=inputArray.length -2; i++){
            if(inputArray[i] == inputArray[i+1]){
                flag = false;
            }
        }
        return flag;
    }


    public int [][] mineSweep(int[][] a){
        int m = a.length;
        int n = a[0].length;
        int[][] out = fillWith(a);
        for(int i=0; i<=n-1; i++){
            for(int j=0; j<=m-1; j++){
                if(a[i][j]==0){
                    makerowcolumnZero(out, i,j);
                }else{
                    if(out[i][j] !=0){
                        out[i][j] = a[i][j];
                    }
                }
            }
        }
        return out;

    }

    public void makerowcolumnZero(int [][] out, int i, int j){
        for(int k=0; k<=out[0].length-1; k++){
           // System.out.print("i,k:"+ i+k );
            out[i][k] = 0;
        }
        for(int k=0; k<=out.length-1; k++){
            //System.out.print("k,j:"+ k+j );
            out[k][j] = 0;
        }
    }

    public void printMatrix(int [][] out){
        System.out.println();
        for(int [] intArray: out){
            for(int k : intArray){
                System.out.print(k +", ");
            }
            System.out.println();
        }
    }

    public int[][] fillWith(int [][] a){
        int [][] out = new int[a.length][a[0].length];
        for(int i=0; i<=a.length-1; i++){
            for(int j=0; j<=a[0].length-1; j++){
                out[i][j] = a[i][j];
            }

        }
        return out;
    }







    public void flipTheMatrix(int[][] a){
        int n = a[0].length-1;
        for(int i=0; i<=n-i; i++){
            for(int j=i; j<=n-i; j++){
                int temp = a[n][n-i];
                a[j][n-i] = a[n-i][n-j];
                a[n-i][n-j] = a[n-j][n-i];
                a[n-j][n-i] = a[i][j];
                a[i][j] = temp;
                //System.out.println("i : "+i + " j : "+ j);
            }
            System.out.println("Round by round : ");
            for(int [] intArray: a){
                for(int k : intArray){
                    System.out.print(k +", ");
                }
                System.out.println();
            }

        }
    }

    /*
temp =
a[0][0] -> a[0][n], a[n][n]-> a[n][0]
a[1][0] -> a[0][n-1], a[n-1][n]-> a[1][n]



a[0][0] -> a[0][1] -> a[n][n] -> a[n][0]->    a[0][0]
a[0][1] -> a[n][1] -> a[n-1][n] -> a[





a[1][0] -> a[0][n-1] -> a[n-1][n] -> a[n-1][0]

a[2][0] -> a[0][n-2] -> a[n-2][n] -> a[n-2][0]

 */



}

