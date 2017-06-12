package dp;

import java.util.HashSet;

/**
 * Created by kanunso on 4/14/17.
 */
public class DictionaryCheck {

    public static void main(String[] args) {
        //[i,like,golf,golfing,every,everyday]
        HashSet<String> dictionary= new HashSet<>();
        dictionary.add("i");
        dictionary.add("like");
        dictionary.add("golf");
        dictionary.add("golfing");
        dictionary.add("every");
        dictionary.add("everyday");

        String input="ilikegolfingeveryday";

        DictionaryCheck dictionaryCheck = new DictionaryCheck();
        boolean out = dictionaryCheck.dict(input,dictionary);
        System.out.println("out = " + out);

    }


    public boolean dict(String input, HashSet<String> dic){
        boolean out = false;
        if(input.length()==0){
            return false;
        }

        if(input.length()>0 && dic.contains(input)){
            return true;
        }

        for(int i=1; i<=input.length()-1; i++){
            String p = input.substring(0,i);
            String po = input.substring(i, input.length()-1);
            if(dic.contains(p)){
                out = dict(po, dic);
                if(out){
                    return true;
                }
            }
        }
        return out;
    }
}
