package leetcode;

/**
 * Created by kanunso on 4/2/17.
 */
public class Q153 {

    public static void main(String[] args) {
        Q153 q153 = new Q153();
        int [] a = {5,6,7,0,1,2,3};
        int out  = q153.findMinInRotatedSortedArray(a,0,a.length-1);
        System.out.println("out = " + out);
    }

    // 4,5,6,7,0,1,2,3

    // 7,0,1,2,3

    // 7,0,1

    public int findMinInRotatedSortedArray(int [] a, int s, int e){

        int mid = (s+e)/2;
        if(e-s==1){
            return a[e];
        }
        if(a[s] < a[mid] && a[e] > a[mid]){
            return a[0];
        }
        if(a[s] < a[mid]){
            s = mid;
        }
        if(a[e] > a[mid]){
            e = mid;
        }
        return findMinInRotatedSortedArray(a,s,e);

    }
}
