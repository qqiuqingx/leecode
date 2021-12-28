package com.company.isSymmetric;


import java.util.LinkedList;
import java.util.Queue;

/**
 * 对称二叉树
 *
 * 给定一个二叉树，检查它是否是镜像对称的。
 *
 *
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *
 *
 * 1.怎么判断一棵树是不是对称二叉树？ 答案：如果所给根节点，为空，那么是对称。如果不为空的话，当他的左子树与右子树对称时，他对称
 *
 * 2.那么怎么知道左子树与右子树对不对称呢？在这我直接叫为左树和右树 答案：如果左树的左孩子与右树的右孩子对称，左树的右孩子与右树的左孩子对称，那么这个左树和右树就对称。
 *
 * 仔细读这句话，是不是有点绕？怎么感觉有一个功能A我想实现，但我去实现A的时候又要用到A实现后的功能呢？
 *
 * 当你思考到这里的时候，递归点已经出现了： 递归点：我在尝试判断左树与右树对称的条件时，发现其跟两树的孩子的对称情况有关系。
 *
 * 想到这里，你不必有太多疑问，上手去按思路写代码，函数A（左树，右树）功能是返回是否对称
 *
 * def 函数A（左树，右树）： 左树节点值等于右树节点值 且 函数A（左树的左子树，右树的右子树），函数A（左树的右子树，右树的左子树）均为真 才返回真
 */
class Solution {

    public static boolean isSymmetric(TreeNode root) {

        return isS(root,root);
    }

    private  static boolean isS(TreeNode root,TreeNode root1){
        if (root==null&&root1==null) return true;
        if (root==null||root1==null) return false;
        return root.val==root1.val&&isS(root.left,root1.right)&&isS(root.right,root1.left);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(2, new TreeNode(4), new TreeNode(3)));
        TreeNode treeNode2 = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3)));

        TreeNode treeNode1 = new TreeNode(1, new TreeNode(2, null, null), new TreeNode(2, null, null));
        boolean symmetric = isSymmetric(treeNode1);
        System.out.println(symmetric);


    }

    /**
     * 迭代
     * @param root
     * @param root1
     * @return
     */
    private  static boolean isS2(TreeNode root,TreeNode root1){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        queue.offer(root1);
        while (queue.isEmpty()){
            root = queue.poll();
            root1 = queue.poll();
            if (root==null &&root1==null){
                return true;
            }
            if ((root==null||root1==null)||(root.val!= root1.val)){
                return false;
            }
            queue.offer(root.left);
            queue.offer(root1.right);

            queue.offer(root.right);
            queue.offer(root1.left);
        }

        return true;
    }
}