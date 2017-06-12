package leetcode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by kanunso on 4/7/17.
 */
public class Q17 {

    public static void main(String[] args) {

        Q17 q17 = new Q17();
        HashMap<String, ArrayList<String>> dial = q17.phonedialDict();
        ArrayList<String> out = new ArrayList<String>();
        out = q17.combinationOfPhoneNumber("722448", dial);
        for(String s: out){
            System.out.print(s + ", ");
        }
    }



    public ArrayList<String> combinationOfPhoneNumber(String in, HashMap<String, ArrayList<String>> dial){
        ArrayList<String> output = new ArrayList<>();
        if(in.length()==1){
            ArrayList<String> dic = dial.get(in);
            for(String d: dic){
                output.add(d);
            }
            return output;
        }
        String [] inArray = in.split("");
        String pre = inArray[0];
        ArrayList<String> dic = dial.get(pre);
        String inn = in.substring(1,in.length());
        ArrayList<String> sArray = combinationOfPhoneNumber(inn, dial);
        for(String c: dic){
            for(String po : sArray){
                String out = c.concat(po);
                output.add(out);
            }
        }
        return output;
    }



    public HashMap<String, ArrayList<String>> phonedialDict(){
        HashMap<String, ArrayList<String>> numberMap = new HashMap<String, ArrayList<String>>();
        ArrayList<String> ch2 = new ArrayList<String>();
        ch2.add("a");
        ch2.add("b");
        ch2.add("c");
        ArrayList<String> ch3 = new ArrayList<String>();
        ch3.add("d");
        ch3.add("e");
        ch3.add("f");

        ArrayList<String> ch4 = new ArrayList<String>();
        ch4.add("g");
        ch4.add("h");
        ch4.add("i");

        ArrayList<String> ch5 = new ArrayList<String>();
        ch5.add("j");
        ch5.add("k");
        ch5.add("l");

        ArrayList<String> ch6 = new ArrayList<String>();
        ch6.add("m");
        ch6.add("n");
        ch6.add("o");

        ArrayList<String> ch7 = new ArrayList<String>();
        ch7.add("p");
        ch7.add("q");
        ch7.add("r");
        ch7.add("s");

        ArrayList<String> ch8 = new ArrayList<String>();
        ch8.add("t");
        ch8.add("u");
        ch8.add("v");

        ArrayList<String> ch9 = new ArrayList<String>();
        ch9.add("w");
        ch9.add("x");
        ch9.add("y");
        ch9.add("z");


        numberMap.put("0",new ArrayList<>());
        numberMap.put("1",new ArrayList<>());
        numberMap.put("2", ch2);
        numberMap.put("3", ch3);
        numberMap.put("4", ch4);
        numberMap.put("5", ch5);
        numberMap.put("6", ch6);
        numberMap.put("7", ch7);
        numberMap.put("8", ch8);
        numberMap.put("9", ch9);

        return numberMap;
    }
}
