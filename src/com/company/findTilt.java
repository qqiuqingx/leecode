package com.company;

import com.company.model.TreeNode;

/**
 * 给定一个二叉树，计算 整个树 的坡度 。
 *
 * 一个树的 节点的坡度 定义即为，该节点左子树的节点之和和右子树节点之和的 差的绝对值 。如果没有左子树的话，左子树的节点之和为 0 ；没有右子树的话也是一样。空结点的坡度是 0 。
 *
 * 整个树 的坡度就是其所有节点的坡度之和。
。
 */
public class findTilt {
    static int a=0;
    public static void main(String[] args) {
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode = new TreeNode(4, new TreeNode(2, treeNode3,treeNode5 ), new TreeNode(9, null, new TreeNode(7)));
        int tilt = new findTilt().findTilt(treeNode);
        System.out.println(tilt);


    }
    public int findTilt(TreeNode root) {
        set(root);


        return a;
    }





    private static int set(TreeNode root){
        if (root==null) return 0;

        int  leftC=set(root.left);


            int  rightC=set(root.right);
            a+=Math.abs(leftC - rightC);


        return root.val+leftC+rightC;
    }
}
