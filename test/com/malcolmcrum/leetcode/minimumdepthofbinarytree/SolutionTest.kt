package com.malcolmcrum.leetcode.minimumdepthofbinarytree

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun sample() {
        val answer = Solution().minDepth(listOf(3,9,20,null,null,15,7).toTreeNode())
        assertEquals(2, answer)
    }

    @Test
    fun simpler() {
        val answer = Solution().minDepth(listOf(1,2).toTreeNode())
        assertEquals(2, answer)
    }
}

private fun List<Int?>.toTreeNode(): TreeNode? {
    val nodes: List<TreeNode?> = this.map { if (it != null) TreeNode(it) else null }
    (0 until size).forEach {index ->
        nodes[index]?.let {
            it.left = nodes.getOrNull(index*2+1)
            it.right = nodes.getOrNull(index*2+2)
        }
    }
    return nodes[0]
}
