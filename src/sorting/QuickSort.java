package sorting;

/**
 * Created by kanunso on 1/4/17.
 */
public class QuickSort {

    int[] array ;

    public int [] sort(int [] input){
        array = input;
        quickSort(array, 0, array.length-1);
        return array;
    }




    private void quickSort(int [] input, int start, int end){

        if(start >= end){
            return;
        }

        int pivotIndex = partition(input, start, end);

        int temp = input[pivotIndex];
        input[pivotIndex] = input[end];
        input[end] = temp;

        quickSort(input, start, pivotIndex-1);
        quickSort(input, pivotIndex+1,end);



    }


    private int partition (int [] input, int start, int end){

        int pivot = input[end];
        int pIndex = start;
        for(int i=start; i<=end-1; i++){
            if(pivot > input[i]){
               pIndex++;
            }
        }
        return pIndex;




    }
}
