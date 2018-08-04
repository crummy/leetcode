package com.malcolmcrum.leetcode.longestcommonprefix

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SolutionTest {
	@Test
	fun `sample 1`() {
		val answer = Solution().longestCommonPrefix(arrayOf("flower", "flow", "flight"))
		assertEquals("fl", answer)
	}

	@Test
	fun `sample 2`() {
		val answer = Solution().longestCommonPrefix(arrayOf("dog","racecar","car"))
		assertEquals("", answer)
	}

	@Test
	fun `sample 3`() {
		val answer = Solution().longestCommonPrefix(arrayOf("","b"))
		assertEquals("", answer)
	}
}