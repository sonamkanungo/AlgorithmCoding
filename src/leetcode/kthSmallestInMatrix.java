package leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by kanunso on 3/14/17.
 */
public class KthSmallestInMatrix {

    public static void main(String[] args) {

        KthSmallestInMatrix kthSmallestInMatrix = new KthSmallestInMatrix();

        int[][] matrix = new int[3][3];
        matrix[0][0] =1;
        matrix[0][1] =5;
        matrix[0][2] =9;

        matrix[1][0] =10;
        matrix[1][1] =11;
        matrix[1][2] =13;

        matrix[2][0] =12;
        matrix[2][1] =13;
        matrix[2][2] =15;

        int o= kthSmallestInMatrix.findKthSmallestinMatrix(matrix,8);

        System.out.println("o = " + o);

    }

    public int findKthSmallestinMatrix(int[][] input, int k){
        int out=-1;
        Comparator<MatrixNode> c1 = new Comparator<MatrixNode>() {
            @Override
            public int compare(MatrixNode o1, MatrixNode o2) {
                return o1.value.compareTo(o2.value);
            }
        };

        PriorityQueue<MatrixNode> minHeap = new PriorityQueue<MatrixNode>(k, c1);

        for(int i=0, j=0; j<=input[0].length-1; j++){
            MatrixNode  mn = new MatrixNode(i,j,input[i][j]);
            minHeap.add(mn);
        }

        while(k>0){
            if(!minHeap.isEmpty()) {
                MatrixNode mn = minHeap.poll();
                k--;
                out = mn.value;
                if (mn.row < input[0].length - 1) {
                    mn.row++;
                    MatrixNode newMN = new MatrixNode(mn.row, mn.column, input[mn.row][mn.column]);
                    minHeap.add(newMN);
                }
            }
        }
        return out;
    }





}
