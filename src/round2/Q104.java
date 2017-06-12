package round2;

import tree.*;


/**
 * Created by kanunso on 5/17/17.
 */
public class Q104 {

    public static void main(String[] args) {
        BST myTree = new BST();


        myTree.insert(10);
        myTree.insert(4);
        myTree.insert(2);
        myTree.insert(6);
        myTree.insert(5);
        myTree.insert(12);
        myTree.insert(11);
        myTree.insert(16);

        Q104 q104 = new Q104();
        System.out.println(q104.maxDepth(myTree.root));

    }

    public int maxDepth(Node temp){
        if(temp.left==null && temp.right==null) {
            return 1;
        }
        int leftH = (temp.left!=null)? maxDepth(temp.left)+1:0;
        int righH = (temp.right!=null)?maxDepth(temp.right)+1:0;
        return Math.max(leftH, righH);
        }


}
