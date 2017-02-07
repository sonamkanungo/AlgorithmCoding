package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kanunso on 1/10/17.
 */
public class StringFunctions {

    public static void main(String [] agrs){

        StringFunctions stringFunctions = new StringFunctions();

        /*
        stringFunctions.reverseString("This is to be reversed");
        stringFunctions.reverseSentence("This is to be reversed");
        stringFunctions.replaceString("This is to be replaced with a", "t", "A");
        stringFunctions.replaceSpace("This is to be replaced");
        */

        //stringFunctions.characterCount("This is the string");
        //stringFunctions.tranformString("aaaabbbbbbbccfaad");
        //System.out.print(stringFunctions.stringOrderingString("hhello daar", "hl"));
        /*
        ArrayList<String> output = stringFunctions.permute("helol");
        System.out.println("Size : "+output.size());
        for(String s: output){
            System.out.println(s);
        }
        */

        ArrayList<String> dict = new ArrayList<String>();
        dict.add("hello");
        dict.add("to");
        dict.add("the");
        dict.add("world");


        System.out.println(stringFunctions.scrambledSentence("elhloothtedrowl", dict));

        System.out.println(stringFunctions.secondHighestOcccuring("aabbbcccc"));

    }


    public void reverseString(String input){

        System.out.println();
        char [] inputArray = input.toCharArray();
        StringBuffer output = new StringBuffer();
        for(int i=inputArray.length-1; i>=0; i--){
            output.append(inputArray[i]);
            System.out.print(inputArray[i]);
        }
        System.out.println();
        System.out.println(output);

    }

    public void reverseSentence(String input){
        String [] splitInput = input.split(" ");
        int start=0;
        int end = splitInput.length -1;
        while (start < end){
            String temp = splitInput[start];
            splitInput[start] = splitInput[end];
            splitInput[end] = temp;
            start++;
            end--;
        }

        for(String s: splitInput){
            System.out.print(s +" ");

        }
        System.out.println();

    }

    public void replaceString(String input, String t, String r){
        String [] inputSplit = input.split("");
        StringBuffer output = new StringBuffer();
        for(String s : inputSplit){
            if(s.toUpperCase().equals(t.toUpperCase())){
                output.append(r);
            }else
                output.append(s);
        }
        System.out.println(output.toString());

    }

    public void replaceSpace(String input){
        StringBuffer output = new StringBuffer();
        char [] inputArray = input.toCharArray();
        for(char c : inputArray){
            if(Character.isWhitespace(c)){
                output.append("%20%");
            }else{
                output.append(Character.toString(c));
            }
        }

        /*
        String [] inputSplit = input.split("");
        StringBuffer output = new StringBuffer();
        for(String s : inputSplit){
            if(s.equals(" ")){
                output.append("%20%");
            }else{
                output.append(s);
            }
        }

        */
        System.out.println(output.toString());

    }


    public void characterCount(String input){
        char [] inputArray = input.toCharArray();
        Map<String, Integer> cMap = new HashMap<String, Integer>();
        int count = 0;
        for(char c: inputArray){
            String s = Character.toString(c);
            if(cMap.containsKey(s)){
                count = cMap.get(s);
                count++;
                cMap.put(s,count);
            }else{
                cMap.put(s,1);
            }
            count = 0;
        }
        for(String s : cMap.keySet()){
            System.out.println(s+ " : " +cMap.get(s));
        }
    }


    public void tranformString(String input){
        char [] inputArray = input.toCharArray();
        int count=1;
        StringBuffer output = new StringBuffer();

        for(int i=1; i<=inputArray.length-1; i++){
            if(inputArray[i-1] == inputArray[i]){
                count++;
                if(i==inputArray.length-1){
                    output.append(Character.toString(inputArray[i-1])).append(count);
                }
            }else{
                output.append(Character.toString(inputArray[i-1])).append(count);
                count = 1;
                if(i==inputArray.length-1){
                    output.append(Character.toString(inputArray[i])).append("1");
                }
            }
        }
    }

    public char secondHighestOcccuring(String input) {
        char[] inputArray = input.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        int max = 0, secondmax = 0;
        char maxC=inputArray[0], secondMaxC=inputArray[1];
        for (int i = 0; i <= inputArray.length - 1; i++) {
            if (charMap.containsKey(inputArray[i])) {
                int c = charMap.get(inputArray[i]);
                c++;
                if (c > max) {
                    secondmax = max;
                    secondMaxC = maxC;
                    max = c;
                    maxC = inputArray[i];
                }
                charMap.put(inputArray[i], c);
            } else {
                int oc = 1;
                if (oc > max) {
                    secondmax = max;
                    secondMaxC = maxC;
                    max = oc;
                    maxC = inputArray[i];
                }
                charMap.put(inputArray[i], oc);
            }
        }
        System.out.println(charMap.toString());
        return secondMaxC;
    }


    public ArrayList<String> permute(String input) {
        ArrayList<String> out = new ArrayList<>();
        if (input.length() == 1) {
            out.add(input);
            return out;
        }

        String s = input.substring(0, 1);
        String r = input.substring(1);

        ArrayList<String> tempArray = permute(r);
        for (String s1 : tempArray) {
            out.addAll(combine(s1,s));
        }

        return out;
    }


    public ArrayList<String> combine(String in, String s) {

        ArrayList<String> out = new ArrayList<>();
        char[] tempChar = in.toCharArray();
        for (int j = 0; j <= tempChar.length; j++) {
            char[] chout = new char[tempChar.length + 1];
            int k = 0, l = 0;
            while (k <= tempChar.length - 1 || l<=tempChar.length) {
                if (j == l) {
                    chout[l] = s.charAt(0);
                    l++;
                } else {
                    chout[l] = tempChar[k];
                    l++;
                    k++;
                }
            }

            out.add(new String(chout));
        }

        return out;
    }



    public String scrambledSentence(String input, ArrayList<String> dict){
        String out = new String();
        String in = new String();
        char [] inputA = input.toCharArray();
            for(int i=0; i<=inputA.length-1; i++){
                in = in.concat(Character.toString(inputA[i]));
                for(String s : permute(in)){
                    if(dict.contains(s)){
                        out  = out.concat(s);
                        in = new String();
                        break;
                    }
                }
            }
        return out;
    }


    /*

    public boolean stringOrderingString(String input, String oin){
        boolean flag=false;

//whhello world!
//he! 0,1,2
        char [] inputArray = input.toCharArray();
        char [] oinArray = oin.toCharArray();
        Map< Character,Integer> oinMap = new HashMap<Character, Integer>();
        int k=0;
        for(char c: oinArray){
            oinMap.put(c,k);
            k++;
        }

        int currentPtr = 0;
        for(int i=0; i<inputArray.length-1; i++){
            if(oinMap.containsKey(inputArray[i])){
                if()
                if(currentPtr <= oinMap.get(inputArray[i])){
                    flag=true;

                }else {
                    flag=false;
                    break;
                }
            }

        }
        return flag;
    }
*/



}
