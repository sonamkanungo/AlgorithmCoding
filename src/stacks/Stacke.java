package stacks;

import java.util.ArrayList;

/**
 * Created by kanunso on 1/25/17.
 */
public class Stacke<E> {

    public ArrayList<E> stack = new ArrayList<E>();

    Integer top = -1;

   public void insert(E data){
       if(top==-1){
           top++;
           stack.add(0,data);
           return;
       }
       top++;
       stack.add(top,data);
   }

    public void delete(E data){
        if(top==-1){
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Item deleted : "+stack.get(top));
        top--;
        return;
    }

    public void traverse(){
        if(top == -1){
            System.out.println("Stack is empty");
            return;
        }
        for(int i=top; i<=0; i--){
            System.out.print(stack.get(i) + ", ");
        }
    }









}
