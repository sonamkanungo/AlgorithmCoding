package leetcode;

/**
 * Created by kanunso on 3/11/17.
 */
public class HeapInteger implements Comparable<HeapInteger>{

    public Integer data;
    public Integer k;

    public HeapInteger(int data, int k){
        this.data = data;
        this.k =k;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Integer getK() {
        return k;
    }

    public void setK(Integer k) {
        this.k = k;
    }

    @Override
    public int compareTo(HeapInteger o) {
        return this.data.compareTo(o.data);
    }
}
