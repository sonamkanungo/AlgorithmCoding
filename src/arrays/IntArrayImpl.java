package arrays;

import java.util.HashMap;

/**
 * Created by kanunso on 1/11/17.
 */
public class IntArrayImpl {

    public static void main(String args[]){

        IntArrayImpl intArrayImpl = new IntArrayImpl();
        int [] input = {1,2,3,4,5};
        //intArrayImpl.productofArray(input);

        System.out.println(intArrayImpl.countNSay(1112213));
    }

    public String countNSay(Integer n){
        String nStr = n.toString();
        char [] input = nStr.toCharArray();
        return countAndSay(input);
    }

    public String countAndSay(char[] input) {
        HashMap<Character, Integer> elementCount = new HashMap<Character, Integer>();
        String output = "";
        for (int i = 0; i <= input.length - 1; i++) {
            if (elementCount.containsKey(input[i])) {
                if (input[i - 1] == input[i]) {
                    int count = elementCount.get(input[i]);
                    count++;
                    elementCount.put(input[i], count++);
                }
            } else {
                elementCount.put(input[i], 1);
            }
            if (i==input.length-1 || input[i] != input[i + 1] ) {
                output = output.concat(sayNumber(elementCount.get(input[i]), input[i])) + ", ";
                elementCount.remove(input[i]);
            }

        }
        return output;
    }

        public String sayNumber(Integer n, Character element){
            String sayN = numberDictionary(n);
            if(n>1){
                return sayN+" "+element.toString()+"s";
            } else{
                return sayN+" "+element.toString();
            }
        }

        public String numberDictionary(Integer n){

        switch(n){
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "more than ten";
        }
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
