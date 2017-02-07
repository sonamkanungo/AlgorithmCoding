package tree;

import java.util.LinkedList;

/**
 * Created by kanunso on 1/8/17.
 */
public class TreeImpl {

    public static void main(String [] args){

        BST myTree = new BST();


        myTree.insert(10);
        myTree.insert(4);
        myTree.insert(2);

        myTree.insert(6);
        myTree.insert(5);
        myTree.insert(12);
        myTree.insert(11);
        myTree.insert(16);
        //myTree.insert(20);
        //System.out.println(myTree.root.left.left.data);
        //System.out.println(myTree.root.left.right.left.data);
        int d = myTree.numberOfNodesBetween(myTree.root.left.left, myTree.root.left.right);
        System.out.print("Distance is : "+ d);
        //myTree.inOrderTraversal();

        //BST myTree1 = new BST();
        //myTree1.insert(10);
        //myTree1.insert(12);
        //myTree1.insert(11);
        //myTree1.insert(4);
        //myTree1.insert(2);
        myTree.preOrderTraversal();
        //myTree.inOrderTraversal();
        //myTree.postOrderTraversal();
        //myTree.delete(15);
        //myTree.delete(10);
        //myTree.inOrderTraversal();
        //myTree.findBST();
       // System.out.println(myTree.isHeightBalanced(myTree.root));
        //System.out.println(myTree.getSumofTree(myTree.root));
        //System.out.println(myTree.getMinHeight(myTree.root));
        //System.out.println(myTree.getMaxHeight(myTree.root));
        //System.out.println(myTree.isHeightBalanced(myTree.root));
        //System.out.println(myTree.isCompleteBinaryTree(myTree.root));
        //System.out.println(myTree.areTreeMatching(myTree.root,myTree1.root));
        //int [] array = new int[1];
        //myTree.getSum(myTree.root, array, 48, 0, 0);
        //myTree.printEachLevelofTree();

        //myTree.inOrderSuccessor(4);

        //BST newTree = new BST();
        //int [] inp = {10, 20, 30, 35, 40, 45, 50, 55, 60, 70, 80, 90, 100};
        //myTree.getMinimalHeightTree(newTree, inp);
        //newTree.printEachLevelofTree();
        //newTree.isHeightBalanced(newTree.root);
        //newTree.findBST();





    }
}
