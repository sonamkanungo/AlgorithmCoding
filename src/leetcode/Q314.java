package leetcode;

import tree.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by kanunso on 5/13/17.
 */
public class Q314 {


    public static void main(String[] args) {
        Node root;
    }

    public LinkedList<LinkedList<Integer>> verticalOrder(Node temp, int vLevel, HashSet<Integer> visited) {
        LinkedList<LinkedList<Integer>> out = new LinkedList<>();
        LinkedList<Integer> vList = null;
        if(temp.left==null && temp.right==null){
            vList.add(temp.data);
            out.add(vLevel,vList);
            visited.add(temp.data);
            return out;
        }
        if(temp.left!=null){
            out.addAll(verticalOrder(temp.left, vLevel-1, visited));
        }
        if(temp.right!=null){
            out.addAll(verticalOrder(temp.right,vLevel+1, visited));
        }
        if(out.get(vLevel).isEmpty()){
            vList= new LinkedList<>();
            vList.add(temp.data);
            out.add(vLevel,vList);
            visited.add(temp.data);
        }else{
            if(!visited.contains(temp.data)) {
                vList = out.get(vLevel);
                vList.add(temp.data);
                out.add(vLevel,vList);
                visited.add(temp.data);
            }
        }
        return out;
    }

/*
    public LinkedList<LinkedList<Integer>> mergeList(LinkedList<LinkedList<Integer>> out , LinkedList<LinkedList<Integer>> list){
        for(LinkedList l : list){

        }
    }
    */
}
