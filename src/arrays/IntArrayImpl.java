package arrays;

/**
 * Created by kanunso on 1/11/17.
 */
public class IntArrayImpl {

    public static void main(String args[]){

        IntArrayImpl intArrayImpl = new IntArrayImpl();
        int [] input = {1,2,3,4,5};
        intArrayImpl.productofArray(input);


    }

    public void productofArray(int [] input){
        int prod = 1;
        for(int i=0; i<=input.length-1; i++){
            prod = prod * input[i];
        }
        int [] output = new int[input.length];
        for(int i=0; i<=input.length-1; i++){
            output[i] = prod/input[i];
        }
        System.out.println();
        for(int o: output){
            System.out.print(o+ ", ");
        }
        System.out.println();
    }
}
