package sorting;

/**
 * Created by kanunso on 1/3/17.
 */
public class RunAll {

    public static void main(String [] args){

        int[] array = {1, 12, 3, 4, 7, 2};

       // sort(array);

        SelectionSort selectionSort = new SelectionSort();
        System.out.println("Selection Sort : ");
        for(int i : selectionSort.sort(array)){
            System.out.print(i + ", ");
        }
        System.out.println();

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Bubble Sort");
        for(int i : bubbleSort.sort(array)){
            System.out.print(i + ", ");
        }
        System.out.println();

        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Insertion Sort");
        for(int i : insertionSort.sort(array)){
            System.out.print(i + ", ");
        }
        System.out.println();

        QuickSort quickSort = new QuickSort();
        System.out.println("Quick Sort");
        for(int i : quickSort.sort(array)){
            System.out.print(i + ", ");
        }
        System.out.println();

        MergeSort mergeSort = new MergeSort();
        System.out.println("Merge Sort");
        for(int i : mergeSort.sort(array)){
            System.out.print(i + ", ");
        }
        System.out.println();
    }

}
