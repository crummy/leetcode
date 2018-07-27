package com.malcolmcrum.leetcode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class TwoSumTest {
    private val solution = Solution()

    @Test
    fun sample() {
        val answer = twoSum(listOf(2, 7, 11, 15), 9)
        assertEquals(listOf(0, 1), answer)
    }

    @Test
    fun `more complex`() {
        val answer = twoSum(listOf(2, 11, 7, 15), 9)
        assertEquals(listOf(0, 2), answer)
    }

    @Test
    fun `a wrong direction`() {
        val answer = twoSum(listOf(2, 6, 7, 15), 9)
        assertEquals(listOf(0, 2), answer)
    }

    @Test
    fun `skip the lowest`() {
        val answer = twoSum(listOf(1, 6, 2, 15), 8)
        assertEquals(listOf(1, 2), answer)
    }

    @Test
    fun `big numbers`() {
        val answer = twoSum(listOf(99, 98, 77, 55, 1, 1, 1, 1, 1, 1, 1, 1), 8)
        assertEquals(listOf(4, 5, 6, 7, 8, 9, 10, 11), answer)
    }

    @Test
    fun `negative numbers`() {
		val answer = twoSum(listOf(-1, -2, -3, -4, -5), -8)
		assertEquals(listOf(0, 1, 4), answer)
	}

	@Test
	fun `multiple zeroes add up to zero`() {
		val answer = twoSum(listOf(0, 4, 3, 0), 0)
		assertEquals(listOf(0, 3), answer)
	}

    private fun twoSum(nums: List<Int>, target: Int): List<Int> {
        val answer = solution.twoSum(nums.toIntArray(), target).toList()
        val total = answer.sumBy { nums[it] }
        println("Received $answer for $total")
        assertEquals(target, total)
        return answer
    }
}