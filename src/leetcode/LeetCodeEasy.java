package leetcode;

import java.util.*;

/**
 * Created by kanunso on 3/9/17.
 */
public class LeetCodeEasy {
    public static void main(String[] args) {

        LeetCodeEasy leetCodeEasy = new LeetCodeEasy();
        int [] input = {1,1,2,3,3,4,4,8,8};
        int o = leetCodeEasy.searchSingleElement(input);
        System.out.println("o = " + o);
    }

    public int searchSingleElement(int [] input){
        for(int i=0; i<=input.length-1; i=i+2){
            if(i==input.length-1 || input[i]!=input[i+1]){
                return input[i];
            }
        }
        return -1;
    }


    //tree
    public void printByFrequency(String input){
        char [] inArray = input.toCharArray();

        HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();

        for(int i =0; i<=inArray.length-1; i++){
            Character c = new Character(inArray[i]);
            if(freqMap.containsKey(c)){
                Integer count = freqMap.get(c);
                count++;
                freqMap.put(c,count);
            } else{
                freqMap.put(c,1);
            }
        }






    }
}
