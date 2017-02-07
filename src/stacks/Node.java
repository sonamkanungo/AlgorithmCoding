package stacks;

/**
 * Created by kanunso on 1/29/17.
 */
public class Node<E> {

    public E data;

    public Node<E> next;

    public Node(E data){
        this.data = data;
        this.next = null;
    }
}
