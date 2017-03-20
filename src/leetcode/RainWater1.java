package leetcode;

/**
 * Created by kanunso on 3/11/17.
 */
public class RainWater1 implements Comparable<RainWater1>{

    public Integer value;
    Integer index;

    public RainWater1(Integer value, int index){
        this.value=value;
        this.index=index;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @Override
    public int compareTo(RainWater1 o) {
        return value.compareTo(o.value);
    }
}
