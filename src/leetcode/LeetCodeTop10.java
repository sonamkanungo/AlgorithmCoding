package leetcode;

import java.util.ArrayList;

/**
 * Created by kanunso on 3/6/17.
 */
public class LeetCodeTop10 {

    public static void main(String[] args) {
        LeetCodeTop10 leetCodeTop10 = new LeetCodeTop10();

        leetCodeTop10.minimumGeneticMutation();

    }


    public void minimumGeneticMutation(){
        String start = "AACCGGTT";
        String end = "AACCGGTA";
        ArrayList<Character> choices = new ArrayList<Character>();
        choices.add('A');
        choices.add('C');
        choices.add('G');
        choices.add('T');

        ArrayList<String> bank = new ArrayList<String>();
        bank.add("AACCGGTA");
        bank.add("AACCGGTT");

        Integer minGenMut = countMutation(choices,start,end,bank,0);
        if(minGenMut == Integer.MAX_VALUE){
            System.out.print("-1");
        }else{
            System.out.println(minGenMut.toString());
        }


    }

    //Brute Force
    public Integer countMutation(ArrayList<Character> choices, String start, String end, ArrayList<String> bank, Integer index){
        if(start.equals(end)){
            return 0;
        }
        char [] startArray = start.toCharArray();
        int min = Integer.MAX_VALUE;
        char current = startArray[index];
        if(index <= start.length()-1) {
            for (Character c : choices) {
                if(c!=current) {
                    startArray[index] = c;
                }
                String mutation = new String(startArray);
                //System.out.print("mutation : "+mutation);
                if (bank.contains(mutation)) {
                    //System.out.print("mutation : "+mutation);
                    index++;
                    int numberofWays = 1 + countMutation(choices, mutation, end, bank, index);
                    if (numberofWays < min) {
                        min = numberofWays;
                    }
                }
            }
        }

        return min;

    }

    //Iteratively



}
