package leetcode;

/**
 * Created by kanunso on 4/2/17.
 */
public class Q4 {

    public static void main(String[] args) {
        Q4 q4 = new Q4();
        int [] a = {1,2,9,10,11};
        int [] b = {2,2,10,12,13};

        double out = q4.findMedianInTwoSortedArrays(a,0,a.length-1,b,0,b.length-1);
        System.out.println("out = " + out);
    }


    public double findMedianInTwoSortedArrays(int[] a, int sa, int ea, int [] b, int sb, int eb){
        int m1 = (sa+ea)/2;
        int m2 = (sb+eb)/2;
        // base condition for size == 2
        if(ea-sa==1 && eb-sb==1){
            return (Math.max(a[sa],b[sb])+Math.min(a[ea],b[eb]))/2.0;
        }
        // base condition when both mid are same
        if(a[m1]==b[m2]){
            return a[m1];
        }
        if(a[m1]<b[m2]){
            sa = m1;
            eb = m2;
        } else{
            sb = m2;
            ea = m1;
        }
        return findMedianInTwoSortedArrays(a, sa, ea, b, sb, eb);

    }
}

// a = 2 8
// b = 5,6