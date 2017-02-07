package linkedlists;

/**
 * Created by kanunso on 1/25/17.
 */
public class LinkListAPI {

    public static void main(String args[]) {

        LinkListImpl linkListImpl = new LinkListImpl();
        linkListImpl.insert(1);
        linkListImpl.insert(2);
        linkListImpl.insert(3);
        linkListImpl.insert(4);
        linkListImpl.insert(5);
        linkListImpl.insert(10);


        System.out.println(linkListImpl);


































/*

        linkListImpl.inPlaceReverse(linkListImpl.top, linkListImpl.top);

        linkListImpl.traverse();
        linkListImpl.deleteAll(5);

        linkListImpl.traverse();
        linkListImpl.search(5);
        linkListImpl.delete(1);
        linkListImpl.search(5);
        System.out.print(linkListImpl.toString());
        linkListImpl.insertR(linkListImpl.top, 8);
        linkListImpl.insertR(linkListImpl.top, 8);





        System.out.println(linkListImpl);
        linkListImpl.removeDuplicates(linkListImpl.top);
        linkListImpl.findNodeFromLast(linkListImpl, 5);
        linkListImpl.deleteFromMiddle(linkListImpl.top.next.next.next.next);
        System.out.print(linkListImpl);

        LinkListImpl list1 = new LinkListImpl();
        list1.insert(3);
        list1.insert(1);
        list1.insert(5);
        //list1.insert(6);

        LinkListImpl list2 = new LinkListImpl();
        list2.insert(5);
        list2.insert(9);
        list2.insert(2);
        list2.insert(6);
        //System.out.println(list2);



        //System.out.println(linkListImpl.sumofLists(list1,list2));
*/
    }

}
