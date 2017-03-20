package priorityQueue;

import java.util.ArrayList;

/**
 * Created by kanunso on 3/10/17.
 */
public class MinHeap<E extends Comparable> {

    public static void main(String[] args) {
        MinHeap<Integer> minHeap = new MinHeap<Integer>();
        minHeap.insert(10);
        minHeap.insert(12);
        minHeap.insert(5);
        minHeap.insert(24);
        minHeap.insert(6);
        minHeap.insert(15);
        minHeap.insert(1);
        //minHeap.removeMin();
        //minHeap.removeMin();
        minHeap.traverse();
    }

    /*
        10
     12


          1
      6        5
  24   12  15      10


*/




    ArrayList<E> arrayHeap = new ArrayList<E>();
    int size = 0;


    public void insert(E data){
        arrayHeap.add(size,data);
        heapifyUp(size);
        size++;

    }

    public E peekMin(){
        return arrayHeap.get(0);
    }

    public E removeMin(){
        E temp = arrayHeap.get(0);
        arrayHeap.set(0, arrayHeap.get(size-1));
        size--;
        heapifyDown(0);
        return temp;
    }

    public void traverse(){
        System.out.println("size : "+size);
        for(int i=0; i<=size-1; i++)
        System.out.print(arrayHeap.get(i)+", ");
    }

    public void heapifyUp(int child){
        while(hasParent(child) && isParentGreater(child)){
            swap(child, getParentIndex(child));
            child = getParentIndex(child);
        }
    }

    public void heapifyDown(int parent){
        while (hasLeftChild(parent)) {
            E smallerChild = arrayHeap.get(getLeftChildIndex(parent));
            int smallerChildIndex = getLeftChildIndex(parent);
            if (hasRightChild(parent)) {
                if (arrayHeap.get(getRightChildIndex(parent)).compareTo(arrayHeap.get(getLeftChildIndex(parent))) < 0) {
                    smallerChild = arrayHeap.get(getRightChildIndex(parent));
                    smallerChildIndex = getRightChildIndex(parent);
                }
            }
            if (arrayHeap.get(parent).compareTo(smallerChild) > 0) {
                swap(parent, smallerChildIndex);
                parent = smallerChildIndex;
            } else{
                break;
            }
        }
    }

    public boolean hasParent(int child){
        return (getParentIndex(child)>=0);
    }

    public boolean hasLeftChild(int parent){
        return (getLeftChildIndex(parent)<=size-1);
    }

    public boolean hasRightChild(int parent){
        return (getRightChildIndex(parent)<=size-1);
    }

    public boolean isParentGreater(int child){
        return (arrayHeap.get(getParentIndex(child)).compareTo(arrayHeap.get(child))>0);
    }

    public int getParentIndex(int child){
        return (child-1)/2;
    }

    public int getLeftChildIndex(int parent){
        return parent*2 +1;
    }

    public int getRightChildIndex(int parent){
        return parent*2 +2;
    }

    public void swap(int index1, int index2){
        E temp = arrayHeap.get(index1);
        arrayHeap.set(index1,arrayHeap.get(index2));
        arrayHeap.set(index2, temp);
    }

}
