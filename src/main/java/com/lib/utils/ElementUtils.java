package com.lib.utils;

public class ElementUtils {
    public static void swap(int[] numbers, int i, int j) {
        int cur = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = cur;
    }

    public static TreeNode buildBinaryTree(String s) {
        List<String> input = convertToStringArray(s);
        return buildBinaryTree(input);
    }


    public static TreeNode buildCompleteBinaryTree(String s) {
        List<String> input = convertToStringArray(s);
        return buildCompleteBinaryTree(input);
    }

    public static TreeNode buildCompleteBinaryTree(List<String> input) {
        if (CollectionUtils.isEmpty(input)) {
            return null;
        }
        if (input.stream().anyMatch(Strings::isEmpty)) {
            throw new IllegalArgumentException("all elements should be a valid integer or string 'null'");
        }

        Map<Integer, TreeNode> nodes = new HashMap<>();
        nodes.put(0, new TreeNode(Integer.parseInt(input.get(0))));
        for (int i = 0; i < input.size(); i++) {
            TreeNode cur = nodes.get(i);

            if (Objects.nonNull(cur)) {
                int leftIndex = 2 * i + 1;
                int rightIndex = leftIndex + 1;
                cur.left = leftIndex > input.size() - 1
                        ?
                        null
                        :
                        "null".equalsIgnoreCase(input.get(leftIndex)) ? null : new TreeNode(Integer.parseInt(input.get(leftIndex)));
                cur.right = rightIndex > input.size() - 1
                        ?
                        null
                        :
                        "null".equalsIgnoreCase(input.get(rightIndex)) ? null : new TreeNode(Integer.parseInt(input.get(rightIndex)));
                nodes.put(leftIndex, cur.left);
                nodes.put(rightIndex, cur.right);
            }
        }

        return nodes.get(0);
    }

    /**
     * 数组中只能为 整数 或 字符串 "null"；当没有子节点时，用字符串 "null" 表示；当父节点为 null 时，忽略
     *
     * @param input
     * @return
     */
    public static TreeNode buildBinaryTree(List<String> input) {
        if (CollectionUtils.isEmpty(input) || input.get(0).equalsIgnoreCase("null")) {
            return null;
        }

        int index = 0;
        int offset = 0;
        int tmpOffSet = 0;
        int maxIndex = input.size() - 1;

        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode root = getTreeNode(input, 0);
        queue.add(root);

        Set<TreeNode> sameDepthNodesLv1Cache = new HashSet<>();
        Set<TreeNode> sameDepthNodesLv2Cache = new HashSet<>();
        sameDepthNodesLv1Cache.add(root);

        while (!queue.isEmpty()) {
            int leftChildIndex = index * 2 + 1;
            int rightChildIndex = leftChildIndex + 1;

            TreeNode node = queue.poll();
            assert node != null;

            // 判断是否同层
            if (sameDepthNodesLv1Cache.contains(node)) {
                sameDepthNodesLv1Cache.remove(node);
                addChildrenToCache2(node, sameDepthNodesLv2Cache);

                // 走完所有同一深度的节点时，将进位加入 偏移量
                if (sameDepthNodesLv1Cache.isEmpty()) {
                    offset = offset + tmpOffSet;
                    tmpOffSet = 0;
                    sameDepthNodesLv1Cache.addAll(sameDepthNodesLv2Cache);
                    sameDepthNodesLv2Cache.clear();
                }
            }

            if (leftChildIndex <= maxIndex) {
                TreeNode leftChild = getTreeNode(input, leftChildIndex - offset);
                node.left = leftChild;
                if (Objects.isNull(leftChild)) {
                    ++tmpOffSet;
                } else {
                    queue.add(leftChild);
                }
            }
            if (rightChildIndex <= maxIndex) {
                TreeNode rightChild = getTreeNode(input, rightChildIndex - offset);
                node.right = rightChild;
                if (Objects.isNull(rightChild)) {
                    ++tmpOffSet;
                } else {
                    queue.add(rightChild);
                }
            }

            ++index;
        }
        return root;
    }

    private static void addChildrenToCache2(TreeNode node, Set<TreeNode> nextLvNodesCache2) {
        if (Objects.nonNull(node.left)) {
            nextLvNodesCache2.add(node.left);
        }
        if (Objects.nonNull(node.right)) {
            nextLvNodesCache2.add(node.right);
        }
    }

    private static TreeNode getTreeNode(List<String> input, int index) {
        String value = input.get(index);
        return value.equalsIgnoreCase("null") ? null : new TreeNode(Integer.parseInt(value));
    }
}
