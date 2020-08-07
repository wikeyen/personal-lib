package com.lib.algorithm.tree;

import com.lib.dto.TreeNode;
import com.lib.utils.ElementUtils;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeleteNodeInBSTTest {
    @Test
    void should_return_5_4_6_2_null_null_7() {
        TreeNode root = ElementUtils.buildBinaryTree(Arrays.asList("5", "3", "6", "2", "4", "null", "7"));

        DeleteNodeInBST deleteNodeInBST = new DeleteNodeInBST();
        TreeNode newRoot = deleteNodeInBST.deleteNode(root, 3);

        StringBuilder sb = new StringBuilder();

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(newRoot);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            sb.append(cur.val);
            sb.append(",");

            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }

        assertEquals("5,4,6,2,7,", sb.toString());
    }

    @Test
    void should_return_1() {
        TreeNode root = ElementUtils.buildBinaryTree(Arrays.asList("1", "null", "2"));

        DeleteNodeInBST deleteNodeInBST = new DeleteNodeInBST();
        TreeNode newRoot = deleteNodeInBST.deleteNode(root, 2);

        StringBuilder sb = new StringBuilder();

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(newRoot);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            sb.append(cur.val);
            sb.append(",");

            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }

        assertEquals("1,", sb.toString());
    }

    @Test
    void should_return_3_2_4() {
        TreeNode root = ElementUtils.buildBinaryTree(Arrays.asList("3", "2", "4", "1"));

        DeleteNodeInBST deleteNodeInBST = new DeleteNodeInBST();
        TreeNode newRoot = deleteNodeInBST.deleteNode(root, 1);

        StringBuilder sb = new StringBuilder();

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(newRoot);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            sb.append(cur.val);
            sb.append(",");

            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }

        assertEquals("3,2,4,", sb.toString());
    }

    @Disabled
    @Test
    void should_remove_33() {
        TreeNode root = ElementUtils.buildBinaryTree(Arrays.asList("2", "0", "33", "null", "1", "25", "40", "null", "null", "11", "31", "34", "45", "10", "18", "29", "32", "null", "36", "43", "46", "4", "null", "12", "24", "26", "30", "null", "null", "35", "39", "42", "44", "null", "48", "3", "9", "null", "14", "22", "null", "null", "27", "null", "null", "null", "null", "38", "null", "41", "null", "null", "null", "47", "49", "null", "null", "5", "null", "13", "15", "21", "23", "null", "28", "37", "null", "null", "null", "null", "null", "null", "null", "null", "8", "null", "null", "null", "17", "19", "null", "null", "null", "null", "null", "null", "null", "7", "null", "16", "null", "null", "20", "6"));

        DeleteNodeInBST deleteNodeInBST = new DeleteNodeInBST();
        TreeNode newRoot = deleteNodeInBST.deleteNode(root, 33);

        StringBuilder sb = new StringBuilder();

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(newRoot);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            sb.append(cur.val);
            sb.append(",");

            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }

        assertEquals("3,2,4,", sb.toString());
    }
}