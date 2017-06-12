package leetcode;

/**
 * Created by kanunso on 3/22/17.
 */
public class Q542 {

    public static void main(String[] args) {

        int [][] input1 = {{0,0,0},{0,1,0},{0,0,0}};

        int [][] input = {{0,0,0},{0,1,0},{1,1,1}};

        boolean[][] visited = new boolean[3][3];

        Q542 q542 = new Q542();

        q542.matrix01(input);

        for(int i =0; i<=input.length-1; i++){
            for(int j=0; j<=input[0].length-1;j++){
                System.out.print(input[i][j]);
            }
            System.out.println();
        }


    }

    public void matrix01(int [][]input){

        for(int r=0; r<=input.length-1; r++){
            for(int c=0; c<=input[0].length-1; c++){
                if(input[r][c]==1){
                    //int min = findtheNearestZero(input, r,c);
                    //input[r][c]=min;

                }
            }
        }
    }

    public int findtheNearestZero(int[][] input, int r, int c, boolean[][]visited){
        int prev=0, next=0, up=0, down=0;
        visited[r][c]=true;
        //prev is inbound
        if(r>=0 && c-1>=0 && r<=input.length-1 && c-1<=input[0].length-1){
            if(input[r][c-1]==0){
                return 1;
            } else{
                if(!visited[r][c-1]){
                    prev = findtheNearestZero(input,r,c-1,visited);
                }else{
                    return input[r][c-1];
                }
            }
        }


        //next is inbound
        if(r>=0 && c+1>=0 && r<=input.length-1 && c+1<=input[0].length-1){
            if(input[r][c+1]==0){
                return 1;
            } else{
                if(!visited[r][c+1]){
                    findtheNearestZero(input,r,c+1,visited);
                }else{
                    return input[r][c+1];
                }
            }
        }


        //up is inbound
        if(r-1>=0 && c>=0 && r-1<=input.length-1 && c<=input[0].length-1){
            if(input[r-1][c]==0){
                return 1;
            } else{
                if(!visited[r-1][c]){
                    findtheNearestZero(input,r-1,c,visited);
                }else{
                    return input[r-1][c];
                }
            }
        }

        //down is inbound
        if(r+1>=0 && c>=0 && r+1<=input.length-1 && c<=input[0].length-1){
            if(input[r+1][c]==0){
                return 1;
            } else{
                if(!visited[r+1][c]){
                    findtheNearestZero(input,r+1,c,visited);
                }else{
                    return input[r+1][c];
                }
            }
        }
        return findMin(2,4,5,6);


    }


    public int findMin(int a, int b, int c, int d){
        if(a<=b && a<=c && a<=d){
            return a;
        }else if(b<=a && b<=c && b<=d){
            return b;
        }else if(c<=a && c<=b && c<=d){
            return c;
        }else
            return d;
    }
}
