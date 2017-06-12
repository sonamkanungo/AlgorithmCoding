package leetcode;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kanunso on 3/21/17.
 */
public class WordLadderImpl {


    public static void main(String[] args) {

        WordLadderImpl wordLadderImpl = new WordLadderImpl();


        String start = "hit";
        String end = "cog";
        ArrayList<String> wordList = new ArrayList<String>();

        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");

        //wordLadderImpl.wordLadder(wordList, start, end);

        String s1 = "AACCGGTT";
        String e1 = "AACCGGTA";

        String [] ban1 = {"AACCGGTA"};

        String s = "AACCGGTT";

        String e = "AAACGGTA";

        String [] ban = {"AACCGGTA", "AACCGCTA", "AAACGGTA"};


        String s3= "AAAAACCC";
        String e3= "AACCCCCC";
        String [] ban3 = {"AAAACCCC", "AAACCCCC", "AACCCCCC"};

        String s4= "AAAAACCC";
        String e4= "AACCCCCC";
        String [] ban4 = {"AAAACCCE"};


        String s5 = "AACCGGTT";
        String e5 = "AACCGCTA";
        String [] ban5 = {"AACCGGTA","AACCGCTA","AAACGGTA"};

        System.out.println(wordLadderImpl.minMutation(s5,e5,ban5));

    }

    public void wordLadder(ArrayList<String> wordlist, String start, String end) {




    }


    public int minMutation(String start, String end,String [] bank) {
        if (start.equals(end)) {
            return 0;
        } else {
            String[] startArray = start.split("");
            for (int i = 0; i <= startArray.length - 1; i++) {
                String pat = getPattern(start, i, "[ACGT]");
                Pattern p = Pattern.compile(pat);
                for (int j=0; j<=bank.length-1;j++) {
                    String word = bank[j];
                    Matcher m = p.matcher(word);
                    if (m.matches()) {
                        bank[j] = "";
                        int count = minMutation(word, end, bank);
                        count++;
                        return count;
                    }
                }
            }
            return -1;
        }
    }

    public String getPattern(String s, int i, String p) {
        String[] sar = s.split("");
        sar[i] = p;
        StringBuilder str = new StringBuilder();
        for (int j = 0; j <= sar.length - 1; j++) {
            str.append(sar[j]);
        }
        //System.out.println("str = " + str.toString());
        return str.toString();

    }


}

