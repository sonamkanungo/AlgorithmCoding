package leetcode;

import java.util.*;

/**
 * Created by kanunso on 4/24/17.
 */
public class Q269 {

    public static void main(String[] args) {

        ArrayList<String> dict = new ArrayList<>();
        dict.add(0, "wrt");
        dict.add(1, "wrf");
        dict.add(2, "er");
        dict.add(3, "ett");
        dict.add(4, "rftt");

        ArrayList<String> dic = new ArrayList<>();
        dic.add(0, "x");
        dic.add(1, "z");

        Q269 q269 = new Q269();
        String o = q269.returnOrder(dic);
        System.out.println("o = " + o);

    }

    public String returnOrder(ArrayList<String> dict){
        HashMap<Character, ArrayList<Character>> map = new HashMap<>();
        for(int i=0; i<=dict.size()-2; i++){
            map = buildGraph(dict.get(i), dict.get(i+1), map);
        }
        System.out.println("map = " + map);

        String temp = new String();
        HashSet<Character> visited = new HashSet<>();
        for(Character start : map.keySet()){
            if(!visited.contains(start)){
                temp = sortTillEnd(start,map, visited);
                System.out.println("visited = " + visited);
            }
        }
        return temp;
    }

    public  HashMap<Character, ArrayList<Character>> buildGraph(String first, String second, HashMap<Character, ArrayList<Character>> map){
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        int i=0;
        while(firstArray[i] == secondArray[i]){
            i++;
        }
        ArrayList<Character> value  = (map.containsKey(firstArray[i])) ? map.get(firstArray[i]): new ArrayList<Character>();
        value.add(secondArray[i]);
        map.put(firstArray[i], value);
        return map;
    }


    public String sortTillEnd(Character start, HashMap<Character, ArrayList<Character>> map, HashSet<Character> visited){
        String out = new String();
        if(map.containsKey(start)){
            ArrayList<Character> children = map.get(start);
            for(Character child: children){
                out = out.concat(sortTillEnd(child, map, visited));
            }
        }
        out = start.toString().concat(out);
        visited.add(start);
        System.out.println("out = " + out);
        return out;
    }

}
