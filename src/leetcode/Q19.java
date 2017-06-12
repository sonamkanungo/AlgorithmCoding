package leetcode;

import linkedlists.LinkListImpl;
import linkedlists.Node;

/**
 * Created by kanunso on 4/9/17.
 */
public class Q19 {


    public static void main(String[] args) {
        LinkListImpl linkList = new LinkListImpl();
        linkList.insert(1);
        linkList.insert(2);
        linkList.insert(3);
        linkList.insert(4);
        linkList.insert(5);
        linkList.insert(6);
        Node temp = linkList.top;

        Q19 q19 = new Q19();
        q19.deleteNFromLast(temp, 2);
        linkList.traverse();



    }

    public int deleteNFromLast(Node temp, int n){
       if(temp.next==null){
           return 1;
       }
        int k = deleteNFromLast(temp.next, n);
        if(n==k){
            System.out.println(temp.data);
            temp.next = temp.next.next;
        }
        k++;
        return k;
    }

}
