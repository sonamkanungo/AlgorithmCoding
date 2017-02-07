package sorting;

/**
 * Created by kanunso on 1/3/17.
 */
public class BubbleSort {

    public int[] sort(int[] input) {
        int temp = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i-1; j++) {
                if (input[j] > input[j + 1]) {
                    temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;
    }
}
