package com.malcolmcrum.leetcode.twosum

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
		(0 until nums.size).forEach { left ->
			(left + 1 until nums.size).forEach { right ->
				if (nums[left] + nums[right] == target) {
					return listOf(left, right).toIntArray()
				}
			}
		}
		throw Exception("No solution found")
    }
}