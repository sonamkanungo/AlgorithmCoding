package leetcode;

/**
 * Created by kanunso on 3/18/17.
 */
public class IslandImpl {

    public static void main(String[] args) {

        IslandImpl island = new IslandImpl();

        int [][] matrix = {{1,1,1,1,0},{1,1,1,1,0},{1,1,0,1,0},{1,1,0,0,0},{0,0,1,0,1}};
        //int out = island.numberofIsland(matrix);
        //System.out.println("out = " + out);

        /*
        char [][] region = {{'X', 'X', 'X', 'X'},{'X', '0', '0', 'X'},{'X', 'X', '0', '0'},{'X', '0', 'X', 'X'}};
        boolean [][]visited = new boolean[4][4];
        island.captureRegion(region,visited);

        for(int i=0; i<=3; i++){
            for(int j=0; j<=3; j++){
                System.out.print(region[i][j]+", ");
            }
            System.out.println();
        }
        */

        int input[][]= {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        for(int i =0; i<=input.length-1; i++){
            for(int j=0; j<=input[0].length-1;j++){
                System.out.print(input[i][j]);
            }
            System.out.println();
        }

        island.findIslandPerimeter(input);



    }



    public int numberofIsland(int [] [] input){
        int count = 0;
        for(int r=0; r<=input.length -1; r++){
            for(int c=0; c<=input[r].length-1; c++){
                if(input[r][c] == 1){
                    count++;
                    //System.out.println("r = " + r + "c = " + c);
                    clearSubsequentOnes(input, r,c);
                }
            }
        }

        return count;

    }

    public void clearSubsequentOnes(int[][] input, int i, int j){

        if(i>=0 && j>=0 && i<=input[0].length-1 && j<=input.length-1 && input[i][j] ==1) {
            input[i][j] = 0;
            clearSubsequentOnes(input, i - 1, j);
            clearSubsequentOnes(input, i, j - 1);
            clearSubsequentOnes(input, i, j + 1);
            clearSubsequentOnes(input, i + 1, j);
        }
    }

    public void captureRegion(char[][] input, boolean[][] visited){

        for(int r=0; r<=input.length-1;r++){
            for(int c=0; c<=input[0].length-1; c++){
                if(input[r][c] =='0' && !visited[r][c]){
                    captureContainedRegion(input, visited, r, c);
                }
            }
        }
    }

    public boolean captureContainedRegion(char[][] input, boolean[][] visited, int i, int j){
        boolean prev=false,next=false, up=false, down=false;






        visited[i][j]=true;
        //prev i, j-1
        if(i>=0 && j-1>=0 && i<=input[0].length-1 && j-1<=input.length-1){
            if(input[i][j-1] =='X' || visited[i][j-1]){
                prev = true;
            }else if(input[i][j-1] =='0'){
                prev = captureContainedRegion(input,visited, i, j-1);
            }
        }

        // next i, j+1
        if(i>=0 && j+1>=0 && i<=input[0].length-1 && j+1<=input.length-1){
            
            if(input[i][j+1] =='X' || visited[i][j+1]){
                next = true;
            }else if(input[i][j+1] =='0'){
                next = captureContainedRegion(input,visited, i, j+1);
            }
        }

        // up i-1,j
        if(i-1>=0 && j>=0 && i-1<=input[0].length-1 && j<=input.length-1){
            if(input[i-1][j] =='X' || visited[i-1][j]){
                up = true;
            }else if(input[i-1][j] =='0'){
                up = captureContainedRegion(input,visited, i-1, j);
            }
        }


        //down i+1, j
        if(i+1>=0 && j>=0 && i+1<=input[0].length-1 && j<=input.length-1){
            if(input[i+1][j] =='X' || visited[i+1][j]){
                down = true;
            }else if(input[i+1][j] =='0'){
                down = captureContainedRegion(input,visited, i+1, j);
            }
        }
        if(prev && next && up && down){
            input[i][j] = 'X';
        }
        return prev && next && up && down;

    }


    public void findSquareIsland(int [][] input){


        for(int r=0; r<=input.length; r++){
            for(int c=0; c<=input[0].length; c++){
                if(input[r][c]==1){
                   //
                }

            }
        }
    }


    public void checkSquare(int [][] input, int r,int c){


        //x = count number of consecutive columns with value = 1,

        //loop x times and do the following for each row
        // check 1. input[c-1] is zero or c-1<0
        //       2. all of the values within range are 1s
        //       3. input[c+1] is zero or c+1 is out of bound
        //       4.

    }


    public void findIslandPerimeter(int [][] input){
        int out = 0;
        for(int i=0; i<=input.length-1; i++){
            for(int j=0; j<=input[0].length-1; j++){
                if(input[i][j]==1){
                    out = islandPerimeter(input, i,j);
                    break;
                }
            }
        }
        System.out.println("out = " + out);

    }


    public int islandPerimeter(int[][] input, int i, int j){
        input[i][j]=2;
        int prev =1, next =1, up =1, down=1;


        if(i>=0 && j-1>=0 && i<=input[0].length-1 && j-1<=input.length-1){
            if(input[i][j-1] ==1){
                prev = islandPerimeter(input,i,j-1);
            } else if(input[i][j-1]==2){
                prev = 0;
            }else{
                prev =1;
            }
        }

        // next i, j+1
        if(i>=0 && j+1>=0 && i<=input[0].length-1 && j+1<=input.length-1){
            if(input[i][j+1] ==1){
                next = islandPerimeter(input,i,j+1);
            }else if(input[i][j+1] ==2){
                next = 0;
            }else{
                next =1;
            }
        }

        // up i-1,j
        if(i-1>=0 && j>=0 && i-1<=input[0].length-1 && j<=input.length-1){
            if(input[i-1][j] ==1){
                up = islandPerimeter(input,i-1, j);
            }else if(input[i-1][j] ==2){
                up = 0;
            } else{
                up=1;
            }
        }


        //down i+1, j
        if(i+1>=0 && j>=0 && i+1<=input[0].length-1 && j<=input.length-1){
            if(input[i+1][j] ==1){
                down = islandPerimeter(input, i+1, j);
            }else if(input[i+1][j] ==2){
                down = 0;
            }else{
                down=1;
            }
        }

        return prev+ next+ up+ down;


    }
}
