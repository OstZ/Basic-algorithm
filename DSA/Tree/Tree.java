package DSA.Tree;

public class Tree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    public static TreeNode buildBinTree(int[] arr){
        TreeNode myRoot = null;
        for (int i : arr) {
            myRoot = insert(myRoot, i);
        }
        return myRoot;
    }
    public static TreeNode binSearch(TreeNode root, int val){
        if(root != null){
            if(root.val > val) return binSearch(root.left, val);
            else if(root.val == val) return root;
            else return binSearch(root.right, val);
        }
        return null;
    }
    public static TreeNode insert(TreeNode root, int val){
        if(root != null){
            if(root.val > val) root.left = insert(root.left, val);
            else if(root.val == val) return root;
            else root.right = insert(root.right, val);
        } else {
            root = new TreeNode();
            root.val = val;
        }
        return root;
    }
    public static void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.println(root.val);
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 6, 7, 9};
        TreeNode root = buildBinTree(arr);
        TreeNode res = insert(root, 10);
        inOrder(res);
    }
}
