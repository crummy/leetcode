package com.malcolmcrum.leetcode.containerwithmostwater

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
	@Test
	fun sample() {
		val answer = Solution().maxArea(arrayOf(1,8,6,2,5,4,8,3,7).toIntArray())
		assertEquals(49, answer)
	}

	@Test
	fun `two identical value`() {
		val answer = Solution().maxArea(arrayOf(1, 1).toIntArray())
		assertEquals(1, answer)
	}

	@Test
	fun `simple case`() {
		val answer = Solution().maxArea(arrayOf(1, 2).toIntArray())
		assertEquals(1, answer)
	}
}