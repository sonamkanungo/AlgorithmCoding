package round2;

import tree.BST;
import tree.Node;

import java.util.InputMismatchException;
import java.util.LinkedList;

/**
 * Created by kanunso on 5/17/17.
 */
public class Q102 {

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

        LinkedList<Node> in = new LinkedList<Node>();
        System.out.println("myTree.root.data = " + myTree.root.data);
        in.add(myTree.root);
        Q102 q102 = new Q102();
        LinkedList<LinkedList<Node>> output = q102.levelOrderTraversal(in);

        for(LinkedList<Node> nodeList : output){
            System.out.println();
            for(Node n : nodeList){
                System.out.print(n.data + ", ");
            }
        }

    }

    public LinkedList<LinkedList<Node>> levelOrderTraversal(LinkedList<Node> list){
        if(list.size()==0){
            LinkedList<LinkedList<Node>> o = new LinkedList<LinkedList<Node>>();
            return o;
        }
        LinkedList<Node> out = new LinkedList<>();
        for(Node l: list){
            if(l.right!=null){
                out.add(l.right);
            }
            if(l.left!=null){
                out.add(l.left);
            }
        }
        LinkedList<LinkedList<Node>> o = levelOrderTraversal(out);
        o.add(list);
        return o;
    }
}

/*
10,
4, 12,
2, 6, 11, 16,
5,
*/
