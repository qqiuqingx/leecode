package com.company.searchBST;

/**
 * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 */
public class Solution {
    /**
     * 第一次做 忘记了二叉树特性
     * @param root
     * @param val
     * @return
     */
    public static TreeNode searchBST(TreeNode root, int val) {

        if (root==null) return null;
        if (root.val==val) return root;
        TreeNode treeNode=null;
        if (root.left!= null){
            treeNode=  searchBST(root.left,val);
        }
        if (treeNode != null ){
            return treeNode;
        }
        if (root.right!= null ){
            treeNode=   searchBST(root.right,val);
        }

        return treeNode;
    }


    /**
     * 通过比较大小
     * @param root
     * @param val
     * @return
     */
    public static TreeNode searchBST2(TreeNode root, int val) {
        if (root==null )return null;
        if (root.val==val) return root;
        return root.val<val?
            searchBST2(root.right,val):searchBST2(root.left,val);



    }


}
