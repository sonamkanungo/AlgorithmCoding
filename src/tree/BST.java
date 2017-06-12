package tree;

import java.util.*;

/**
 * Created by kanunso on 1/8/17.
 */
public class BST {

    public Node root = null;

    public boolean search(int data) {
        if (root == null) {
            System.out.println("Tree is empty");
            return false;
        }
        Node temp = root;
        while (temp != null) {
            if (data == temp.data) {
                System.out.println("Element found : " + temp.data);
                return true;
            }
            if (data < temp.data) {
                temp = temp.left;
            } else {
                temp = temp.right;
            }
        }
        System.out.println("Element not found");
        return false;
    }


    // Also print the level at which element is inserted
    public void insert(int data) {
        Node newNode = new Node(data);
        int level = 0;
        if (root == null) {
            root = newNode;
        } else {
            Node parent = null;
            Node temp = root;
            boolean isLeftChild = false;
            while (temp != null) {
                if (data < temp.data) {
                    parent = temp;
                    temp = temp.left;
                    isLeftChild = true;
                    level++;
                } else {
                    parent = temp;
                    temp = temp.right;
                    isLeftChild = false;
                    level++;
                }
            }
            if (isLeftChild)
                parent.left = newNode;
            else
                parent.right = newNode;
        }

        //System.out.println("Element : "+ data +" inserted at : " + level);

    }

    public void levelOrderTraverse() {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
    }

    public void delete(int data) {
        if (root == null) {
            System.out.println("Tree is empty");
        } else {
            Node parent = null;
            Node temp = root;
            boolean isLeftChild = false;
            while (temp != null) {
                if (data == temp.data) {
                    break;
                }
                if (data < temp.data) {
                    parent = temp;
                    temp = temp.left;
                    isLeftChild = true;
                } else {
                    parent = temp;
                    temp = temp.right;
                    isLeftChild = false;
                }
            }

            if (temp.left != null && temp.right != null) {
                Node parent2 = temp;
                Node temp2 = temp.left;
                while (temp2.right != null) {
                    parent2 = temp2;
                    temp2 = temp2.right;
                }
                temp.data = temp2.data;
                parent = parent2;
                temp = temp2;
            }

            Node temp1 = (temp.left != null) ? temp.left : temp.right;

            if (parent.left == temp) {
                parent.left = temp1;
            } else {
                parent.right = temp1;
            }
            System.out.println(root.data);

        }

    }

    public void inOrderTraversal() {
        inOrder(root);
        System.out.println();
    }


    private void inOrder(Node temp) {
        if (temp == null) {
            return;
        }
        inOrder(temp.left);
        System.out.print(temp.data + ", ");
        inOrder(temp.right);
    }

    public void preOrderTraversal() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node temp) {
        if (temp == null) {
            return;
        }
        System.out.print(temp.data + ", ");
        preOrder(temp.left);
        preOrder(temp.right);
    }

    public void postOrderTraversal() {
        postOrder(root);
        System.out.println();
    }

    private void postOrder(Node temp) {
        if (temp == null) {
            return;
        }
        postOrder(temp.left);
        postOrder(temp.right);
        System.out.print(temp.data + ", ");
    }


    public void findBST() {
        if (root == null) {
            System.out.println("Tree is empty");
        }
        System.out.println("Tree is a BST ? : " + isBST(root,0,true));
    }

    private boolean isBST(Node temp, int grandParentdata, boolean isLeft) {
        if (temp.left == null && temp.right == null) {
            return true;
        }
        boolean leftflag = true;
        if (temp.left != null) {
            System.out.println("Left Arm : " + grandParentdata + " : " + temp.data + " : " + temp.left.data);
            if(temp==root) {
                if (temp.left.data < temp.data) {
                    leftflag = isBST(temp.left, temp.data, true);
                } else {
                    leftflag = false;
                }
            } else {
                if (isLeft) {
                    if (temp.left.data < temp.data && temp.left.data < grandParentdata) {
                        leftflag = isBST(temp.left, temp.data, true);
                    } else {
                        leftflag = false;
                    }
                } else {
                    if (temp.left.data < temp.data && temp.left.data > grandParentdata) {
                        leftflag = isBST(temp.left, temp.data, false);
                    } else {
                        leftflag = false;
                    }

                }
            }

        }
        boolean rightflag = true;
        if (temp.right != null) {
            System.out.println("Right Arm : " + grandParentdata + " : " + temp.data + " : " + temp.right.data);
            if(temp==root) {
                if (temp.left.data < temp.data) {
                    rightflag = isBST(temp.left, temp.data, true);
                } else {
                    rightflag = false;
                }
            } else {
                if (!isLeft) {
                    if (temp.right.data > temp.data && temp.right.data > grandParentdata) {
                        rightflag = isBST(temp.right, temp.data, false);
                    } else {
                        rightflag = false;
                    }
                } else {
                    if (temp.right.data > temp.data && temp.right.data < grandParentdata) {
                        rightflag = isBST(temp.right, temp.data, true);
                    } else {
                        rightflag = false;
                    }
                }
            }
        }
        System.out.println("leftflag : " + leftflag + " rightflag : " + rightflag);

        return leftflag && rightflag;
    }

    /*

    public boolean isHeightBalanced(Node temp){
        if(temp.left ==null && temp.right == null){
            return true;
        }
        boolean isLeftB = false, isRightB = false;
        if(Math.abs(getHeight(temp.left) - getHeight(temp.right)) > 1){
            return false;
        } else{
            if(temp.left !=null){
                isLeftB = isHeightBalanced(temp.left);
            }
            if(temp.right != null){
                isRightB = isHeightBalanced(temp.right);
            }
            return isLeftB && isRightB;
        }
    }
    */

    public int getHeight(Node temp){
        if(temp==null){
            return 0;
        }
        if(temp.right==null && temp.left==null){
            return 1;
        }
        int leftHeight =0, rightHeight = 0;
        if(temp.left!=null){
            leftHeight = getHeight(temp.left);
        }
        if(temp.right!=null){
            rightHeight = getHeight(temp.right);
        }
        leftHeight++;
        rightHeight++;
        if(leftHeight > rightHeight){
            return leftHeight;
        }else{
            return rightHeight;
        }


    }

    public int getSumofTree (Node temp){
        if(temp.left == null && temp.right == null){
            return temp.data;
        }
        int leftSum =0, rightSum=0;
        if(temp.left!=null){
            leftSum = getSumofTree(temp.left);
        }
        if(temp.right!=null){
            rightSum = getSumofTree(temp.right);
        }
        return temp.data + leftSum + rightSum;
    }


    public int getMinHeight(Node temp){
        if(temp.right == null & temp.left == null){
            return 1;
        }
        int leftHeight = 0, rightHeight=0;
        if(temp.left != null){
            leftHeight = getMinHeight(temp.left);
        }
        if(temp.right != null){
            rightHeight = getMinHeight(temp.right);
        }
        leftHeight++;
        rightHeight++;
        if(leftHeight < rightHeight){
            return leftHeight;
        }else
            return rightHeight;
    }



    public int getMaxHeight(Node temp){
        if(temp.right == null & temp.left == null){
            return 1;
        }
        int leftHeight = 0, rightHeight=0;
        if(temp.left != null){
            leftHeight = getMaxHeight(temp.left);
        }
        if(temp.right != null){
            rightHeight = getMaxHeight(temp.right);
        }
        leftHeight++;
        rightHeight++;
        if(leftHeight > rightHeight){
            return leftHeight;
        }else
            return rightHeight;
    }

    public boolean isHeightBalanced(Node temp){
        int minHeight = getMinHeight(temp);
        int maxHeight = getMaxHeight(temp);

        if(maxHeight - minHeight <= 1){
            return true;
        } else
            return false;
    }


    public boolean isCompleteBinaryTree(Node temp){
        if(temp.left == null && temp.right==null){
            return true;
        }
        if(temp.left!= null && temp.right!=null){
            return isCompleteBinaryTree(temp.left) && isCompleteBinaryTree(temp.right);
        }else
            return false;
    }


    public boolean areTreeMatching(Node temp1, Node temp2){
        if((temp1.left == null && temp1.right == null) && (temp2.left==null && temp1.right==null)){
            if(temp1.data == temp2.data) {
                return true;
            }else {
                return false;
            }
        }
        boolean left=false, right=false;
        if(temp1.left!=null && temp2.left!=null){
            if(temp1.data == temp2.data) {
                left = areTreeMatching(temp1.left, temp2.left);
            }
        } else if(temp1.left==null && temp2.left==null) {
            left = true;
        }

        if(temp1.right!=null && temp2.right!=null ){
            if(temp1.data == temp2.data) {
                right = areTreeMatching(temp1.right, temp2.right);
            }
        }else if(temp1.right==null && temp2.right==null) {
            right = true;
        }

        return left && right;




    }

    public void getSum(Node temp, int [] array, int balance, int index, int j){

        //adjust the balance for current node, add current node to array list
        //System.out.println("j : "+ j + "temp.data : "+ temp.data);
        array[j] = temp.data;

        balance = balance-temp.data;
        //System.out.println("Node : " + temp.data + "Balance : "+ balance);
        if(balance < 0){
            balance = balance+array[index];
            index++;
            //System.out.println("Balance : "+ balance);

        }
       if(balance == 0){
            for(int i=index; i<=array.length-1; i++){
                System.out.print(array[i] + ",");
            }
        }

        int [] arrayleft = new int[array.length+1];
        int [] arrayright = new int[array.length+1];
        for(int k=0; k<=array.length-1; k++){
            arrayleft[k] = array[k];
            arrayright[k] = array[k];

        }
        j++;
        if(temp.left != null){
            getSum(temp.left, arrayleft, balance, index, j);
        }
        if(temp.right != null){
            getSum(temp.right, arrayright, balance, index, j);
        }
    }

    public void printEachLevelofTree(){
        LinkedList<Node> nodes = new LinkedList<Node>();
        ArrayList<LinkedList<Node>> output = new ArrayList<LinkedList<Node>>();
        output = printEachLevel(nodes);
        System.out.println(output.size());
        for(LinkedList<Node> nodeList : output){
            System.out.println();
            for(Node n : nodeList){
                System.out.print(n.data + ", ");
            }
        }

    }

    public ArrayList<LinkedList<Node>> printEachLevel(LinkedList<Node> listofParents){
        ArrayList<LinkedList<Node>> output = new ArrayList<LinkedList<Node>>();


        if(listofParents.isEmpty()){
            listofParents.add(root);
            output.add(listofParents);
        }

        LinkedList<Node> listofChilden = new LinkedList<Node>();
        for(Node parent : listofParents){
            if(parent.left!=null){
                listofChilden.add(parent.left);
            }
            if(parent.right!=null){
                listofChilden.add(parent.right);
            }
        }
        output.add(listofChilden);
        if(!listofChilden.isEmpty()){
            output.addAll(printEachLevel(listofChilden));
        }
        return output;

    }


    public void inOrderSuccessor(int data){
        if(root==null){
            System.out.print("Tree is empty");
        }

        Node temp = root;
        Node parent = null;
        Node grandparent = null;
        boolean isLeftChild = false;

        while(temp.data != data){
            grandparent = parent;
            parent = temp;
            isLeftChild = (data < temp.data)? true:false;
            temp = (data < temp.data)? temp.left: temp.right;
        }


        if(temp.right!=null){
            Node temp2 = temp.right;
            if(temp2.left!=null){
                while(temp2.left!=null){
                    temp2 = temp2.left;
                }
            }
            System.out.println("Inorder successor is right child of the node : "+ temp2.data);
        }else {
            if (isLeftChild) {
                System.out.println("Inorder successor is parent : " + parent.data);
            } else {
                System.out.println("Inorder Successor is granparent : " + grandparent.data); // To be revisited on Jan 23
            }

        }

    }

// 10, 20, 30, 35, 40, 45, 50, 55, 60, 70, 80, 90, 100

    public void getMinimalHeightTree(BST tree, int[] input){
        if(input.length == 0){
            //System.out.println("Array is empty");
            return;
        }
        if(input.length == 1) {
            tree.insert(input[0]);
            return;
        } else {
            int mid = input.length / 2;
            tree.insert(input[mid]);
            int [] leftInput = new int[mid];
            int [] rightInput = new int[input.length-mid-1];
            for(int i =0; i<=mid-1; i++) {
                leftInput[i] = input[i];
            }
            for(int j=mid+1,k=0; j<=input.length-1; j++, k++) {
                rightInput[k] = input[j];
            }
            getMinimalHeightTree(tree, leftInput);
            getMinimalHeightTree(tree, rightInput);
        }
        }

    public int numberOfNodesBetween(Node temp1, Node temp2){
        if(root == null){
            return 0;
        }
        ArrayList<Node> path1 = new ArrayList<Node>();
        Node temp = root;
        while(temp.data != temp1.data){
            temp = (temp1.data < temp.data)? temp.left : temp.right;
            path1.add(temp);
        }
        int distance = -1;
        for(int i=path1.size()-1; i>=0; i--){
            int dst = distanceInSubtree(path1.get(i),temp2);
            if(dst > -1) {
                dst = dst + path1.size() - i;
                distance = dst;
                break;
            }
        }
        return distance;
    }

    public int distanceInSubtree(Node root, Node temp2){
        if(root == temp2){
            return 0;
        }
        if(root == null){
            return -1;
        }
        root = (temp2.data < root.data)? root.left : root.right;
        return 1+distanceInSubtree(root, temp2);
    }



    public ArrayList<String> getAllpathfromRoot(Node temp){
        ArrayList<String> out = new ArrayList<String>();
        if(temp.left == null && temp.right == null){
            int o = temp.data;
            out.add(Integer.valueOf(o).toString());
            return out;
        }
        ArrayList<String>left = new ArrayList<String>();
        ArrayList<String>right = new ArrayList<String>();
        if(temp.left!=null){
            left = getAllpathfromRoot(temp.left);
            for(String o : left){
                String s = Integer.valueOf(temp.data).toString().concat(" <= ").concat(o);
                out.add(s);
            }
        }
        if(temp.right!=null){
            right = getAllpathfromRoot(temp.right);
            for(String o : right){
                String s = Integer.valueOf(temp.data).toString().concat(" <= ").concat(o);
                out.add(s);
            }
        }
        return out;
    }










//          10
//     4            12
//  2      6     11     16
//       5            15  20
//









//48 -> 38 -> 26 -> 12 -> 10
}


