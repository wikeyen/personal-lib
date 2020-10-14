package com.lib.algorithm.tree;

import com.lib.algorithm.dto.TreeNode;

import java.util.Stack;
import java.util.stream.Collectors;

public class DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key == root.val) {
            return remove(root);
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        int count = 0;

        System.out.println(stack.stream().map(n -> n.val).collect(Collectors.toList()));
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            delete(cur, stack, key);

            if (count < 100) {
                System.out.println(stack.stream().map(n -> n.val).collect(Collectors.toList()));
                count++;
            }
        }

        return root;
    }

    private void delete(TreeNode node, Stack<TreeNode> stack, int key) {
        if (node.left != null) {
            if (node.left.val == key) {
                node.left = remove(node.left);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        if (node.right != null) {
            if (node.right.val == key) {
                node.right = remove(node.right);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
    }

    private TreeNode remove(TreeNode node) {
        if (node.right == null && node.left == null) {
            return null;
        }
        if (node.right == null) {
            return node.left;
        }
        if (node.left == null) {
            return node.right;
        }

        TreeNode newNode = smallestInRightSubTree(node.right);
        newNode.left = node.left;
        if (newNode != node.right) {
            newNode.right = node.right;
        }
        node.left = null;
        node.right = null;
        return newNode;
    }

    private TreeNode smallestInRightSubTree(TreeNode rightSubTree) {
        if (rightSubTree == null) {
            return null;
        }

        TreeNode smallestInRightSubTree = rightSubTree;
        TreeNode fatherOfSmallest = rightSubTree;
        while (smallestInRightSubTree.left != null) {
            if (smallestInRightSubTree.left.left == null) {
                fatherOfSmallest = smallestInRightSubTree.left;
            }
            smallestInRightSubTree = smallestInRightSubTree.left;
        }

        fatherOfSmallest.left = smallestInRightSubTree.right;
        smallestInRightSubTree.right = null;
        return smallestInRightSubTree;
    }
}