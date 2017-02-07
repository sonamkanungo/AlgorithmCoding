package stacks;

import com.sun.tools.classfile.Synthetic_attribute;

/**
 * Created by kanunso on 1/29/17.
 */
public class StackAPI {

    public static void main(String args[]) {
        StackImpl<Integer> stack = new StackImpl<Integer>();

        //stack.pop();
        //stack.push(4);
        //stack.push(5);
        //System.out.println(stack.peek());
        //System.out.println(stack.size());
        //stack.traverse();


        TowerofHanoi<Integer> towerofHanoi = new TowerofHanoi<Integer>();
        StackImpl<Integer> a = new StackImpl<Integer>();
        StackImpl<Integer> b = new StackImpl<Integer>();
        StackImpl<Integer> c = new StackImpl<Integer>();
        c.push(6);
        c.push(5);
        c.push(4);
        c.push(3);
        c.push(2);
        c.push(1);
        System.out.println("c.size() : "+c.size());
        towerofHanoi.solveHanoi(a,b,c);

        a.traverse();


    }
}
