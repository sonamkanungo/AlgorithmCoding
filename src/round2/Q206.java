package round2;

import linkedlists.LinkListImpl;
import linkedlists.Node;

/**
 * Created by kanunso on 5/17/17.
 */
public class Q206 {



    public static void main(String[] args) {
        LinkListImpl linkListImpl = new LinkListImpl();
        linkListImpl.insert(1);
        linkListImpl.insert(2);
        linkListImpl.insert(3);
        linkListImpl.insert(4);
        linkListImpl.insert(5);
        linkListImpl.insert(10);

        Node top = linkListImpl.top;
        System.out.println("linkListImpl = " + linkListImpl);

        Q206 q206 = new Q206();
        //q206.reverseLinkedList(top, top);
        System.out.println("linkListImpl = " + linkListImpl);


    }



}
