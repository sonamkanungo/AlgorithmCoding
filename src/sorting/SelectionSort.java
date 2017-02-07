package sorting;

/**
 * Created by kanunso on 1/3/17.
 */
public class SelectionSort {

    int[] array = {1, 12, 3, 4, 7, 2};

     public int[] sort(int[] input) {
         int temp = 0;
         int min = 0;
         int minIndex =0;
        for (int i = 0; i <= input.length - 1; i++) {
            min = input[i];
            minIndex = i;
            for (int j = i; j <= input.length-1; j++) {
                if (input[j] < min) {
                    min = input[j];
                    minIndex = j;
                }
            }
            temp = input[i];
            input[i] = input[minIndex];
            input[minIndex] = temp;
        }
        return input;
    }
}