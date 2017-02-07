package stacks;

import jdk.internal.dynalink.NoSuchDynamicMethodException;

/**
 * Created by kanunso on 1/29/17.
 */
public class StackImpl<E> {

    Node<E> top;

    public void push(E data){
        Node<E> newNode = new Node<E>(data);
        newNode.next = top;
        top = newNode;
    }

    public E pop(){
        if(top==null){
            System.out.println("Stack is empty");
            return null;
        }
        E topData = top.data;
        top = top.next;
        return topData;
    }

    public E peek(){
        return (top!=null)? top.data:null;
    }

    public void traverse(){
        if(top==null){
            System.out.println("Empty Stack");
            return;
        }
        Node<E> temp = top;
        while(temp!=null){
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Integer size(){
        Integer count = 0;
        Node temp = top;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public boolean isEmpty(){
        return (top==null)? true:false;
    }
}
