package com.lib.algorithm.tree;

import com.lib.dto.TreeNode;
import com.lib.utils.ElementUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IsBalancedBinaryTreeTest {
    private IsBalancedBinaryTree isBalancedBinaryTree;

    @BeforeEach
    void setUp() {
        isBalancedBinaryTree = new IsBalancedBinaryTree();
    }

    @Test
    void should_return_true_1() {
        TreeNode root = ElementUtils.buildBinaryTree("[3,9,20,null,null,15,7]");

        assertTrue(isBalancedBinaryTree.isBalanced(root));
    }

    @Test
    void should_return_false_1() {
        TreeNode root = ElementUtils.buildBinaryTree("[1,2,2,3,3,null,null,4,4]");

        assertFalse(isBalancedBinaryTree.isBalanced(root));
    }

    @Disabled
    @Test
    void should_return_false_2() {
        TreeNode root = ElementUtils.buildBinaryTree("[1,2,2,3,null,null,3,4,null,null,4]");

        assertFalse(isBalancedBinaryTree.isBalanced(root));
    }
}