package datastructure.tree;

//import sun.reflect.generics.tree.Tree;

public class TreeTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode forth = new TreeNode(4);
        root.right =forth;
        root.left=second;
        second.left=third;

        inOrderTraversal(root);

    }

    static void inOrderTraversal(TreeNode root){
        if(root== null){
            return;

        }
        inOrderTraversal(root.left);
        System.out.print("  " +root.data);
        inOrderTraversal(root.right);
    }
}


class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data =data;
        this.left=null;
        this.right=null;
    }
}