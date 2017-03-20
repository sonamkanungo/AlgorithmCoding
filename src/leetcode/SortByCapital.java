package leetcode;

import java.util.Comparator;

/**
 * Created by kanunso on 3/13/17.
 */
public class SortByCapital implements Comparator<IPONode> {

    @Override
    public int compare(IPONode o1, IPONode o2) {
        return o1.capital.compareTo(o2.capital);
    }

}
