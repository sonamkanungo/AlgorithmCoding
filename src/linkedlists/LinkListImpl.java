package linkedlists;

/**
 * Created by kanunso on 1/25/17.
 */
public class LinkListImpl {

    public Node top;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            // System.out.println("Data " +data+ " is inserted at top");
            return;
        }

        Node temp = top;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        //System.out.println("Data " +data+ " is inserted");
    }

    public boolean insertR(Node temp, int data) {
        if (temp.next == null) {
            temp.next = new Node(data);
            return true;
        }
        return insertR(temp.next, data);
    }

    public void search(int data) {
        if (top == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = top;
        int cnt = 0;
        while (temp != null) {
            if (temp.data == data) {
                break;
            }
            temp = temp.next;
            cnt++;
        }
        if (temp != null) {
            System.out.println("Data found at index : " + cnt);
        } else {
            System.out.println("Data not found");
        }
    }

    public void delete(int data) {
        if (top == null) {
            System.out.println("Linked List is empty");
            return;
        }

        Node temp = top;
        Node prev = null;


        while (temp != null) {
            if (temp.data == data) {
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        if (temp != null) {
            if (temp == top) {
                top = top.next;
            } else {
                prev.next = temp.next;
            }

            System.out.println("Node deleted with data : " + data);
        } else {
            System.out.println("Node not found");

        }

    }

    public void traverse() {
        if (top == null) {
            System.out.println("Linked List is empty");
            return;
        }
        System.out.println();
        Node temp = top;

        while (temp != null) {
            System.out.print(temp.data + ", ");
            temp = temp.next;
        }
        System.out.println();
    }

    public String toString() {
        if (top == null) {
            System.out.println("Linked List is empty");
            return "";
        }
        System.out.println();
        Node temp = top;
        String out = new String();
        while (temp != null) {
            out = out.concat(temp.data + ", ");
            temp = temp.next;
        }
        return out;

    }

    public void removeDuplicates(Node temp) {
        if (temp == null) {
            return;
        }
        Node temp1 = findSecondNode(temp, temp.data);
        if (temp1 != null) {
            temp1.next = temp1.next.next;
        }
        removeDuplicates(temp.next);
    }

    public Node findSecondNode(Node temp, int data) {
        if (temp == null) {
            return null;
        }
        if (temp.next != null) {
            if (temp.next.data == data) {
                return temp;
            } else {
                return findSecondNode(temp.next, data);
            }
        } else {
            return null;
        }

    }

    public void removeDuplicateWhile(){
        if(top == null){
            return;
        }




    }

    public LinkListImpl sumofLists(LinkListImpl list1, LinkListImpl list2){
        LinkListImpl out = new LinkListImpl();
        sum(list1.top, list2.top, out, 0);
        return out;
    }

    public void sum(Node temp1, Node temp2, LinkListImpl out, int rem) {
        int sum = 0;
        if (temp1 != null && temp2 != null) {
            sum = temp1.data + temp2.data + rem;
            if (sum > 9) {
                sum = sum % 10;
                rem = 1;
            }else{
                rem=0;
            }
            out.insert(sum);
            sum(temp1.next, temp2.next, out, rem);
        } else {
            if (temp1 != null) {
                sumNodes(temp1, out, rem);
            }
            if (temp2 != null) {
                sumNodes(temp2, out, rem);
            }
        }

    }

    public void sumNodes(Node temp, LinkListImpl out, int rem){
        int sum=0;
       while(temp!=null){
           sum = temp.data + rem;
           if(sum > 9){
               sum = sum%10;
               rem = 1;
           }
           out.insert(sum);
           temp=temp.next;
       }
    }
    public void findNodeFromLast(LinkListImpl ll, int n){
        Node out = null;
        nodeFromLast(ll.top, out, n);
        if(out!=null){
            System.out.println("Node is : "+ out.data);
        }else{
            System.out.println("n is too large");
        }
    }


    public int nodeFromLast(Node temp, Node out, int n){
        if(temp.next==null){
            return 1;
        }
        int k = nodeFromLast(temp.next, out, n);
        k++;
        if(n==k){
            System.out.print(temp.data);
            out = temp;
        }
        return k;
    }

    public void deleteFromMiddle(Node temp){
        if(temp.next.next==null){
            temp.data = temp.next.data;
            temp.next = null;
            return;
        }
        temp.data = temp.next.data;
        deleteFromMiddle(temp.next);
    }


    public void deleteSecondLast(Node temp){

    }

    public Node inPlaceReverse(Node temp, Node oldTop){
        if(temp.next==null){
            top=temp;
            oldTop.next=null;
            return temp;
        }
        Node t =  inPlaceReverse(temp.next, top);
        t.next = temp;
        return temp;
    }
// 1 3 2 5
    public void deleteAll(int data){
        if(top == null){
            System.out.println("Empty");
        }
        Node temp = top;
        Node prev = null;
        while(temp!=null){
            if(temp.data == data){
                if(temp==top){
                    top = top.next;
                    temp=temp.next;
                    continue;
                }
                prev.next=temp.next;
                temp=temp.next;
                continue;
            }
            prev = temp;
            temp = temp.next;
        }

    }


    public Node reverseLinkedList(Node temp, Node oldTop){
        if(temp.next==null){
            oldTop.next=null;
            top = temp;
            return temp;
        }
        Node t = reverseLinkedList(temp.next, top);
        t.next = temp;
        return temp;
    }

    /*
    public boolean isPalindrom(Node temp, Node start){
        if(temp.next ==null){
            return temp;
        }

        boolean flag = false;

        Node t =  isPalindrom(temp.next, start);

        if(t.data == start.data){
            flag == true;
        }
        return temp;


    }
    */

}
