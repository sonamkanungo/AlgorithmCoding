package tries;

import java.util.HashMap;

/**
 * Created by kanunso on 2/2/17.
 */
public class Node {

    public HashMap<Character, Node> children;

    public boolean isCompleteWord;

    public Node(){
        HashMap<Character, Node> children = new HashMap<Character, Node>();
        this.children = children;
        this.isCompleteWord = false;
    }



}
