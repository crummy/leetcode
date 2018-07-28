package com.malcolmcrum.leetcode.reverseinteger

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SolutionTest {
    @Test
    fun `sample 1`() {
        val answer = Solution().reverse(123)
        assertEquals(321, answer)
    }

    @Test
    fun `sample 2`() {
        val answer = Solution().reverse(-123)
        assertEquals(-321, answer)
    }

    @Test
    fun `sample 3`() {
        val answer = Solution().reverse(120)
        assertEquals(21, answer)
    }

    @Test
    fun `long number`() {
        val answer = Solution().reverse(1534236469)
        assertEquals(0, answer)
    }
}