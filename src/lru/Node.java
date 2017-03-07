package lru;

/**
 * Created by kanunso on 2/11/17.
 */
public class Node<E> {

    E wps;

    Node<E> next;

    Node<E> prev;

    public Node(E wps) {
        this.wps = wps;
        this.next = null;
        this.prev = null;
    }
}