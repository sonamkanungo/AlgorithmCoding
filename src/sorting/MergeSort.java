package sorting;

/**
 * Created by kanunso on 1/4/17.
 */
public class MergeSort {

    int [] input ;

    public int [] sort(int [] array){
        input = array;
        mergeSort(input);
        return input;

    }

    private int[] mergeSort(int [] input){

        if(input.length == 1){
            return input;
        }

        int mid = input.length/2;

        int [] left = new int[mid];
        int [] right = new int [input.length - mid];
        int k=0;
        for(int i=0; i<=mid -1; i++){
            left[i] = input[i];
        }
        for(int j=mid; j<=input.length-1; j++){
            right[j-mid] = input[j];
        }

        mergeSort(left);
        mergeSort(right);

        merge(input, left, right);
        return input;
    }

    private void merge(int [] output, int [] input1, int [] input2){
        int i=0,j=0,k=0;


        while(i<=input1.length-1 && j<=input2.length-1){
            if(input1[i] < input2[j]){
                output[k] = input1[i];
                i++;
            }else{
                output[k] = input2[j];
                j++;
            }
            k++;
        }
        while(i<=input1.length-1){
            output[k] = input1[i];
            i++;
            k++;
        }

        while(j<=input2.length-1){
            output[k] = input2[j];
            j++;
            k++;
        }
    }










}
