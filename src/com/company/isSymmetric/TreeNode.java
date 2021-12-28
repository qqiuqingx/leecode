package com.company.isSymmetric;

public class TreeNode {

    public  int val;
    public   TreeNode left;
    public   TreeNode right;
    public TreeNode()  {};
    public TreeNode(int x) {
        this.val=x;
    };
    public TreeNode(int x, TreeNode left, TreeNode right){
        this.val=x;
        this.right=right;
        this.left=left;
    };

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
