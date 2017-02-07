package tries;

import java.util.HashMap;

/**
 * Created by kanunso on 2/2/17.
 */
public class TriesImpl {

    Node root;


    public void insert(String s){
        char [] charArray = s.toCharArray();
        Node temp;
        int i=0;
        if(root == null) {
            root = new Node();
            root.children.put(charArray[0],new Node());
            temp = root.children.get(charArray[0]);
            i++;
        } else {
            temp = root;
        }
        while(i<=charArray.length-1){
            if (!temp.children.containsKey(charArray[i])) {
               temp.children.put(charArray[i], new Node());
            }
            if(i==charArray.length-1){
                temp.isCompleteWord = true;
            }
            temp = temp.children.get(charArray[i]);
            i++;
        }
    }


    public boolean search(String s) {
        char[] charArray = s.toCharArray();
        Node temp = root;
        boolean flag = true;
        if (root == null) {
            System.out.println("Empty Trie");
            return false;
        }
        int i = 0;
        while (i <= charArray.length - 1) {
            if (temp.children.containsKey(charArray[i])) {
                System.out.print(charArray[i]);
                if(i == charArray.length - 1){
                    if(!temp.isCompleteWord){
                        flag=false;
                        break;
                    }
                }
                temp = temp.children.get(charArray[i]);
            } else{
                flag = false;
                break;
            }
            i++;
        }

        System.out.println();
        return flag;
    }
}
