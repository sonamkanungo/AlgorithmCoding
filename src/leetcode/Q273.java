package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by kanunso on 4/7/17.
 */
public class Q273 {

    private static HashMap<String, String> ones;
    private static HashMap<String, String> tens;
    private static ArrayList<String> den;

    public static void main(String[] args) {
        Q273 q273 = new Q273();
        ones = q273.createOnes();
        tens = q273.createTens();
        den = q273.denom();

        String o = integerToEnglish("10",0);
        System.out.println("o = " + o);


    }





    public static String integerToEnglish(String in, int precision){
        if(Integer.parseInt(in)<19){
            System.out.println("Here");
            Integer i = Integer.parseInt(in);
            String s = ones.get(in);
            System.out.println("s = " + s);
            return s;
        }
        if(in.length()==2){
            String [] inA = in.split("");
            String f = tens.get(Integer.parseInt(inA[0]));
            String l = integerToEnglish(inA[1],precision);
             return f + " " + l;
        }
        String o = new String();
        if(in.length()==3){
            String [] inA = in.split("");
            String f = ones.get(Integer.parseInt(inA[0]));
            String l = integerToEnglish(in.substring(1,in.length()),precision);
            o=  f + " Hundred " + l;
        }
        return o;
    }


    public HashMap<String, String> createOnes(){
        HashMap<String, String> ones = new HashMap<>();

        ones.put("0","");
        ones.put("1","One");
        ones.put("2","Two");
        ones.put("3","Three");
        ones.put("4","Four");
        ones.put("5","Five");
        ones.put("6","Six");
        ones.put("7","Seven");
        ones.put("8","Eight");
        ones.put("9","Nine");
        ones.put("10","Ten");
        ones.put("11","Eleven");
        ones.put("12","Twelve");
        ones.put("13","Thirteen");
        ones.put("14","Fourteen");
        ones.put("15","Fifteen");
        ones.put("16","Sixteen");
        ones.put("17","Seventeen");
        ones.put("18","Eighteen");
        ones.put("19","Nineteen");

        return ones;
    }

    public HashMap<String, String> createTens() {
        HashMap<String, String> tens = new HashMap<>();

        tens.put("2","Twenty");
        tens.put("3","Thirty");
        tens.put("4","Fourty");
        tens.put("5","Fifty");
        tens.put("6","Sixty");
        tens.put("7","Seventy");
        tens.put("8","Eighty");
        tens.put("9","Ninty");

        return tens;

    }

    public ArrayList<String> denom(){
        ArrayList<String> den = new ArrayList<>();
        den.add(0,"");
        den.add(1,"Thousand");
        den.add(2,"Million");
        den.add(3,"Billion");

        return den;
    }








    }
