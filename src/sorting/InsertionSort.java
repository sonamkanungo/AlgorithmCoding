package sorting;

/**
 * Created by kanunso on 1/3/17.
 */
public class InsertionSort {

    public int[] sort(int [] input){

        for(int i=0; i<=input.length -1; i++) {
            int temp = input[i];
            for (int j = 0; j <= i; j++) {
            if(temp<=input[j]){
                for(int k=i; k>j; k--){
                    input[k-1] = input[k];
                }
                input[j]=temp;
            }
            }
        }
        return input;
    }


}
