package com.malcolmcrum.leetcode.minimumdepthofbinarytree

class Solution {
    fun minDepth(root: TreeNode?): Int {
        return when {
            root == null -> 0
            root.left == null && root.right == null -> 1
            root.left == null -> 1 + minDepth(root.right)
            root.right == null -> 1 + minDepth(root.left)
            else -> {
                val leftMin = 1 + minDepth(root.left)
                val rightMin = 1 + minDepth(root.right)
                Math.min(leftMin, rightMin)
            }
        }
    }
}