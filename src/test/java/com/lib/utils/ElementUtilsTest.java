package com.lib.utils;

import com.lib.dto.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.*;

import static com.lib.utils.ElementUtils.buildBinaryTree;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class ElementUtilsTest {
    @Test
    void should_return_1_2_3_4_5() {
        TreeNode root = buildBinaryTree(Arrays.asList("1", "2", "3", "null", "null", "4", "5"));

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        List<String> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res.add(String.valueOf(node.val));
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        assertEquals(Arrays.asList("1", "2", "3", "4", "5"), res);
        assertNotNull(root);
    }

    @Test
    void should_return_1_2_3_4_5_6() {
        TreeNode root = buildBinaryTree(Arrays.asList("1", "2", "3", "null", "null", "4", "5", "6"));

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        List<String> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res.add(String.valueOf(node.val));
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        assertEquals(Arrays.asList("1", "2", "3", "4", "5", "6"), res);
        assertNotNull(root);
        assertEquals(6, root.right.left.left.val);
    }

    @Test
    void should_return_1_2_3_4_5_6_7() {
        TreeNode root = buildBinaryTree(Arrays.asList("1", "2", "3", "null", "null", "4", "5", "6", "null", "null", "7"));

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        List<String> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            res.add(String.valueOf(node.val));
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }

        assertEquals(Arrays.asList("1", "2", "3", "4", "5", "6", "7"), res);
        assertNotNull(root);
        assertEquals(6, root.right.left.left.val);
        assertEquals(7, root.right.right.right.val);
    }
}