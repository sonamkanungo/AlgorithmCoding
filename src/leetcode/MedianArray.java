package leetcode;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by kanunso on 3/14/17.
 */
public class MedianArray {

    public static void main(String[] args) {
        MedianArray medianArray = new MedianArray();

        medianArray.add(1);
        double m_1 = medianArray.median();
        System.out.println("m_1 = " + m_1);
        medianArray.add(2);
        double m0 = medianArray.median();
        System.out.println("m0 = " + m0);
        medianArray.add(2);
        double m1 = medianArray.median();
        System.out.println("m1 = " + m1);
        medianArray.add(3);
        double m2 = medianArray.median();
        System.out.println("m2 = " + m2);
        medianArray.add(3);
        double m3 = medianArray.median();
        System.out.println("m3 = " + m3);
        medianArray.add(5);
        double m4 = medianArray.median();
        System.out.println("m4 = " + m4);
        medianArray.add(6);
        double m5 = medianArray.median();
        System.out.println("m5 = " + m5);

    }

    PriorityQueue<Integer> largesttomiddle = new PriorityQueue<>(20, Collections.reverseOrder());
    PriorityQueue<Integer> smallesttomiddle = new PriorityQueue<>();

    public void add(Integer data){
        smallesttomiddle.add(data);

        if(smallesttomiddle.size()-largesttomiddle.size()>=2){
            largesttomiddle.add(smallesttomiddle.poll());
        }
    }

    public double median(){
        if(smallesttomiddle.size()==largesttomiddle.size()){
            return (smallesttomiddle.peek()+largesttomiddle.peek())/2.0;
        }else{
            return smallesttomiddle.peek();
        }
    }
}
