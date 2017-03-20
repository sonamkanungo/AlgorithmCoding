package dynamicP;

import java.util.ArrayList;

/**
 * Created by kanunso on 2/7/17.
 */
public class DynamicMatrixImpl {
    int r = 3;
    int c = 3;

    public int[][] matrix = new int[r][c];

    public int[][] memo = new int[r][c];

    public void callDiagonalTraverse(){
        matrix[0][0] =1;
        matrix[0][1] =2;
        matrix[0][2] =3;

        matrix[1][0] =4;
        matrix[1][1] =5;
        matrix[1][2] =6;

        matrix[2][0] =7;
        matrix[2][1] =8;
        matrix[2][2] =9;

        diagonalTraverse();
    }





    public void diagonalTraverse(){
        int row=0, column=0;
        boolean goUp = false;
        while(row<=r-1 && column<=c-1) {
            System.out.println(matrix[row][column]);
            if (row == 0) {
                column++;
                goUp = false;
                continue;
            } else if (column == 0){
                row++;
                goUp = true;
                continue;
            }
            if(goUp){
                row++;
                column++;
                continue;
            }else{
                row--;
                column--;
                continue;
            }
        }
    }












    public void strawberryLawn(){
        matrix[0][0] =1;
        matrix[0][1] =3;
        matrix[0][2] =1;
        matrix[0][3] =2;
        matrix[0][4] =1;

        matrix[1][0] =0;
        matrix[1][1] =0;
        matrix[1][2] =0;
        matrix[1][3] =0;
        matrix[1][4] =0;

        matrix[2][0] =4;
        matrix[2][1] =1;
        matrix[2][2] =1;
        matrix[2][3] =0;
        matrix[2][4] =5;

        matrix[3][0] =0;
        matrix[3][1] =0;
        matrix[3][2] =4;
        matrix[3][3] =0;
        matrix[3][4] =1;

        matrix[4][0] =8;
        matrix[4][1] =8;
        matrix[4][2] =1;
        matrix[4][3] =1;
        matrix[4][4] =1;
        StrawberryGarden();
    }


    public void StrawberryGarden(){
        int maxStrawberry =0;

        for(int i=0; i<=r-1; i++){
            ArrayList<String> visited = new ArrayList<String>();
            int countStrawberry = countStrawberry(i,0,visited);
            //System.out.println("Round : "+i+ " Count : "+ countStrawberry);
            if(maxStrawberry < countStrawberry){
                maxStrawberry = countStrawberry;
            }

        }
        System.out.println(maxStrawberry);
    }


    public int countStrawberry(int row, int column, ArrayList<String> visited){

        if(column==c-1){
            if(!isValidMove(row-1,column, visited) && !isValidMove(row+1,column, visited)){
                //System.out.println (matrix[row][column]);
                return matrix[row][column];
            }
        }
        if(matrix[row][column]==0){
            return 0;
        }

        visited.add(row+"_"+column);
        int topsum = (isValidMove(row-1,column, visited))?countStrawberry(row-1,column,visited):0;
        int downsum = (isValidMove(row+1,column, visited))?countStrawberry(row+1,column,visited):0;
        int rightsum = (isValidMove(row,column+1, visited))?countStrawberry(row,column+1,visited):0;

        int sum = returnMax(topsum, downsum, rightsum);

        //System.out.println(row + ", "+ column +", "+ sum);
        return matrix[row][column] + sum;
    }

    public int returnMax(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }else if(b>a && b>c){
            return b;
        } else{
            return c;
        }
    }








    public boolean isValidMove(int row, int column, ArrayList<String> visited){
        // 1. is it present in visited array, 1. out of bound 3. is zero
        if(visited.contains(row+"_"+column)) {
            return false;
        }
        if(row == -1 || row == r || column == c){
            return false;
        }
        if(matrix[row][column] == 0){
            return false;
        }
        return true;

    }


    public boolean isValidInBoundCell(int row, int column){
        if(row <= r-1 && column <= c-1 && matrix[row][column] !=0){
            return true;
        } else
            return false;
    }


    public int steal(){
        matrix[1][1] = 10;
        matrix[1][2] = 7;
        matrix[2][1] = 1;
        matrix[2][2] = 25;
        matrix[0][3] = 5;
        matrix[2][3] = 2;
        matrix[0][4] =100;
        return stealMoney(0,0);
    }

    public int stealMoney(int row, int column){
        if(row==r-1 && column==c-1){
            return matrix[row][column];
        }
        if(memo[row][column] == 0) {
            int downMoney = (isInBound(row + 1, column)) ? stealMoney(row + 1, column) + matrix[row][column] : 0;
            int leftMoney = (isInBound(row, column + 1)) ? stealMoney(row, column + 1) + matrix[row][column] : 0;
            memo[row][column] =  (leftMoney> downMoney)? leftMoney: downMoney;
        }
        return memo[row][column];
    }
    //1 2 2
    //7 5 6
    //2 2 2



    public int getMinimumCost(){
        matrix[0][0] = 1;
        matrix[0][1] = 7;
        matrix[0][2] = 2;
        matrix[1][0] = 2;
        matrix[1][1] = 5;
        matrix[1][2] = 2;
        matrix[2][0] = 2;
        matrix[2][1] = 6;
        matrix[2][2] = 2;
        printMetrix();
        System.out.println();
        return minimumCost(0,0);

    }

    public int minimumCost(int row, int column){
        if(row==r-1 && column==c-1){
            memo[row][column] = matrix[row][column];
            return matrix[row][column];
        }
        if( memo[row][column]== 0){
            int down = (isInBound(row + 1, column)) ? minimumCost(row + 1, column) + matrix[row][column] : Integer.MAX_VALUE;
            int left = (isInBound(row, column + 1)) ? minimumCost(row, column + 1) + matrix[row][column] : Integer.MAX_VALUE;
            int diag = (isInBound(row + 1, column + 1)) ? minimumCost(row + 1, column + 1) + matrix[row][column] : Integer.MAX_VALUE;
            memo[row][column] = minimum(down, left, diag);
        }
        return memo[row][column];


    }



    public boolean isInBound(int row, int column){
        if(row <= r-1 && column <= c-1){
            return true;
        }
        return false;
    }




    public int minimum(int a, int b, int c){
        if(a<b && a<c){
            return a;
        }else{
            if(b<a && b<c){
                return b;
            }else
                return c;
        }
    }






    public int getNumberofpath(){
        matrix[1][1] = 10;
        matrix[1][2] = 7;
        matrix[2][1] = 1;
        matrix[2][2] = 2;
        matrix[0][3] = 5;
        matrix[2][3] = 2;
        return countNumberofPath(0,0);


    }

    public int countNumberofPath(int row, int column){
        if(row==r-1 && column == c-1){
            System.out.print("here");
            return 1;
        }
        if(memo[row][column] == 0) {
            int nextRow = (isValidCell(row + 1, column) ? countNumberofPath(row + 1, column) : 0);
            int nextColumn = (isValidCell(row, column + 1) ? countNumberofPath(row, column + 1) : 0);
            memo[row][column] = nextRow+nextColumn;
            return nextRow + nextColumn;
        }else{
            return memo[row][column];
        }

    }

    public boolean isValidCell(int row, int column){
        if(row == r || column == c){
            return false;
        }else if(matrix[row][column] == 1){
            return false;
        }
        return true;
    }

    public void printMemo(){
        System.out.println();
        for(int i=0; i<=r-1; i++){
            for( int j=0; j<=c-1; j++){
                System.out.print(memo[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printMetrix(){
        System.out.println();
        for(int i=0; i<=r-1; i++){
            for( int j=0; j<=c-1; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}



