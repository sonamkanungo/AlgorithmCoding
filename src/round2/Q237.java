package round2;

import linkedlists.LinkListImpl;
import linkedlists.Node;

/**
 * Created by kanunso on 5/17/17.
 */
public class Q237 {

    public static void main(String[] args) {
        LinkListImpl linkListImpl = new LinkListImpl();
        linkListImpl.insert(1);
        linkListImpl.insert(2);
        linkListImpl.insert(3);
        linkListImpl.insert(4);
        linkListImpl.insert(5);
        linkListImpl.insert(10);
        System.out.println(linkListImpl);

        Q237 q237 = new Q237();

        q237.deleteNode(linkListImpl.top.next.next);
        System.out.println(linkListImpl);

    }

    public void deleteNode(Node mid){
        while(mid.next.next!=null){
            mid.data = mid.next.data;
            mid = mid.next;
        }
        mid.data = mid.next.data;
        mid.next=null;

    }
}
