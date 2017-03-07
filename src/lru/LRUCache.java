package lru;

import java.util.HashMap;

/**
 * Created by kanunso on 2/11/17.
 */
public class LRUCache<E> {

    Node<E> start;

    Node<E> end;

    HashMap<E, Node> hashMap = new HashMap<E, Node>();

    Integer capacity;

    public LRUCache(Integer capacity) {
        this.capacity = capacity;
    }


    public E fetch(E data) {
        if (hashMap.containsKey(data)) {
            delete(hashMap.get(data));
            insertAtStart(hashMap.get(data));
        } else {
            Node temp = new Node(data);
            if (hashMap.size() < capacity) {
                insertAtStart(temp);
                hashMap.put(data, temp);
            } else {
                hashMap.remove(end.wps);
                delete(end);
                insertAtStart(temp);
                hashMap.put(data, temp);
            }
        }
        return data;
    }


    public void insertAtStart(Node temp) {
        if (start == null) {
            start = temp;
            end = temp;
            return;
        }
        start.prev = temp;
        temp.next = start;
        start = start.prev;
    }


    public void delete(Node temp) {
        if (start == end) {
            start = null;
            end = null;
            return;
        }
        if (temp == start) {
            start = start.next;
            start.prev = null;
            return;
        }
        if (temp == end) {
            end = end.prev;
            end.next = null;
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    public void traverse() {
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.wps);
            temp = temp.next;
        }
        System.out.println();
    }
}
