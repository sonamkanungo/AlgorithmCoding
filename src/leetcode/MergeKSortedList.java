package leetcode;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * Created by kanunso on 3/11/17.
 */
public class MergeKSortedList {

    public static void main(String[] args) {

        MergeKSortedList mergeKSortedList = new MergeKSortedList();
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(2);
        list1.add(3);
        list1.add(9);


        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.add(4);
        list2.add(5);
        list2.add(6);


        LinkedList<Integer> list3 = new LinkedList<Integer>();
        list3.add(4);
        list3.add(12);
        list3.add(15);


        LinkedList<Integer> list4 = new LinkedList<Integer>();
        list4.add(21);
        list4.add(31);
        list4.add(41);

        LinkedList<Integer> list5 = new LinkedList<Integer>();
        list5.add(1);
        list5.add(7);
        list5.add(14);

        ArrayList<LinkedList<Integer>> lists = new ArrayList<LinkedList<Integer>>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);
        lists.add(list5);

        System.out.println(mergeKSortedList.mergeKListTwobyTwo(lists));
        //System.out.println(mergeKSortedList.mergeKLists(lists));

    }

    public LinkedList<Integer> mergeKLists(ArrayList<LinkedList<Integer>> lists){
        LinkedList<Integer> output = new LinkedList<Integer>();
        PriorityQueue<HeapInteger> minHeap = new PriorityQueue<HeapInteger>();

        for(int i=0; i<=lists.size()-1; i++){
            minHeap.add(new HeapInteger(lists.get(i).removeFirst(),i));
        }
        while(!minHeap.isEmpty()){
            HeapInteger ele = minHeap.poll();
            output.add(ele.getData());
            if(!lists.get(ele.getK()).isEmpty()){
                minHeap.add(new HeapInteger(lists.get(ele.getK()).removeFirst(),ele.getK()));
            }
        }
        return output;
    }

    public LinkedList<Integer> mergeTwoSortedLists(LinkedList<Integer> list1, LinkedList<Integer> list2){
        LinkedList<Integer> output = new LinkedList<Integer>();
        while(!list1.isEmpty() && !list2.isEmpty()){
            if(list1.getFirst().compareTo(list2.getFirst())<0){
                output.add(list1.removeFirst());
            } else{
                output.add(list2.removeFirst());
            }
        }
        if(!list1.isEmpty()){
            output.addAll(list1);
        }else{
            output.addAll(list2);
        }
        return output;
    }

    public LinkedList<Integer> mergeKListTwobyTwo(ArrayList<LinkedList<Integer>> lists){
        if(lists.size()==1){
            return lists.get(0);
        }
        ArrayList<LinkedList<Integer>> mergedList = new ArrayList<LinkedList<Integer>>();
        for(int i=0; i<=lists.size()-1; i=i+2){
            if(i+1<=lists.size()-1) {
                LinkedList<Integer> result = mergeTwoSortedLists(lists.get(i), lists.get(i + 1));
                mergedList.add(result);
            }else{
                mergedList.add(lists.get(i));
            }
        }
        return mergeKListTwobyTwo(mergedList);

    }



}

//
