package twopointer;

import leetcode.TrappingRainWater;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by kanunso on 3/16/17.
 */
public class TwoPointerImpl {
    public static void main(String[] args) {

        TwoPointerImpl twoPointer = new TwoPointerImpl();
        String S = "ADOBECODEBANC";
        String T = "ABC";

        String sou = "K";
        twoPointer.minimumWindowSubstring(S, T);
        System.out.println("sou = " + sou);
    }

    public void minimumWindowSubstring(String in, String t) {
        char[] input = in.toCharArray();
        char[] tin = t.toCharArray();

        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
        for(Character t1: tin){
            tMap.put(t1,1);
        }
        int start = -1, end = 0,minLength = Integer.MAX_VALUE;
        String output = "";

    }
}
