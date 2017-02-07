package ibm;

import java.util.ArrayList;

/**
 * Created by kanunso on 1/28/17.
 */
public class Node<E> {

    public E managerName;
    ArrayList<Node> emp;

    public Node(E name){
        this.managerName = name;
        this.emp = null;
    }
}
