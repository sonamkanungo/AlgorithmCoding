package stacks;

/**
 * Created by kanunso on 1/29/17.
 */
public class TowerofHanoi<E> {


    public void solveHanoi(StackImpl<E> a, StackImpl<E> b, StackImpl<E> c){
        shuffle(a,b,c,c.size());
    }


    public void shuffle(StackImpl<E> a, StackImpl<E> b, StackImpl<E> c , int n){

        if(n==2){
            b.push(c.pop());
            a.push(c.pop());
            a.push(b.pop());
            return;
        }
        shuffle(b,a,c,n-1);// move n-1 to C to B
        a.push(c.pop());
        shuffle(a,c,b,n-1); // move n-1 from B to A
    }






}




